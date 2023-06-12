package com.HRMS.services;

import java.util.List;

import com.HRMS.model.DeductionMaster;


public interface DeductionService {

	List<DeductionMaster> getAllDeduction();

	DeductionMaster getDeductionById(int deductionId);

	DeductionMaster addDeduction(DeductionMaster deduction);

	DeductionMaster updateDeduction(DeductionMaster deduction);

	void deleteDeduction(int deductionId);

	


}
