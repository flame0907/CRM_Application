package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dto.ForgotPass;
import com.dto.Login;
import com.dto.Response;
import com.dto.Registration;
import com.service.ActorService;


@RestController
@RequestMapping("/crm.technothinksup.in/admin")
@CrossOrigin("*") // Allow cross-origin requests from all domains
public class userController {

	@Autowired
	private ActorService userService; // Service layer for handling user-related business logic

	
	@PostMapping("/register")
	public String register(@RequestBody Registration request) {
		return userService.register(request);
	}

	
	@PostMapping("/login")
	public Response login(@RequestBody Login request) {
		return userService.login(request);
	}

	
	@PostMapping("/forgot-password")
	public String forgotPassword(@RequestBody ForgotPass request) {
		return userService.forgotPassword(request);
	}

	
	@PostMapping("/reset-password")
	public String resetPassword(@RequestParam String resetToken, @RequestParam String newPassword) {
		return userService.resetPassword(resetToken, newPassword);
	}
}
