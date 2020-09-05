package com.prasun.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.prasun.flightreservation.entities.User;
import com.prasun.flightreservation.repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepo;

	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		return "login/userRegister";
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String register(@ModelAttribute("user") User user) {
		userRepo.save(user);
		return "login/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("email")String email,@RequestParam("password") String password, Model model) {
		User user=userRepo.findByEmail(email);
		if(user.getPassword().equals(password)) {
			return "findFlights";
		}
		else {
			model.addAttribute("msg", "invalid user name or password . Please try again");
		}
		return "login/login";
		
	}
}
