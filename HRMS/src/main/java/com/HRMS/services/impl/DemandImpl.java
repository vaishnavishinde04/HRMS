package com.HRMS.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.dao.DemandDAO;
import com.HRMS.model.DemandMaster;
import com.HRMS.services.DemandService;

@Service
public class DemandImpl implements DemandService{
	
	private static final Logger logger = LoggerFactory.getLogger(DemandImpl.class);
	
	@Autowired DemandDAO demandDAO;

	@Override
	public List<DemandMaster> getAllDemands() {
		
		try {
			 return (List<DemandMaster>) demandDAO.findAll();
		} catch (Exception e) {
			logger.error("Error getting all demands: {}", e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Failed to get all demands", e);
			
		}
	}

	@Override
	public DemandMaster getDemandById(int id) {
		try {
			DemandMaster demand = demandDAO.findById(id);
	        if (demand != null) {
	            return demand;
	        }
	        return null;
		} catch (Exception e) {
			logger.error("Error getting demand with ID {}: {}", id, e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Failed to get demand by ID", e);
		}
	}

	@Override
	public DemandMaster addDemand(DemandMaster demand) {
		try {
			return demandDAO.save(demand);
		} catch (Exception e) {
			logger.error("Error saving deamnd: {}", e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Failed to save demand", e);
		}
	}

	@Override
	public DemandMaster updateDemand(DemandMaster demand) {
		try {
			return demandDAO.save(demand);
		} catch (Exception e) {
			logger.error("Error saving demand: {}", e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Failed to save demand", e);
		}
	}

	@Override
	public void deleteDemand(int id) {
		try {
			this.demandDAO.deleteById(id);
		} catch (Exception e) {
			logger.error("Error deleting demand with id " + id, e);
			e.printStackTrace();
			throw new RuntimeException("Error deleting demand with id " + id, e);
		}
		
	}

}
