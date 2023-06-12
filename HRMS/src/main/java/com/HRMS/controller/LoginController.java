package com.HRMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.HRMS.model.LoginMaster;
import com.HRMS.services.LoginService;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {

	@Autowired
	private LoginService loginservice;
	
	@GetMapping("/login")
	public List<LoginMaster> getalllogins()
	{
		List<LoginMaster> getalllogins = this.loginservice.getalllogins();
		return getalllogins;
	}
	
	@PostMapping("/addlogin")
	public LoginMaster addlogin(@RequestBody LoginMaster login)
	{
		LoginMaster addlogin = this.loginservice.addlogin(login);
		return addlogin;
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<LoginMaster> logincheck(@RequestBody LoginMaster login)
	{
		//for login checking
		LoginMaster logincheck = null;
		try
		{
			logincheck=this.loginservice.logincheck(login);
			if(logincheck!=null)
			{
				return ResponseEntity.status(HttpStatus.ACCEPTED).body(logincheck);
			}
			
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(logincheck);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(logincheck);
			
		}
		
		
	}

}
