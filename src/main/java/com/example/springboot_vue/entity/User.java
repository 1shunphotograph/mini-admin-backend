package com.example.springboot_vue.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private  String name;
    private  String gender;
    private Long age;
    private  Long tel;
    private  String address;

}
