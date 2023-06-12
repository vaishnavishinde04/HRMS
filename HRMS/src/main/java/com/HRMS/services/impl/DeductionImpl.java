package com.HRMS.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.dao.DeductionDAO;
import com.HRMS.model.DeductionMaster;
import com.HRMS.services.DeductionService;

@Service
public class DeductionImpl implements DeductionService {

	private static final Logger log = LoggerFactory.getLogger(DeductionImpl.class);

	@Autowired
	private DeductionDAO deductiondao;

	@Override
	public List<DeductionMaster> getAllDeduction() {
		try {
			return (List<DeductionMaster>) deductiondao.findAll();
		} catch (Exception e) {
			log.error("Error getting all Deduction", e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Error getting All Deduction", e);
		}

	}

	@Override
	public DeductionMaster getDeductionById(int deductionId) {

		try {
			DeductionMaster findById = deductiondao.findById(deductionId);
			if (findById != null) {
				return findById;
			}
			return null;
		} catch (Exception e) {
			log.error("Error Getting Deduction with id" + deductionId, e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Error Getting Deduction with id" + deductionId, e);
		}

	}

	@Override
	public DeductionMaster addDeduction(DeductionMaster deduction) {
		try {
			return deductiondao.save(deduction);
		} catch (Exception e) {
			log.error("Error Adding Deduction", e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Error While Saving Deduction", e);
		}

	}

	@Override
	public DeductionMaster updateDeduction(DeductionMaster deduction) {

		try {
			return deductiondao.save(deduction);
		} catch (Exception e) {
			log.error("Error Updating Deduction", e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Error While Updating Deduction", e);
		}

	}

	@Override
	public void deleteDeduction(int deductionId) {
		try {
			deductiondao.deleteById(deductionId);
		} catch (Exception e) {
			log.error("Error deleting Deduction with id " + deductionId, e);
			e.printStackTrace();
			throw new RuntimeException("Error deleting Deduction with id " + deductionId, e);
		}

	}

}
