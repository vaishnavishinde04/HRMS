package com.HRMS.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_Interview")
public class InterviewMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="InterviewID")
	private int interview_id;
	@Column(name ="Interviewer_id")
	private int interviewer_id;
	@Column(name ="Candidate_id")
	private int candidate_id;
	@Column(name ="Interview_Date")
	private Date interview_date;
	@Column(name ="InterviewTime")
	private String interview_time;
	@Column(name ="Status")
	private String status;
	@Column(name ="Remark")
	private String remark;
	@Column(name ="InterviewDuration")
	private String interview_duration;
	@Column(name ="Demand_id")
	private int demand_id;
	@Column(name ="OvaerallEvalution")
	private String ovaerall_evalution;
	@Column(name ="Strength")
	private String strength;
	@Column(name ="Weakness")
	private String weakness;
	
	
	
	public InterviewMaster(int interview_id, int interviewer_id, int candidate_id, Date interview_date,
			String interview_time, String status, String remark, String interview_duration, int demand_id,
			String ovaerall_evalution, String strength, String weakness) {
		super();
		this.interview_id = interview_id;
		this.interviewer_id = interviewer_id;
		this.candidate_id = candidate_id;
		this.interview_date = interview_date;
		this.interview_time = interview_time;
		this.status = status;
		this.remark = remark;
		this.interview_duration = interview_duration;
		this.demand_id = demand_id;
		this.ovaerall_evalution = ovaerall_evalution;
		this.strength = strength;
		this.weakness = weakness;
	}

	
	

	
	/**
	 * @return the demand_id
	 */
	public int getDemand_id() {
		return demand_id;
	}



	/**
	 * @param demand_id the demand_id to set
	 */
	public void setDemand_id(int demand_id) {
		this.demand_id = demand_id;
	}

	/**
	 * @return the interview_id
	 */
	public int getInterview_id() {
		return interview_id;
	}

	/**
	 * @param interview_id the interview_id to set
	 */
	public void setInterview_id(int interview_id) {
		this.interview_id = interview_id;
	}

	/**
	 * @return the interviewer_id
	 */
	public int getInterviewer_id() {
		return interviewer_id;
	}

	/**
	 * @param interviewer_id the interviewer_id to set
	 */
	public void setInterviewer_id(int interviewer_id) {
		this.interviewer_id = interviewer_id;
	}

	/**
	 * @return the candidate_id
	 */
	public int getCandidate_id() {
		return candidate_id;
	}

	/**
	 * @param candidate_id the candidate_id to set
	 */
	public void setCandidate_id(int candidate_id) {
		this.candidate_id = candidate_id;
	}

	/**
	 * @return the interview_date
	 */
	public Date getInterview_date() {
		return interview_date;
	}

	/**
	 * @param interview_date the interview_date to set
	 */
	public void setInterview_date(Date interview_date) {
		this.interview_date = interview_date;
	}

	/**
	 * @return the interview_time
	 */
	public String getInterview_time() {
		return interview_time;
	}

	/**
	 * @param interview_time the interview_time to set
	 */
	public void setInterview_time(String interview_time) {
		this.interview_time = interview_time;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the interview_duration
	 */
	public String getInterview_duration() {
		return interview_duration;
	}

	/**
	 * @param interview_duration the interview_duration to set
	 */
	public void setInterview_duration(String interview_duration) {
		this.interview_duration = interview_duration;
	}

	/**
	 * @return the demand_id
	 */

	/**
	 * @return the ovaerall_evalution
	 */
	public String getOvaerall_evalution() {
		return ovaerall_evalution;
	}

	/**
	 * @param ovaerall_evalution the ovaerall_evalution to set
	 */
	public void setOvaerall_evalution(String ovaerall_evalution) {
		this.ovaerall_evalution = ovaerall_evalution;
	}

	/**
	 * @return the strength
	 */
	public String getStrength() {
		return strength;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(String strength) {
		this.strength = strength;
	}

	/**
	 * @return the weakness
	 */
	public String getWeakness() {
		return weakness;
	}

	/**
	 * @param weakness the weakness to set
	 */
	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}

	@Override
	public String toString() {
		return "InterviewMaster [interview_id=" + interview_id + ", interviewer_id=" + interviewer_id
				+ ", candidate_id=" + candidate_id + ", interview_date=" + interview_date + ", interview_time="
				+ interview_time + ", status=" + status + ", remark=" + remark + ", interview_duration="
				+ interview_duration + ", demand_id=" + demand_id + ", ovaerall_evalution=" + ovaerall_evalution
				+ ", strength=" + strength + ", weakness=" + weakness + "]";
	}

	public InterviewMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

}
