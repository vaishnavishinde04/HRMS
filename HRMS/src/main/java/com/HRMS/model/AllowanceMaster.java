package com.HRMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_allowance")
public class AllowanceMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int allowanceId;
	
	private String allowanceName;
	private String allowanceDescription;
	
	/**
	 * @return the allowanceId
	 */
	public int getAllowanceId() {
		return allowanceId;
	}
	/**
	 * @return the allowanceName
	 */
	public String getAllowanceName() {
		return allowanceName;
	}
	/**
	 * @return the allowanceDescription
	 */
	public String getAllowanceDescription() {
		return allowanceDescription;
	}
	/**
	 * @param allowanceId the allowanceId to set
	 */
	public void setAllowanceId(int allowanceId) {
		this.allowanceId = allowanceId;
	}
	/**
	 * @param allowanceName the allowanceName to set
	 */
	public void setAllowanceName(String allowanceName) {
		this.allowanceName = allowanceName;
	}
	/**
	 * @param allowanceDescription the allowanceDescription to set
	 */
	public void setAllowanceDescription(String allowanceDescription) {
		this.allowanceDescription = allowanceDescription;
	}
	/**
	 * @param allowanceId
	 * @param allowanceName
	 * @param allowanceDescription
	 */
	public AllowanceMaster(int allowanceId, String allowanceName, String allowanceDescription) {
		super();
		this.allowanceId = allowanceId;
		this.allowanceName = allowanceName;
		this.allowanceDescription = allowanceDescription;
	}
	/**
	 * 
	 */
	public AllowanceMaster() {
		super();
	}

	public AllowanceMaster(int allowanceId) {
		super();
		this.allowanceId=allowanceId;
	}
	@Override
	public String toString() {
		return "AllowanceMaster [allowanceId=" + allowanceId + ", allowanceName=" + allowanceName
				+ ", allowanceDescription=" + allowanceDescription + "]";
	}
	
	


}
