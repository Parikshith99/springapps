package com.springapps.sportyshoes.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapps.sportyshoes.dao.UserDao;
import com.springapps.sportyshoes.entity.User;
import com.springapps.sportyshoes.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public int save(User user) {
		return userDao.create(user);
	}

	@Override
	public List<User> getUserForRegister(String email) {
		List<User> user = userDao.findUserForRegister(email);
		return user;
	}


	@Override
	public List<User> getUsers() {
		List<User> user = (List<User>) userDao.findUsers();
		return user;
	}

	@Override
	public List<User> getUserForLogin(String name, String password) {
		List<User> user = userDao.findUserForLogin(name,password);
		return user;
	}

	@Override
	public List<User> searchUsers(String name) {
		List<User> users = (List<User>) userDao.searchUsers(name);
		return users;
	}

	

}
