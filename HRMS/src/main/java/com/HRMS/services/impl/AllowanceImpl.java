package com.HRMS.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.dao.AllowanceDAO;
import com.HRMS.model.AllowanceMaster;
import com.HRMS.services.AllowanceService;

@Service
public class AllowanceImpl implements AllowanceService {

	private static final Logger logger = LoggerFactory.getLogger(AllowanceImpl.class);

	
	@Autowired
	private AllowanceDAO allowancedao;

	@Override
	public List<AllowanceMaster> getAllAllowances() {
		try {
			 return (List<AllowanceMaster>) allowancedao.findAll();
		} catch (Exception e) {
			logger.error("Error getting all allowances: {}", e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Failed to get all allowances", e);
			
		}
	}

	@Override
	public AllowanceMaster getAllowanceById(int allowanceid) {
		
		try {
			AllowanceMaster allowance = allowancedao.findById(allowanceid);
	        if (allowance != null) {
	            return allowance;
	        }
	        return null;
		} catch (Exception e) {
			logger.error("Error getting allowance with ID {}: {}", allowanceid, e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Failed to get allowance by ID", e);
		}
		
	}

	@Override
	public AllowanceMaster addAllowance(AllowanceMaster allowance) {
		try {
			return allowancedao.save(allowance);
		} catch (Exception e) {
			logger.error("Error saving allowance: {}", e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Failed to save allowance", e);
		}
	}

	
	@Override
	public AllowanceMaster updateAllowance(AllowanceMaster allowance) {
		try {
			return allowancedao.save(allowance);
		} catch (Exception e) {
			logger.error("Error saving allowance: {}", e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Failed to save allowance", e);
		}
	}

	@Override
	public void deleteAllowance(int allowanceId) {
		try {
			this.allowancedao.deleteById(allowanceId);
		} catch (Exception e) {
			logger.error("Error deleting allowance with id " + allowanceId, e);
			e.printStackTrace();
			throw new RuntimeException("Error deleting allowance with id " + allowanceId, e);
		}
		
	}
}

