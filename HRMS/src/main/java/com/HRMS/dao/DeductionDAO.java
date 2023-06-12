package com.HRMS.dao;

import org.springframework.data.repository.CrudRepository;

import com.HRMS.model.DeductionMaster;

public interface DeductionDAO extends CrudRepository<DeductionMaster, Integer>{

	public DeductionMaster findById(int deductionid);

}
