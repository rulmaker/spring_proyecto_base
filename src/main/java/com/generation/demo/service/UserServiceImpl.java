package com.generation.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.demo.model.User;
import com.generation.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	
	public UserServiceImpl(@Autowired UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User getUser(Integer userId) {
		Optional<User> user = userRepository.findById(userId);
		return user.orElse(null);
	}

	@Override
	public List<User> getUsers() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public void delete(Integer userId) {
		userRepository.deleteById(userId);
	}

	@Override
	public User update(User user) {
		return userRepository.save(user);
	}

}
