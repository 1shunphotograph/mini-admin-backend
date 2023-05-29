package com.example.springboot_vue.mapper;

import com.example.springboot_vue.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from tb_user where 1=1")
    List<User> findAll();

    @Select("select * from tb_user where id = #{id}")
    List<User> getUserById(@Param("id") int id);

    @Insert("insert into tb_user (id, name, age, gender, tel) values (#{id}, #{name}, #{age}, #{gender}, #{tel})")
    void insertUser(User user);

    @Update("update tb_user set name = #{name}, age = #{age}, gender = #{gender}, tel = #{tel} where id = #{id}")
    Integer updateUser(User user);

    @Delete("delete from tb_user where id = #{id}")
    void deleteUserById(int id);
}
