package com.HRMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_bank")
public class BankMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bankId;
	
	private String bankName;
	private String bankBranch;
	private String bankDescription;
	/**
	 * @return the bankId
	 */
	public int getBankId() {
		return bankId;
	}
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @return the bankBranch
	 */
	public String getBankBranch() {
		return bankBranch;
	}
	/**
	 * @return the bankDescription
	 */
	public String getBankDescription() {
		return bankDescription;
	}
	/**
	 * @param bankId the bankId to set
	 */
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * @param bankBranch the bankBranch to set
	 */
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	/**
	 * @param bankDescription the bankDescription to set
	 */
	public void setBankDescription(String bankDescription) {
		this.bankDescription = bankDescription;
	}
	/**
	 * @param bankId
	 * @param bankName
	 * @param bankBranch
	 * @param bankDescription
	 */
	public BankMaster(int bankId, String bankName, String bankBranch, String bankDescription) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.bankBranch = bankBranch;
		this.bankDescription = bankDescription;
	}
	/**
	 * 
	 */
	public BankMaster() {
		super();
	}

	
	public BankMaster(int bankId) {
		super();
		this.bankId=bankId;
	}
	@Override
	public String toString() {
		return "BankMaster [bankId=" + bankId + ", bankName=" + bankName + ", bankBranch=" + bankBranch
				+ ", bankDescription=" + bankDescription + "]";
	}
	
	
	


}
