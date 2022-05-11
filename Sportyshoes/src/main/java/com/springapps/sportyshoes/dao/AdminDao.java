package com.springapps.sportyshoes.dao;


import com.springapps.sportyshoes.entity.Admin;

public interface AdminDao {
	void update(Admin admin);

	Admin findAdmin(int adminid);
}
