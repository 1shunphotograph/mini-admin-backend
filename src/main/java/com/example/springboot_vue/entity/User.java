package com.example.springboot_vue.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private  String name;
    private Long age;
    private  String gender;
    private  Long tel;

}
