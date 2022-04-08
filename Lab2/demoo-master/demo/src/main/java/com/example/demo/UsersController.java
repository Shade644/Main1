package com.example.demo;


import com.example.demo.model.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

@RestController
public class UsersController {
    private Map<Integer, UserEntity> users = new HashMap<Integer,UserEntity>();

    @GetMapping("/users")
    Map<Integer, UserEntity> getUsers() {
        return users;
    }

    @GetMapping("/users/{id}/get")
    UserEntity getUser(@PathVariable("id") int id) {
        return users.get(id);
    }

}