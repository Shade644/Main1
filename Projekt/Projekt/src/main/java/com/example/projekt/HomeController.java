package com.example.projekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
@Autowired
FilmRepo repo;
    @RequestMapping("/Strona")
    public String Strona(){
        return "Strona.html";
    }
    @RequestMapping("/saveData")
    @ResponseBody
    public String saveData(Film film){
    repo.save(film);
        return "Success";
    }
}