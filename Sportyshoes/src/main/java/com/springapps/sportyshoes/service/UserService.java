package com.springapps.sportyshoes.service;

import java.util.List;

import com.springapps.sportyshoes.entity.User;

public interface UserService {
	int save(User user);
	List<User> getUserForLogin(String name,String password);
	List<User> getUserForRegister(String email);
	List<User> getUsers();
	List<User> searchUsers(String name);
}
