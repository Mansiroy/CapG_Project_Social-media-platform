package com.cg.service;

import java.util.List;

import com.cg.dto.UserDto;

public interface UserService {

    // first two are default method of jpa
    UserDto getUserById(Integer userId);
    List<UserDto> getAllUsers();

    // custom api
    UserDto getUserByUsername(String username);
    UserDto getUserByEmail(String email);
}