package com.example.projekt.Controller;

import com.example.projekt.model.Director;
import com.example.projekt.repo.DirectorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DirectorController {
@Autowired
DirectorRepo directorRepo;

    @GetMapping("/rezyser")
    public ModelAndView showDirector(){
        ModelAndView mv =new ModelAndView("Director");

        mv.addObject("test3",directorRepo.findAll());
        mv.setViewName("rezyser.html");

        return mv;
    }

    @RequestMapping("/saveRez")
    public ModelAndView saveData(Director director){
        directorRepo.save(director);

        ModelAndView mv =new ModelAndView("Actors");

        mv.addObject("test3",directorRepo.findAll());
        mv.setViewName("rezyser.html");

        return mv;
    }



}