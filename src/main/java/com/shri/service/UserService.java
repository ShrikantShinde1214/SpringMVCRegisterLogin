package com.shri.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.shri.model.User;
import com.shri.dto.UserRegistrationDto;
	public interface UserService extends UserDetailsService{
		User save(UserRegistrationDto registrationDto);
	}
	
