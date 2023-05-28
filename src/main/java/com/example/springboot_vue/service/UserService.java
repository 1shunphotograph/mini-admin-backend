package com.example.springboot_vue.service;

import com.example.springboot_vue.entity.User;
import com.example.springboot_vue.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

        public List<User> findAll() {
            return userMapper.findAll();
        }


}
