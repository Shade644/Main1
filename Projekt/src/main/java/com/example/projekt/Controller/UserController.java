package com.example.projekt.Controller;

import com.example.projekt.model.User;
import com.example.projekt.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
