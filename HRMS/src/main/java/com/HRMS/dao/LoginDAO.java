package com.HRMS.dao;

import org.springframework.data.repository.CrudRepository;

import com.HRMS.model.LoginMaster;

public interface LoginDAO extends CrudRepository<LoginMaster, Integer>{

	public LoginMaster findByusername(String username);
	
	public LoginMaster findById(int userid);

}
