package com.Prograd.SpringDemoApplication.Controller;

import com.Prograd.SpringDemoApplication.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {
    @GetMapping("/student")
    public /*ArrayList<Student>*/ Student submit(@RequestParam String s1,@RequestParam String s2)
    {
//        ArrayList<Student> a=new ArrayList<>();
//        a.add(new Student("Shivam","Tiwari"));
//        a.add(new Student("Raj","Verma"));
//        a.add(new Student("Hari","Sharma"));
//        a.add(new Student("Shubham","Verma"));
//        a.add(new Student("Harry","Watson"));
//        return a;
    return new Student(s1,s2);
    }
}
