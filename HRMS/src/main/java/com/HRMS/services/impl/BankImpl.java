package com.HRMS.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.dao.BankDAO;
import com.HRMS.model.BankMaster;
import com.HRMS.services.BankService;

@Service
public class BankImpl implements BankService {

	private static final Logger log = LoggerFactory.getLogger(BankImpl.class);

	@Autowired
	private BankDAO bankdao;

	@Override
	public List<BankMaster> getAllBanks() {
		try {
			return (List<BankMaster>) this.bankdao.findAll();
		} catch (Exception e) {
			log.error("Error getting all Banks");
			e.printStackTrace();
			throw new RuntimeException("Error getting All Banks", e);
		}

	}

	@Override
	public BankMaster getBankById(int bank_id) {
		try {
			BankMaster findById = this.bankdao.findById(bank_id);
			if (findById != null) {
				return findById;
			}
			return null;
		} catch (Exception e) {
			log.error("Error Getting Bank with id" + bank_id, e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Error Getting Bank with id" + bank_id, e);
		}

	}

	@Override
	public BankMaster addBank(BankMaster bank) {
		try {
			return this.bankdao.save(bank);
		} catch (Exception e) {
			log.error("Error Adding Bank");
			e.printStackTrace();
			throw new RuntimeException("Error While Saving Bank", e);
		}

	}

	@Override
	public BankMaster updateBank(BankMaster bank) {
		try {
			return this.bankdao.save(bank);
		} catch (Exception e) {
			log.error("Error updating bank", e);
			e.printStackTrace();
			throw new RuntimeException("Error while updating bank", e);
		}

	}

	@Override
	public void deleteBank(int bank_id) {
		try {
			bankdao.deleteById(bank_id);
		} catch (Exception e) {
			log.error("Error deleting bank with id " + bank_id, e);
			e.printStackTrace();
			throw new RuntimeException("Error deleting bank with id " + bank_id, e);
		}

	}

}
