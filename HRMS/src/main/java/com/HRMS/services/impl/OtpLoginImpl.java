package com.HRMS.services.impl;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.dao.OtpLoginDAO;
import com.HRMS.model.OtpLoginMaster;
import com.HRMS.services.OtpLoginService;

@Service
public class OtpLoginImpl implements OtpLoginService {

	@Autowired
	private OtpLoginDAO otpLoginDAO;

	@Override
	public boolean saveotp(String username, int otp) {

		OtpLoginMaster findByusername = otpLoginDAO.findByUsername(username);
		if (findByusername != null) {
			return false;
		} else {
			OtpLoginMaster otpmaster = new OtpLoginMaster();
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());

			otpmaster.setUsername(username);
			otpmaster.setPin(otp);
			otpmaster.setTs(timestamp);

			this.otpLoginDAO.save(otpmaster);

			return true;
		}
	}

	@Override
	public boolean checkotp(OtpLoginMaster otpmaster) {
		
		OtpLoginMaster otplogin = otpLoginDAO.findByUsername(otpmaster.getUsername());
		
		if(otplogin==null)
		{
			return false;
		}
		
		if(otplogin.getUsername().equals(otpmaster.getUsername()) && otplogin.getPin()==otpmaster.getPin())
		{
			return true;
		}
		
		return false;
		
	}

}
