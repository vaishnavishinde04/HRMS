package com.HRMS.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_leave")
public class LeaveMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leaveId;
	
	@OneToOne
	@JoinColumn(name="empId")
	private EmployeeMaster empId;

	private Date leaveFrom;
	private Date leaveTo;
	private String leaveType;
	private String leaveReason;
	/**
	 * @return the leaveId
	 */
	public int getLeaveId() {
		return leaveId;
	}
	/**
	 * @return the empId
	 */
	public EmployeeMaster getEmpId() {
		return empId;
	}
	/**
	 * @return the leaveFrom
	 */
	public Date getLeaveFrom() {
		return leaveFrom;
	}
	/**
	 * @return the leaveTo
	 */
	public Date getLeaveTo() {
		return leaveTo;
	}
	/**
	 * @return the leaveType
	 */
	public String getLeaveType() {
		return leaveType;
	}
	/**
	 * @return the leaveReason
	 */
	public String getLeaveReason() {
		return leaveReason;
	}
	/**
	 * @param leaveId the leaveId to set
	 */
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(EmployeeMaster empId) {
		this.empId = empId;
	}
	/**
	 * @param leaveFrom the leaveFrom to set
	 */
	public void setLeaveFrom(Date leaveFrom) {
		this.leaveFrom = leaveFrom;
	}
	/**
	 * @param leaveTo the leaveTo to set
	 */
	public void setLeaveTo(Date leaveTo) {
		this.leaveTo = leaveTo;
	}
	/**
	 * @param leaveType the leaveType to set
	 */
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	/**
	 * @param leaveReason the leaveReason to set
	 */
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
	/**
	 * @param leaveId
	 * @param empId
	 * @param leaveFrom
	 * @param leaveTo
	 * @param leaveType
	 * @param leaveReason
	 */
	public LeaveMaster(int leaveId, EmployeeMaster empId, Date leaveFrom, Date leaveTo, String leaveType,
			String leaveReason) {
		super();
		this.leaveId = leaveId;
		this.empId = empId;
		this.leaveFrom = leaveFrom;
		this.leaveTo = leaveTo;
		this.leaveType = leaveType;
		this.leaveReason = leaveReason;
	}
	@Override
	public String toString() {
		return "LeaveMaster [leaveId=" + leaveId + ", empId=" + empId + ", leaveFrom=" + leaveFrom + ", leaveTo="
				+ leaveTo + ", leaveType=" + leaveType + ", leaveReason=" + leaveReason + "]";
	}
	/**
	 * 
	 */
	public LeaveMaster() {
		super();
	}

	
	public LeaveMaster(int leaveid) {
		super();
		this.leaveId=leaveid;
	}
	

}
