package com.HRMS.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_Candidate")
public class CandidateMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int candidate_id;
	private String candidate_name;
	private String candidate_email;
	private String candidate_gender;
	private String candidate_Pan;
	private int candidate_primary_mobileno;
	private int candidate_alternative_mobileno;
	private String candidate_permanent_address;
	private String candidate_temporary_address;
	private Date candidate_dob;
	private String candidate_adhar;
	private String candidate_bank_accno;
	private String candidate_bank_name;
	private String candidate_qualification;
	private String candidate_skills;
	private String candidate_status;
	private String candidate_linkdin_link;
	private String candidate_github_link;
	private String candidate_last_job;
	private String candidate_interest;
	private String notice_period;
	private String reference;
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
	 * @return the candidate_name
	 */
	public String getCandidate_name() {
		return candidate_name;
	}
	/**
	 * @param candidate_name the candidate_name to set
	 */
	public void setCandidate_name(String candidate_name) {
		this.candidate_name = candidate_name;
	}
	/**
	 * @return the candidate_email
	 */
	public String getCandidate_email() {
		return candidate_email;
	}
	/**
	 * @param candidate_email the candidate_email to set
	 */
	public void setCandidate_email(String candidate_email) {
		this.candidate_email = candidate_email;
	}
	/**
	 * @return the candidate_gender
	 */
	public String getCandidate_gender() {
		return candidate_gender;
	}
	/**
	 * @param candidate_gender the candidate_gender to set
	 */
	public void setCandidate_gender(String candidate_gender) {
		this.candidate_gender = candidate_gender;
	}
	/**
	 * @return the candidate_Pan
	 */
	public String getCandidate_Pan() {
		return candidate_Pan;
	}
	/**
	 * @param candidate_Pan the candidate_Pan to set
	 */
	public void setCandidate_Pan(String candidate_Pan) {
		this.candidate_Pan = candidate_Pan;
	}
	/**
	 * @return the candidate_primary_mobileno
	 */
	public int getCandidate_primary_mobileno() {
		return candidate_primary_mobileno;
	}
	/**
	 * @param candidate_primary_mobileno the candidate_primary_mobileno to set
	 */
	public void setCandidate_primary_mobileno(int candidate_primary_mobileno) {
		this.candidate_primary_mobileno = candidate_primary_mobileno;
	}
	/**
	 * @return the candidate_alternative_mobileno
	 */
	public int getCandidate_alternative_mobileno() {
		return candidate_alternative_mobileno;
	}
	/**
	 * @param candidate_alternative_mobileno the candidate_alternative_mobileno to set
	 */
	public void setCandidate_alternative_mobileno(int candidate_alternative_mobileno) {
		this.candidate_alternative_mobileno = candidate_alternative_mobileno;
	}
	/**
	 * @return the candidate_permanent_address
	 */
	public String getCandidate_permanent_address() {
		return candidate_permanent_address;
	}
	/**
	 * @param candidate_permanent_address the candidate_permanent_address to set
	 */
	public void setCandidate_permanent_address(String candidate_permanent_address) {
		this.candidate_permanent_address = candidate_permanent_address;
	}
	/**
	 * @return the candidate_temporary_address
	 */
	public String getCandidate_temporary_address() {
		return candidate_temporary_address;
	}
	/**
	 * @param candidate_temporary_address the candidate_temporary_address to set
	 */
	public void setCandidate_temporary_address(String candidate_temporary_address) {
		this.candidate_temporary_address = candidate_temporary_address;
	}
	/**
	 * @return the candidate_dob
	 */
	public Date getCandidate_dob() {
		return candidate_dob;
	}
	/**
	 * @param candidate_dob the candidate_dob to set
	 */
	public void setCandidate_dob(Date candidate_dob) {
		this.candidate_dob = candidate_dob;
	}
	/**
	 * @return the candidate_adhar
	 */
	public String getCandidate_adhar() {
		return candidate_adhar;
	}
	/**
	 * @param candidate_adhar the candidate_adhar to set
	 */
	public void setCandidate_adhar(String candidate_adhar) {
		this.candidate_adhar = candidate_adhar;
	}
	/**
	 * @return the candidate_bank_accno
	 */
	public String getCandidate_bank_accno() {
		return candidate_bank_accno;
	}
	/**
	 * @param candidate_bank_accno the candidate_bank_accno to set
	 */
	public void setCandidate_bank_accno(String candidate_bank_accno) {
		this.candidate_bank_accno = candidate_bank_accno;
	}
	/**
	 * @return the candidate_bank_name
	 */
	public String getCandidate_bank_name() {
		return candidate_bank_name;
	}
	/**
	 * @param candidate_bank_name the candidate_bank_name to set
	 */
	public void setCandidate_bank_name(String candidate_bank_name) {
		this.candidate_bank_name = candidate_bank_name;
	}
	/**
	 * @return the candidate_qualification
	 */
	public String getCandidate_qualification() {
		return candidate_qualification;
	}
	/**
	 * @param candidate_qualification the candidate_qualification to set
	 */
	public void setCandidate_qualification(String candidate_qualification) {
		this.candidate_qualification = candidate_qualification;
	}
	/**
	 * @return the candidate_skills
	 */
	public String getCandidate_skills() {
		return candidate_skills;
	}
	/**
	 * @param candidate_skills the candidate_skills to set
	 */
	public void setCandidate_skills(String candidate_skills) {
		this.candidate_skills = candidate_skills;
	}
	/**
	 * @return the candidate_status
	 */
	public String getCandidate_status() {
		return candidate_status;
	}
	/**
	 * @param candidate_status the candidate_status to set
	 */
	public void setCandidate_status(String candidate_status) {
		this.candidate_status = candidate_status;
	}
	/**
	 * @return the candidate_linkdin_link
	 */
	public String getCandidate_linkdin_link() {
		return candidate_linkdin_link;
	}
	/**
	 * @param candidate_linkdin_link the candidate_linkdin_link to set
	 */
	public void setCandidate_linkdin_link(String candidate_linkdin_link) {
		this.candidate_linkdin_link = candidate_linkdin_link;
	}
	/**
	 * @return the candidate_github_link
	 */
	public String getCandidate_github_link() {
		return candidate_github_link;
	}
	/**
	 * @param candidate_github_link the candidate_github_link to set
	 */
	public void setCandidate_github_link(String candidate_github_link) {
		this.candidate_github_link = candidate_github_link;
	}
	/**
	 * @return the candidate_last_job
	 */
	public String getCandidate_last_job() {
		return candidate_last_job;
	}
	/**
	 * @param candidate_last_job the candidate_last_job to set
	 */
	public void setCandidate_last_job(String candidate_last_job) {
		this.candidate_last_job = candidate_last_job;
	}
	/**
	 * @return the candidate_interest
	 */
	public String getCandidate_interest() {
		return candidate_interest;
	}
	/**
	 * @param candidate_interest the candidate_interest to set
	 */
	public void setCandidate_interest(String candidate_interest) {
		this.candidate_interest = candidate_interest;
	}
	/**
	 * @return the notice_period
	 */
	public String getNotice_period() {
		return notice_period;
	}
	/**
	 * @param notice_period the notice_period to set
	 */
	public void setNotice_period(String notice_period) {
		this.notice_period = notice_period;
	}
	/**
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}
	/**
	 * @param reference the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}
	public CandidateMaster(int candidate_id, String candidate_name, String candidate_email, String candidate_gender,
			String candidate_Pan, int candidate_primary_mobileno, int candidate_alternative_mobileno,
			String candidate_permanent_address, String candidate_temporary_address, Date candidate_dob,
			String candidate_adhar, String candidate_bank_accno, String candidate_bank_name,
			String candidate_qualification, String candidate_skills, String candidate_status,
			String candidate_linkdin_link, String candidate_github_link, String candidate_last_job,
			String candidate_interest, String notice_period, String reference) {
		super();
		this.candidate_id = candidate_id;
		this.candidate_name = candidate_name;
		this.candidate_email = candidate_email;
		this.candidate_gender = candidate_gender;
		this.candidate_Pan = candidate_Pan;
		this.candidate_primary_mobileno = candidate_primary_mobileno;
		this.candidate_alternative_mobileno = candidate_alternative_mobileno;
		this.candidate_permanent_address = candidate_permanent_address;
		this.candidate_temporary_address = candidate_temporary_address;
		this.candidate_dob = candidate_dob;
		this.candidate_adhar = candidate_adhar;
		this.candidate_bank_accno = candidate_bank_accno;
		this.candidate_bank_name = candidate_bank_name;
		this.candidate_qualification = candidate_qualification;
		this.candidate_skills = candidate_skills;
		this.candidate_status = candidate_status;
		this.candidate_linkdin_link = candidate_linkdin_link;
		this.candidate_github_link = candidate_github_link;
		this.candidate_last_job = candidate_last_job;
		this.candidate_interest = candidate_interest;
		this.notice_period = notice_period;
		this.reference = reference;
	}
	public CandidateMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CandidateMaster [candidate_id=" + candidate_id + ", candidate_name=" + candidate_name
				+ ", candidate_email=" + candidate_email + ", candidate_gender=" + candidate_gender + ", candidate_Pan="
				+ candidate_Pan + ", candidate_primary_mobileno=" + candidate_primary_mobileno
				+ ", candidate_alternative_mobileno=" + candidate_alternative_mobileno
				+ ", candidate_permanent_address=" + candidate_permanent_address + ", candidate_temporary_address="
				+ candidate_temporary_address + ", candidate_dob=" + candidate_dob + ", candidate_adhar="
				+ candidate_adhar + ", candidate_bank_accno=" + candidate_bank_accno + ", candidate_bank_name="
				+ candidate_bank_name + ", candidate_qualification=" + candidate_qualification + ", candidate_skills="
				+ candidate_skills + ", candidate_status=" + candidate_status + ", candidate_linkdin_link="
				+ candidate_linkdin_link + ", candidate_github_link=" + candidate_github_link + ", candidate_last_job="
				+ candidate_last_job + ", candidate_interest=" + candidate_interest + ", notice_period=" + notice_period
				+ ", reference=" + reference + "]";
	}
	
}
