package com.HRMS.services;

import java.util.List;

import com.HRMS.model.DesignationMaster;

public interface DesignationService {

	List<DesignationMaster> getAllDesigantion();
	DesignationMaster getDesigantionById(int designation_id);
	DesignationMaster addDesigantion(DesignationMaster designation);
	void deleteDesigantion(int designation_id);
	DesignationMaster updateDesigantion(DesignationMaster designation);
}
