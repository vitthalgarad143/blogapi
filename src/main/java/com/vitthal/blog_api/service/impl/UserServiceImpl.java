/**
 * Created By Vitthal Garad
 * Date:05-12-2024
 * Time:17:58
 * Project Name:blog_api
 */


package com.vitthal.blog_api.service.impl;

import com.vitthal.blog_api.dtos.UserDto;
import com.vitthal.blog_api.entities.User;
import com.vitthal.blog_api.exception.ResourceNotFoundException;
import com.vitthal.blog_api.repository.UserRepository;
import com.vitthal.blog_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository

	@Override
	public UserDto createUser(UserDto userDto) {
		User user=userDtoToUser(userDto);
		User savedUser = userRepository.save(user);
		return userToUserDto(savedUser);
	}

	@Override
	public UserDto getUserById(UserDto userDto, Integer id) {

		return null;
	}

	@Override
	public UserDto updateUser(UserDto userDto, Integer id) {
		User user=userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User","id",id));
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		return null;
	}

	@Override
	public void deleteUserById(Integer id) {

	}

	@Override
	public void deleteAllUsers() {

	}

	private User userDtoToUser(UserDto userDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());
		return user;
	}
	private UserDto userToUserDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		userDto.setAbout(user.getAbout());
		return userDto;
	}


}
