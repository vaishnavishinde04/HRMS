package com.HRMS.dao;

import org.springframework.data.repository.CrudRepository;

import com.HRMS.model.BankMaster;

public interface BankDAO extends CrudRepository<BankMaster, Integer>{

	public BankMaster findById(int bankid);

}
