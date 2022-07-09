package com.example.projekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    UserRepo userrep;

    @GetMapping("/rejestracja")
    public String rejestracja(User user){
        return "rejestracja";
    }

    @RequestMapping("/saveUser")
    public String saveData(User user){
        userrep.save(user);
        return "glowna.html";
    }


}