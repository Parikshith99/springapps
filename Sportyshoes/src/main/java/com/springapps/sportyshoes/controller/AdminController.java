package com.springapps.sportyshoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springapps.sportyshoes.entity.Admin;
import com.springapps.sportyshoes.service.AdminService;

@Controller
public class AdminController {
	@Autowired
	AdminService adminService;

	@RequestMapping("/adminloggedin")
	public String adminloggedin(@ModelAttribute("admin") Admin admin, ModelMap model) {
		Admin adminnfo = adminService.get(admin.getAdminid());
		if (adminnfo != null) {
			if (adminnfo.getAdminid() == admin.getAdminid() && adminnfo.getUsername().equals(admin.getUsername())
					&& adminnfo.getPassword().equals(admin.getPassword())) {
				return "adminloggedin";
			}
		}
		model.addAttribute("fail", "Admin login failed!!");
		return "adminlogin";
	}

	@RequestMapping("/AdminLoggin")
	public String AdminLoggin() {
		return "adminloggedin";
	}

	@RequestMapping("/addProductListOne")
	public String addProductListOne() {
		return "addProductListOne";
	}

	@RequestMapping("/changepassword")
	public String ChangePassword() {
		return "changepassword";
	}

	@RequestMapping("/newPassword")
	public String NewPassword(@ModelAttribute("admin") Admin admin, ModelMap model) {
		Admin adminnfo = adminService.get(admin.getAdminid());

		if (adminnfo != null) {
			adminService.update(admin);
			model.addAttribute("newpass", "Password Changed Successfully");
			return "changepassword";
		}
		model.addAttribute("passwordfailure", "Enter correct details!!");
		return "changepassword";
	}

}
