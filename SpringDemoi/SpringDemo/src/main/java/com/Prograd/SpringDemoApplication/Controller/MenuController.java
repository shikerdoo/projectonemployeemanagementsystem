package com.Prograd.SpringDemoApplication.Controller;

import com.Prograd.SpringDemoApplication.MenuItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MenuController {
    @GetMapping("/menui")
    public ArrayList<MenuItem> submiti()
    {
        ArrayList<MenuItem> a=new ArrayList<>();
        a.add(new MenuItem(1,"Red"));
        a.add(new MenuItem(2,"Blue"));
        a.add(new MenuItem(3,"Pink"));
        a.add(new MenuItem(4,"Orange"));
        a.add(new MenuItem(5,"White"));
        return a;
    }
}
