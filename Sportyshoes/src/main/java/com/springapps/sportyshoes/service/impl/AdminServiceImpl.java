package com.springapps.sportyshoes.service.impl;


import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapps.sportyshoes.dao.AdminDao;
import com.springapps.sportyshoes.entity.Admin;
import com.springapps.sportyshoes.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;

	@Override
	@Transactional
	public void update(Admin admin) {
		adminDao.update(admin);

	}

	@Override
	public Admin get(int adminid) {
		Admin admin = adminDao.findAdmin(adminid);
		return admin;
	}

}
