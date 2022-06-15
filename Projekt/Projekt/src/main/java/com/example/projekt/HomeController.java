package com.example.projekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
@Autowired
FilmRepo repo;

@GetMapping("/")
    public ModelAndView showData(){
        ModelAndView mv =new ModelAndView("Film");

        //Iterable<Film> datalist =repo.findAll("Film");
        mv.addObject("test",repo.findAll());
        mv.setViewName("glowna.html");

        return mv;
    }

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