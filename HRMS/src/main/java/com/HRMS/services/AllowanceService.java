package com.HRMS.services;

import java.util.List;

import com.HRMS.model.AllowanceMaster;

/**
 * This interface defines the methods for managing AllowanceMaster objects.
 */
public interface AllowanceService {

	List<AllowanceMaster> getAllAllowances();

	AllowanceMaster getAllowanceById(int allowanceid);

	AllowanceMaster addAllowance(AllowanceMaster allowance);

	AllowanceMaster updateAllowance(AllowanceMaster allowance);

	void deleteAllowance(int allowanceId);

   

}
