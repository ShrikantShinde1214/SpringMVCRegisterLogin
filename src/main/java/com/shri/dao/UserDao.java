package com.shri.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shri.model.User;	
	@Repository
	public interface UserDao extends JpaRepository<User, Long>{
		User findByEmail(String email);
	}

