package com.springapps.sportyshoes.dao;

import java.util.List;

import com.springapps.sportyshoes.entity.User;

public interface UserDao {
	int create(User user);

	List<User> findUserForRegister(String email);
	List<User> findUsers();
	List<User> findUserForLogin(String name, String password);

	List<User> searchUsers(String name);
}
