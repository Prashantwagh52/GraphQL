package com.prashant.graphql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prashant.graphql.entity.User;
import com.prashant.graphql.exception.ExceptionHandler;
import com.prashant.graphql.repository.UserRepository;

@Service
public class UserService implements IUser {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUSer() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(int userId) {
		return userRepository.findById(userId).orElseThrow(ExceptionHandler::throwResourceNotFoundException);
	}

	@Override
	public boolean deleteUser(int userid) {
		User user = userRepository.findById(userid).orElseThrow(ExceptionHandler::throwResourceNotFoundException);
		userRepository.delete(user);
		return true;
	}

}
