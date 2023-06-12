package com.HRMS.services;

import java.util.List;

import com.HRMS.model.DepartmentMaster;

public interface DepartmentService {

	List<DepartmentMaster> getAllDepartment();

	DepartmentMaster findDepartmentById(int departmentId);

	DepartmentMaster addDepartment(DepartmentMaster department);

	DepartmentMaster updateDepartment(DepartmentMaster department);

	void deleteDepartment(int departmentId);

	

}
