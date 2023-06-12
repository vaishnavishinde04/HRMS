package com.HRMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.HRMS.model.OtpLoginMaster;
import com.HRMS.services.OtpLoginService;

@RestController
@CrossOrigin(origins = "*")
public class OtpLoginController {

	@Autowired
	private OtpLoginService otpLoginService;
	
	
	//this is to save otp in database
	//euuu
	public void OtpSave(String username,int otp)
	{
		this.otpLoginService.saveotp(username,otp);
	}
	
	@PostMapping("/otpverification")
	public ResponseEntity<Boolean> otpcheck(@RequestBody OtpLoginMaster otpmaster)
	{
		boolean checkotp = false;
		checkotp = this.otpLoginService.checkotp(otpmaster);
		
		if(checkotp!=false)
		{
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(checkotp);
		}
				
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(checkotp);
	}

}
