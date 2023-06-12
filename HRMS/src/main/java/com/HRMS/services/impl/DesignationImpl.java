package com.HRMS.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HRMS.dao.DesignationDAO;
import com.HRMS.model.DesignationMaster;
import com.HRMS.services.DesignationService;

@Service
public class DesignationImpl implements DesignationService {

	private static final Logger log = LoggerFactory.getLogger(DesignationImpl.class);

	@Autowired
	private DesignationDAO deisgnationdao;

	@Override
	public List<DesignationMaster> getAllDesigantion() {
		try {
			return (List<DesignationMaster>) deisgnationdao.findAll();
		} catch (Exception e) {
			log.error("Error Getting All Designations", e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Error Getting All Designations", e);
		}
	}

	@Override
	public DesignationMaster getDesigantionById(int designationId) {
		try {
			DesignationMaster findById = deisgnationdao.findById(designationId);
			if(findById!=null)
			{
				return findById;
			}
			return null;

		} catch (Exception e) {
			log.error("Error Getting Designation With Id="+designationId);
			e.printStackTrace();
			throw new RuntimeException("Error Getting Designation With Id="+designationId);
		}
	}

	@Override
	public DesignationMaster addDesigantion(DesignationMaster designation) {
		try {
			return deisgnationdao.save(designation);
		} catch (Exception e) {
			log.error("Error While Saving Designation", e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Error While Saving Designation", e);
		}
	}

	@Override
	public DesignationMaster updateDesigantion(DesignationMaster designation) {
		try {
			return deisgnationdao.save(designation);
		} catch (Exception e) {
			log.error("Error While Updating Designation", e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Error While Updating Designation", e);
		}
	}

	@Override
	public void deleteDesigantion(int designationId) {
		try {

			deisgnationdao.deleteById(designationId);

		} catch (Exception e) {
			log.error("Error While Deleting Desigantion with Id="+designationId);
			e.printStackTrace();
			throw new RuntimeException("Error While Deleting Desigantion with Id="+designationId);
		}

	}

}
