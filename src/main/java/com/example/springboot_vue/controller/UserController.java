package com.example.springboot_vue.controller;


import com.example.springboot_vue.entity.User;
import com.example.springboot_vue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping ("/all")
    public List<User> findAll(){
        return userService.findAll();
    }
    @GetMapping ("/id")
    public User getUserById(int id) {
        return userService.getUserById(id);
    }
    @PostMapping("/add")
    public void insertUser(User user) {
        userService.insertUser(user);
    }
    @PutMapping("/update")
    public void updateUser(User user) {
        userService.updateUser(user);
    }
    @DeleteMapping("/id")
    public void deleteUserById(int id) {
        userService.deleteUserById(id);
    }

}
