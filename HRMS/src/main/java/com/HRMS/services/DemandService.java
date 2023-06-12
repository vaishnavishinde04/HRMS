/**
 * 
 */
package com.HRMS.services;

import java.util.List;

import com.HRMS.model.DemandMaster;

public interface DemandService {

	List<DemandMaster> getAllDemands();

	DemandMaster getDemandById(int id);

	DemandMaster addDemand(DemandMaster demand);

	DemandMaster updateDemand(DemandMaster demand);

	void deleteDemand(int id);

}
