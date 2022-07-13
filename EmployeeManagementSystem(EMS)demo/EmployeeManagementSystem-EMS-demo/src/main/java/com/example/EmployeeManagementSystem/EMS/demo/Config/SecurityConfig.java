package com.example.EmployeeManagementSystem.EMS.demo.Config;

import com.example.EmployeeManagementSystem.EMS.demo.Security.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    EmployeeDetails employeeDetails;


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeHttpRequests().
    antMatchers("/api/employee/create").hasAnyRole("USER","ADMIN").
                antMatchers("/api/asset/create").hasAnyRole("ADMIN").
                antMatchers("/api/organisation/create").hasAnyRole("ADMIN").
                antMatchers("/api/employee/{id}").hasAnyRole("ADMIN","USER").
                antMatchers("/api/**/delete/**").hasAnyRole("ADMIN").
    antMatchers("/api/**/all").hasAnyRole("ADMIN").
    antMatchers("/api/**/update/**").hasAnyRole("ADMIN").anyRequest().authenticated().and().httpBasic().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth)throws Exception{
        auth.userDetailsService(this.employeeDetails).passwordEncoder(passwordEncoder());
    }
    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
}