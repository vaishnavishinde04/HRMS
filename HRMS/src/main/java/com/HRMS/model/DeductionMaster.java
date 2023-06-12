package com.HRMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_deduction")
public class DeductionMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deductionId;
	
	private String deductionName;
	private String deductionDescription;
	/**
	 * @return the deductionId
	 */
	public int getDeductionId() {
		return deductionId;
	}
	/**
	 * @return the deductionName
	 */
	public String getDeductionName() {
		return deductionName;
	}
	/**
	 * @return the deductionDescription
	 */
	public String getDeductionDescription() {
		return deductionDescription;
	}
	/**
	 * @param deductionId the deductionId to set
	 */
	public void setDeductionId(int deductionId) {
		this.deductionId = deductionId;
	}
	/**
	 * @param deductionName the deductionName to set
	 */
	public void setDeductionName(String deductionName) {
		this.deductionName = deductionName;
	}
	/**
	 * @param deductionDescription the deductionDescription to set
	 */
	public void setDeductionDescription(String deductionDescription) {
		this.deductionDescription = deductionDescription;
	}
	/**
	 * @param deductionId
	 * @param deductionName
	 * @param deductionDescription
	 */
	public DeductionMaster(int deductionId, String deductionName, String deductionDescription) {
		super();
		this.deductionId = deductionId;
		this.deductionName = deductionName;
		this.deductionDescription = deductionDescription;
	}
	/**
	 * 
	 */
	public DeductionMaster() {
		super();
	}

	public DeductionMaster(int dedcutionId) {
		super();
		this.deductionId=dedcutionId;
	}
	@Override
	public String toString() {
		return "DeductionMaster [deductionId=" + deductionId + ", deductionName=" + deductionName
				+ ", deductionDescription=" + deductionDescription + "]";
	}
	
	

	
	
}
