package com.HRMS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_employeeDeduction")
public class EmployeeDeduction {

	@Id
	@Column(name = "emp_id")
	private int empid;

	@ManyToOne
	@JoinColumn(name = "deduction_id")
	private DeductionMaster deduction_id;

	@Column(name = "deduction_name")
	private String deduction_name;

	@Column(name = "deduction_amount")
	private String deduction_amount;

	public DeductionMaster getDeduction_id() {
		return deduction_id;
	}

	public int getEmpid() {
		return empid;
	}

	public String getDeduction_name() {
		return deduction_name;
	}

	public String getDeduction_amount() {
		return deduction_amount;
	}

	public void setDeduction_id(DeductionMaster deduction_id) {
		this.deduction_id = deduction_id;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setDeduction_name(String deduction_name) {
		this.deduction_name = deduction_name;
	}

	public void setDeduction_amount(String deduction_amount) {
		this.deduction_amount = deduction_amount;
	}

	@Override
	public String toString() {
		return "EmployeeDeduction [deduction_id=" + deduction_id + ", empid=" + empid + ", deduction_name="
				+ deduction_name + ", deduction_amount=" + deduction_amount + "]";
	}

	public EmployeeDeduction(DeductionMaster deduction_id, int empid, String deduction_name, String deduction_amount) {
		super();
		this.deduction_id = deduction_id;
		this.empid = empid;
		this.deduction_name = deduction_name;
		this.deduction_amount = deduction_amount;
	}

	public EmployeeDeduction() {
		super();
	}

}
