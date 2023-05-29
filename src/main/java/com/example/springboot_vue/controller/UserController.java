package com.example.springboot_vue.controller;


import com.example.springboot_vue.entity.User;
import com.example.springboot_vue.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    String message = "";
    @GetMapping ("/all")
    public List<User> findAll(){
        return userService.findAll();
    }
    @GetMapping ("/id")
    public List<User> getUserById(@Param("id") int id) {
        return userService.getUserById(id);
    }
    @PostMapping("/add")
    public void insertUser(User user) {
        userService.insertUser(user);
    }
    @PutMapping("/update")
    public String updateUser(@RequestBody User user) {
        userService.updateUser(user);
        try {
            message = userService.updateUser(user) == 1?"更新用户成功":"用户不存在，更新失败";
        }catch (Exception exception){
            message = "更新异常";
        }
        return message;
    }
    @DeleteMapping("/id")
    public void deleteUserById(@Param("id") int id) {
        userService.deleteUserById(id);
    }

}
