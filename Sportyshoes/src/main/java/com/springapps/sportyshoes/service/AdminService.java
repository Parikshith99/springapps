package com.springapps.sportyshoes.service;


import com.springapps.sportyshoes.entity.Admin;

public interface AdminService {
	void update(Admin admin);
	Admin get(int adminid);
}
