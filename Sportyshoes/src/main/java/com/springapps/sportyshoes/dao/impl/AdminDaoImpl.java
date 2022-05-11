package com.springapps.sportyshoes.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springapps.sportyshoes.dao.AdminDao;
import com.springapps.sportyshoes.entity.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void update(Admin admin) {
		this.hibernateTemplate.update(admin);
	}

	@Override
	public Admin findAdmin(int adminid) {
		Admin admin = this.hibernateTemplate.get(Admin.class,adminid);
		return admin;
	}

}
