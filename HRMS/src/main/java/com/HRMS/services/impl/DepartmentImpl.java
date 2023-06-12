package com.HRMS.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.dao.DepartmentDAO;
import com.HRMS.model.DepartmentMaster;
import com.HRMS.services.DepartmentService;

@Service
public class DepartmentImpl implements DepartmentService {

	private static final Logger log = LoggerFactory.getLogger(DepartmentImpl.class);

	@Autowired
	private DepartmentDAO departmentdao;

	@Override
	public List<DepartmentMaster> getAllDepartment() {
		try {
			return (List<DepartmentMaster>) this.departmentdao.findAll();
		} catch (Exception e) {
			log.error("Error Getting All Departments ", e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Error Getting All Department", e);
		}

	}

	
	@Override
	public DepartmentMaster findDepartmentById(int departmentId) {
		try {
			DepartmentMaster findById = this.departmentdao.findById(departmentId);
			if(findById!=null)
			{
				return findById;
			}
			return null;
			
		} catch (Exception e) {
			log.error("Error Getting Department with id -"+departmentId,e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Error Getting Department with id -"+departmentId,e);
		}

	}

	@Override
	public DepartmentMaster addDepartment(DepartmentMaster department) {

		try {
			return this.departmentdao.save(department);
		} catch (Exception e) {
			log.error("Error Saving Department",e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Error Saving Department",e);
		}

	}

	@Override
	public DepartmentMaster updateDepartment(DepartmentMaster department) {

		try {
			return this.departmentdao.save(department);
		} catch (Exception e) {
			log.error("Error Updating Department",e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Error Updating Department",e);
		}

	}

	@Override
	public void deleteDepartment(int departmentId) {
		try {
			this.departmentdao.deleteById(departmentId);
		} catch (Exception e) {
			log.error("Error Deleteing Deparment with Id-"+departmentId);
			e.printStackTrace();
			throw new RuntimeException("Error Deleteing Deparment with Id-"+departmentId);

		}

	}

}
