package com.HRMS.services;

import java.util.List;

import com.HRMS.model.EmployeeMaster;

public interface EmployeeService {

	List<EmployeeMaster> getallemp();
	EmployeeMaster addemp(EmployeeMaster empmaster);
	EmployeeMaster updateemp(EmployeeMaster empmaster, int empid);
	EmployeeMaster findempbyid(int empid);
	String deleteemp(int empid);

}
