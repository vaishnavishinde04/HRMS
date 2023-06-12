package com.HRMS.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.dao.EmployeeDAO;
import com.HRMS.model.EmployeeMaster;
import com.HRMS.services.EmployeeService;

@Service
public class EmployeeImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO empDAO;

	@Override
	public List<EmployeeMaster> getallemp() {

		try {
			List<EmployeeMaster> findAll = (List<EmployeeMaster>) this.empDAO.findAll();
			return findAll;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public EmployeeMaster addemp(EmployeeMaster empmaster) {
		try {
			EmployeeMaster employeeMaster = empDAO.save(empmaster);
			return employeeMaster;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public EmployeeMaster updateemp(EmployeeMaster empmaster, int empid) {

		try {
			empmaster.setEmpId(empid);
			EmployeeMaster employeeMaster = empDAO.save(empmaster);
			return employeeMaster;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public EmployeeMaster findempbyid(int empid) {
		try {
			EmployeeMaster findById = empDAO.findById(empid);
			return findById;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public String deleteemp(int empid) {
		try {
			empDAO.deleteById(empid);
			return "Deleted";
		} catch (Exception e) {
			e.printStackTrace();
			return "Not Deleted";
		}
		
	}

}
