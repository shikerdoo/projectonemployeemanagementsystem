package com.Prograd.SpringDemoApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sumController {
@GetMapping("/hi")
    public int sum()
{
    return 2+3;//same multiply 2*3
}
}
