package com.springapps.sportyshoes.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springapps.sportyshoes.dao.UserDao;
import com.springapps.sportyshoes.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public int create(User user) {
		return (int) this.hibernateTemplate.save(user);
	}

	@Override
	public List<User> findUserForRegister(String email) {
	 List<User> user = (List<User>) hibernateTemplate.find("from User where email=?0", new Object[]{email});
		return  user;
		
	}

	@Override
	public List<User> findUsers() {
		 List<User> users = hibernateTemplate.loadAll(User.class);
		return users;
	}

	@Override
	public List<User> findUserForLogin(String name, String password) {
		 List<User> user = (List<User>) hibernateTemplate.find("from User where name=?0 and password=?1", new Object[]{name,password});
			return  user;
	}

	@Override
	public List<User> searchUsers(String name) {
		 List<User> users = (List<User>) hibernateTemplate.find("from User where name=?0", new Object[]{name});
		return users;
	}

	



	}
