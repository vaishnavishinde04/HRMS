package com.HRMS.services;

import java.util.List;

import com.HRMS.model.LoginMaster;

public interface LoginService {

	List<LoginMaster> getalllogins();

	LoginMaster logincheck(LoginMaster login);

	LoginMaster addlogin(LoginMaster login);

}
