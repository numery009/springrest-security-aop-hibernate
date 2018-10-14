package com.springdemo.service;

import com.springdemo.entity.CrmUser;
import com.springdemo.entity.User;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	User findByUserName(String userName);

	void save(CrmUser crmUser);
}
