package com.HRMS.services;

import java.util.List;

import com.HRMS.model.BankMaster;

public interface BankService {

	BankMaster updateBank(BankMaster bank);

	void deleteBank(int bank_id);

	BankMaster getBankById(int bank_id);

	BankMaster addBank(BankMaster bank);

	List<BankMaster> getAllBanks();

	

	

}
