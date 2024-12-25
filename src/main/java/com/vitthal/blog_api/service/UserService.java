package com.vitthal.blog_api.service;

import com.vitthal.blog_api.dtos.UserDto;
import com.vitthal.blog_api.entities.User;

import java.util.List;

public interface UserService {
    public UserDto createUser(UserDto userDto);
    public UserDto getUserById(UserDto userDto,Integer id);
    public UserDto updateUser(UserDto userDto,Integer id);
    public List<UserDto> getAllUsers();

    public void deleteUserById(Integer id);

    public void deleteAllUsers();
}
