package com.example.projekt.Controller;

import com.example.projekt.model.Actors;
import com.example.projekt.repo.ActorsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ActorsController {
@Autowired
ActorsRepo actorsrepo;
    @GetMapping("/actors")
    public ModelAndView showActor(){
        ModelAndView mv =new ModelAndView("Actors");

        mv.addObject("test2",actorsrepo.findAll());
        mv.setViewName("actors.html");

        return mv;
    }

    @RequestMapping("/Stronaa")
    public ModelAndView Strona(){
        ModelAndView mv =new ModelAndView("Actors");

        mv.addObject("test2",actorsrepo.findAll());
        mv.setViewName("DodanoAct.html");

        return mv;

    }
    @RequestMapping("/saveActor")
    public ModelAndView saveData(Actors actors){
        actorsrepo.save(actors);

        ModelAndView mv =new ModelAndView("Actors");

        mv.addObject("test2",actorsrepo.findAll());
        mv.setViewName("actors.html");

        return mv;
    }

    @RequestMapping("/deleteActor")
    public String delete(@RequestParam("imie") String imie){
        actorsrepo.deleteByimie(imie);
        return "Update.html";
    }


}