package com.HRMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_designation")
public class DesignationMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int designationId;
	
	private String designationName;
	private String designationDescription;
	/**
	 * @return the designationId
	 */
	public int getDesignationId() {
		return designationId;
	}
	/**
	 * @return the designationName
	 */
	public String getDesignationName() {
		return designationName;
	}
	/**
	 * @return the designationDescription
	 */
	public String getDesignationDescription() {
		return designationDescription;
	}
	/**
	 * @param designationId the designationId to set
	 */
	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}
	/**
	 * @param designationName the designationName to set
	 */
	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}
	/**
	 * @param designationDescription the designationDescription to set
	 */
	public void setDesignationDescription(String designationDescription) {
		this.designationDescription = designationDescription;
	}
	@Override
	public String toString() {
		return "DesignationMaster [designationId=" + designationId + ", designationName=" + designationName
				+ ", designationDescription=" + designationDescription + "]";
	}
	/**
	 * @param designationId
	 * @param designationName
	 * @param designationDescription
	 */
	public DesignationMaster(int designationId, String designationName, String designationDescription) {
		super();
		this.designationId = designationId;
		this.designationName = designationName;
		this.designationDescription = designationDescription;
	}
	/**
	 * 
	 */
	public DesignationMaster() {
		super();
	}

	public DesignationMaster(int designationId) {
		super();
		this.designationId=designationId;
	}


}
