package com.HRMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_deduction")
public class DepartmentMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int department_id;
	
	private String departmentName;
	private String departmentLocation;
	private String departmentDescription;
	/**
	 * @return the department_id
	 */
	public int getDepartment_id() {
		return department_id;
	}
	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * @return the departmentLocation
	 */
	public String getDepartmentLocation() {
		return departmentLocation;
	}
	/**
	 * @return the departmentDescription
	 */
	public String getDepartmentDescription() {
		return departmentDescription;
	}
	/**
	 * @param department_id the department_id to set
	 */
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	/**
	 * @param departmentLocation the departmentLocation to set
	 */
	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}
	/**
	 * @param departmentDescription the departmentDescription to set
	 */
	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}
	@Override
	public String toString() {
		return "DepartmentMaster [department_id=" + department_id + ", departmentName=" + departmentName
				+ ", departmentLocation=" + departmentLocation + ", departmentDescription=" + departmentDescription
				+ "]";
	}
	/**
	 * @param department_id
	 * @param departmentName
	 * @param departmentLocation
	 * @param departmentDescription
	 */
	public DepartmentMaster(int department_id, String departmentName, String departmentLocation,
			String departmentDescription) {
		super();
		this.department_id = department_id;
		this.departmentName = departmentName;
		this.departmentLocation = departmentLocation;
		this.departmentDescription = departmentDescription;
	}
	/**
	 * 
	 */
	public DepartmentMaster() {
		super();
	}

	public DepartmentMaster(int deductionId) {
		super();
		this.department_id=deductionId;
	}

	
	

}
