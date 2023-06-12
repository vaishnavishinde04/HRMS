package com.HRMS.services;

import java.util.List;

import com.HRMS.model.EmployeeAllowance;

public interface EmployeeAllowanceService {

	List<EmployeeAllowance> EmployeeAllAllowance(int empid);

	EmployeeAllowance assignallowance(EmployeeAllowance empallowance);

	boolean deleteallowance(EmployeeAllowance empallowance);

	EmployeeAllowance updateallowance(EmployeeAllowance empallowance);

	boolean CheckEmployee(EmployeeAllowance empallowance);

	


}
