package com.springapps.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springapps.sportyshoes.entity.Product;
import com.springapps.sportyshoes.entity.User;
import com.springapps.sportyshoes.service.UserService;
import com.springapps.sportyshoes.service.productService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@Autowired
	productService productservice;

	@RequestMapping(value = "/registeruser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user,@RequestParam("verifypassword") String verifypassword, ModelMap model) {
		if(user.getPassword().equals(verifypassword)) {
		List<User> check = userService.getUserForRegister(user.getEmail());
		if (check.size() >= 1) {
			model.addAttribute("failure", "User with this email Already Present!!");
			return "userreg";
		}

		int userid = userService.save(user);
		String message = "Registration Successfull!!";
		boolean login = true;
		model.addAttribute("result", message);
		model.addAttribute("login", login);
		model.addAttribute("userid", userid);
		return "userreg";
		}
		model.addAttribute("failure", "Enter correct password");
		return "userreg";
	
	}

	@RequestMapping("/login")
	public String loginUser(ModelMap m) {
		return "login";
	}

	@RequestMapping("/productsList")
	public String products(ModelMap m) {
		List<Product> products = productservice.getProducts();
		m.addAttribute("Products", products);
		System.out.println(products);
		return "product";
	}
	@RequestMapping(value = "/loginuser", method = RequestMethod.POST)
	public String registerUser(@RequestParam("name") String name, @RequestParam("password") String password,
			ModelMap m) {
		List<User> user = userService.getUserForLogin(name, password);
		if (user.isEmpty()) {
			m.addAttribute("failure", "login failed!!...");
			return "login";
		}

		else if (user.get(0).getName().equals(name) && user.get(0).getPassword().equals(password)) {
			
			return "redirect:/productsList";
		}
		return "login";
	}

	@RequestMapping("/showusers")
	public String showusers(ModelMap m) {
		List<User> users = userService.getUsers();
		m.addAttribute("userslist", users);
		System.out.println(users);
		return "showusers";
	}
	
	@RequestMapping("/searchUsers")
	public String searchUser(@RequestParam("name") String name,ModelMap m) {
		List<User> users = userService.searchUsers(name);
		List<User> Allusers = userService.getUsers();
		if (users.size() >= 1) {
			
			m.addAttribute("userslist", Allusers);
			
			
			m.addAttribute("result", users);
			System.out.println("inside serachusers");
			System.out.println(users);
			boolean userpresent = true;
			m.addAttribute("userpresent", userpresent);
			return "showusers";
		}
		return "redirect:/showusers";
		
		
	}
}
