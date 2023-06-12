package com.HRMS.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.HRMS.model.AllowanceMaster;
import com.HRMS.model.EmployeeAllowance;
import com.HRMS.model.EmployeeMaster;

public interface EmployeeAllowanceDAO extends CrudRepository<EmployeeAllowance, Integer>{

	
	List<EmployeeAllowance> findByEmployeeId(EmployeeMaster employeeMaster);

	EmployeeAllowance findByEmployeeIdAndAllowanceid(EmployeeMaster employeeMaster, AllowanceMaster allowanceMaster);
	
//	EmployeeAllowance findByEmployeeIdAndAllowanceid(int employeeMaster, int allowanceMaster);
	
	
}
