package com.HRMS.services.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.controller.EmployeeAllowanceController;
import com.HRMS.dao.EmployeeAllowanceDAO;
import com.HRMS.model.AllowanceMaster;
import com.HRMS.model.EmployeeAllowance;
import com.HRMS.model.EmployeeMaster;
import com.HRMS.services.EmployeeAllowanceService;

@Service
public class EmployeeAllowanceImpl implements EmployeeAllowanceService {

	static Logger logger = LogManager.getLogger(EmployeeAllowanceController.class);

	@Autowired
	private EmployeeAllowanceDAO EADAO;

	public List<EmployeeAllowance> EmployeeAllAllowance(int employeeId) {
		try {

			EmployeeMaster employeeMaster = new EmployeeMaster();
			employeeMaster.setEmpId(employeeId);
			return EADAO.findByEmployeeId(employeeMaster);

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error For Fetching Allowance for EmpId" + employeeId, e);
			throw new RuntimeException("Fail to get EmployeeAllowance" + e);
		}

	}

	@Override
	public EmployeeAllowance assignallowance(EmployeeAllowance empallowance) {
		try {
			return this.EADAO.save(empallowance);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error For Assigning Allowance for Empid" + empallowance.getEmployeeId().getEmpId(), e);
			throw new RuntimeException("Failed to assign allowance" + e);
		}

	}

	@Override
	public EmployeeAllowance updateallowance(EmployeeAllowance empallowance) {
		try {

			EmployeeMaster empId = empallowance.getEmployeeId();
			AllowanceMaster Alloid = empallowance.getAllowanceid();

			EmployeeAllowance employeeAllowance = this.EADAO.findByEmployeeIdAndAllowanceid(empId, Alloid);

			if (employeeAllowance == null) {
				return null;
			}

			int ID = employeeAllowance.getId();
			empallowance.setId(ID);
			return this.EADAO.save(empallowance);

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Error Updating Allowance for EmployeeId" + empallowance.getEmployeeId().getEmpId());
			return null;
		}

	}

	@Override
	public boolean deleteallowance(EmployeeAllowance empallowance) {
		try {
			EmployeeMaster empId = empallowance.getEmployeeId();
			AllowanceMaster Alloid = empallowance.getAllowanceid();

			EmployeeAllowance employeeAllowance = this.EADAO.findByEmployeeIdAndAllowanceid(empId, Alloid);

			if (employeeAllowance == null) {
				return false;
			}
			
			int ID = employeeAllowance.getId();
			empallowance.setId(ID);
			this.EADAO.delete(empallowance);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
			return false;
		}

	}

	@Override
	public boolean CheckEmployee(EmployeeAllowance empallowance) {

		EmployeeMaster empId = empallowance.getEmployeeId();
		AllowanceMaster Alloid = empallowance.getAllowanceid();

		EmployeeAllowance employeeAllowance = this.EADAO.findByEmployeeIdAndAllowanceid(empId, Alloid);

		if (employeeAllowance == null) {
			return false;
		}
		
		return true;
	}

}
