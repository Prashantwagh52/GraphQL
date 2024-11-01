package com.prashant.graphql.service;

import java.util.List;

import com.prashant.graphql.entity.User;

public interface IUser {

	public User createUser(User user);

	public List<User> getAllUSer();

	public User getUser(int userId);

	public boolean deleteUser(int userid);
}
