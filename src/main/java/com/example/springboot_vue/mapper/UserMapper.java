package com.example.springboot_vue.mapper;

import com.example.springboot_vue.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from tb_user")
    List<User> findAll();
    @Select("SELECT * FROM tb_user WHERE id = #{id}")
    User getUserById(int id);

    @Insert("INSERT INTO tb_user (id, name, age, gender, tel, address) VALUES (#{id}, #{name}, #{age}, #{gender}, #{tel}, #{address})")
    void insertUser(User user);

    @Update("UPDATE tb_user SET name = #{name}, age = #{age}, gender = #{gender}, tel = #{tel}, address = #{address}, WHERE id = #{id}")
    void updateUser(User user);

    @Delete("DELETE FROM tb_user WHERE id = #{id}")
    void deleteUserById(int id);
}
