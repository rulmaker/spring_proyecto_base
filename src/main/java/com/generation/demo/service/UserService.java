package com.generation.demo.service;

import java.util.List;

import com.generation.demo.model.User;

public interface UserService {
	
	User getUser(Integer userId);
	
	List<User> getUsers();
	
	User save(User user);
	
	void delete(Integer userId);
	
	User update(User user);

}
