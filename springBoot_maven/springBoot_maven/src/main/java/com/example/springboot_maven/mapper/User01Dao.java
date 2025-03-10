package com.example.springboot_maven.mapper;

import com.example.springboot_maven.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface User01Dao {

    @Select("select * from user where id = #{id}")
    User getUserById(int id);
    @Select("select * from user")
    List<User> getAllUser();

    @Insert("INSERT INTO user (username, password) VALUES (#{username}, #{password})")
    int addUser(User user);

    @Update("UPDATE user SET username=#{username},password=#{password} WHERE id=#{id}")
    int updateUser(User user);
    @Delete("DELETE FROM user WHERE id=#{id}")
    int deleteUser(int id);
}
