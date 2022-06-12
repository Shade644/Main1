package com.example.projekt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @RequestMapping("/Strona")
    public String Strona(){
        return "Strona.html";
    }
}