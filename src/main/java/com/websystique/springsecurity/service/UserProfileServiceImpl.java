package com.websystique.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springsecurity.dao.UserProfileDaoImpl;
import com.websystique.springsecurity.model.UserProfile;

@Service("UserProfileServiceImpl")
@Transactional
public class UserProfileServiceImpl {
	
	@Autowired
	UserProfileDaoImpl dao;
	
	public List<UserProfile> findAll() {
		return dao.findAll();
	}

	public UserProfile findByType(String type){
		return dao.findByType(type);
	}

	public UserProfile findById(int id) {
		return dao.findById(id);
	}
}
