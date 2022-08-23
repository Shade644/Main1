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
ActorsRepo actorsrepo;

@GetMapping("/")
    public ModelAndView showData(){
        ModelAndView mv =new ModelAndView("Film");
        mv.addObject("test",repo.findAll());
        mv.setViewName("glowna.html");
        return mv;
}

    @RequestMapping("/Strona")
    public ModelAndView Strona(){
        ModelAndView mv =new ModelAndView("Film");

        mv.addObject("test",repo.findAll());
        mv.setViewName("Strona.html");

        return mv;

    }
    @RequestMapping("/saveData")
    public ModelAndView saveData(Film film){
    repo.save(film);

        ModelAndView mv =new ModelAndView("Film");

        mv.addObject("test",repo.findAll());
        mv.setViewName("glowna.html");

        return mv;
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("tytul") String tytul){
    repo.deleteBytytul(tytul);
        return "Update.html";
    }

    @RequestMapping("/update")
    public String update(Film film){
    Film updateFilm = repo.findById(film.getId());
        updateFilm.setTytul(film.getTytul());
    updateFilm.setKategoria(film.getKategoria());
    updateFilm.setOcena(film.getOcena());
    updateFilm.setData(film.getData());
    repo.save(updateFilm);


        return "update.html";
    }

}