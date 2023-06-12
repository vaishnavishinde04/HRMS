package com.HRMS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_employeeallowance")
public class EmployeeAllowance {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name = "emp_id")
	private EmployeeMaster employeeId;

	@ManyToOne
	@JoinColumn(name = "allowance_id")
	private AllowanceMaster allowanceid;

	@Column(name = "allowance_amount")
	private int allowance_amount;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the employeeId
	 */
	public EmployeeMaster getEmployeeId() {
		return employeeId;
	}

	/**
	 * @return the allowanceid
	 */
	public AllowanceMaster getAllowanceid() {
		return allowanceid;
	}

	/**
	 * @return the allowance_amount
	 */
	public int getAllowance_amount() {
		return allowance_amount;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(EmployeeMaster employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @param allowanceid the allowanceid to set
	 */
	public void setAllowanceid(AllowanceMaster allowanceid) {
		this.allowanceid = allowanceid;
	}

	/**
	 * @param allowance_amount the allowance_amount to set
	 */
	public void setAllowance_amount(int allowance_amount) {
		this.allowance_amount = allowance_amount;
	}

	/**
	 * @param id
	 * @param employeeId
	 * @param allowanceid
	 * @param allowance_amount
	 */
	public EmployeeAllowance(Integer id, EmployeeMaster employeeId, AllowanceMaster allowanceid, int allowance_amount) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.allowanceid = allowanceid;
		this.allowance_amount = allowance_amount;
	}

	/**
	 * 
	 */
	public EmployeeAllowance() {
		super();
	}

	@Override
	public String toString() {
		return "EmployeeAllowance [id=" + id + ", employeeId=" + employeeId + ", allowanceid=" + allowanceid
				+ ", allowance_amount=" + allowance_amount + "]";
	}

	
}
