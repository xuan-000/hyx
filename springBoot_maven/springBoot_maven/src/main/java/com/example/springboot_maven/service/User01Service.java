package com.example.springboot_maven.service;

import com.example.springboot_maven.pojo.User;

import java.util.List;

public interface User01Service {

    User getUserById(int id);


    List<User> getAllUser();

     int addUser(User user);

     int updateUser(User user);
     int deleteUser(int id);
}
