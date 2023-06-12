package com.HRMS.model;


import java.util.Date;

import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_employee")
public class EmployeeMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    
	@Column(nullable = false)
	@NotBlank(message = "Name Cant Be Blank")
    private String empName;
	
	@Column(nullable = false)
    private String empEmail;
	
	@Column(nullable = false)
    private String empPhonePrimary;
    private String empPhoneAlternative;
    
    @Column(nullable = false)
    private String empAddress;
    
    @Column(nullable = false)
    private Date dob;
    private String empPan;
    
    @Column(nullable = false)
    private String empAadhaarNo;
    
    @OneToOne
    @JoinColumn(name = "bankId")
    private BankMaster bankId;
    
    private String empBankAccNo;
    private String empGender;
    private Date doj;
    
    @OneToOne
    @JoinColumn(name="projectId")
    private ProjectMaster projectId;
    
    private String empResume;
    private String empStatus;
    
    @OneToOne
    @JoinColumn(name="departmentId")
    private DepartmentMaster departmentId;
    
    @OneToOne
    @JoinColumn(name="designationId")
    private DesignationMaster designationId;
    
    private String empQualification;
    private int demandId;
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @return the empEmail
	 */
	public String getEmpEmail() {
		return empEmail;
	}
	/**
	 * @return the empPhonePrimary
	 */
	public String getEmpPhonePrimary() {
		return empPhonePrimary;
	}
	/**
	 * @return the empPhoneAlternative
	 */
	public String getEmpPhoneAlternative() {
		return empPhoneAlternative;
	}
	/**
	 * @return the empAddress
	 */
	public String getEmpAddress() {
		return empAddress;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @return the empPan
	 */
	public String getEmpPan() {
		return empPan;
	}
	/**
	 * @return the empAadhaarNo
	 */
	public String getEmpAadhaarNo() {
		return empAadhaarNo;
	}
	/**
	 * @return the bankId
	 */
	public BankMaster getBankId() {
		return bankId;
	}
	/**
	 * @return the empBankAccNo
	 */
	public String getEmpBankAccNo() {
		return empBankAccNo;
	}
	/**
	 * @return the empGender
	 */
	public String getEmpGender() {
		return empGender;
	}
	/**
	 * @return the doj
	 */
	public Date getDoj() {
		return doj;
	}
	/**
	 * @return the projectId
	 */
	public ProjectMaster getProjectId() {
		return projectId;
	}
	/**
	 * @return the empResume
	 */
	public String getEmpResume() {
		return empResume;
	}
	/**
	 * @return the empStatus
	 */
	public String getEmpStatus() {
		return empStatus;
	}
	/**
	 * @return the departmentId
	 */
	public DepartmentMaster getDepartmentId() {
		return departmentId;
	}
	/**
	 * @return the designationId
	 */
	public DesignationMaster getDesignationId() {
		return designationId;
	}
	/**
	 * @return the empQualification
	 */
	public String getEmpQualification() {
		return empQualification;
	}
	/**
	 * @return the demandId
	 */
	public int getDemandId() {
		return demandId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @param empEmail the empEmail to set
	 */
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	/**
	 * @param empPhonePrimary the empPhonePrimary to set
	 */
	public void setEmpPhonePrimary(String empPhonePrimary) {
		this.empPhonePrimary = empPhonePrimary;
	}
	/**
	 * @param empPhoneAlternative the empPhoneAlternative to set
	 */
	public void setEmpPhoneAlternative(String empPhoneAlternative) {
		this.empPhoneAlternative = empPhoneAlternative;
	}
	/**
	 * @param empAddress the empAddress to set
	 */
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * @param empPan the empPan to set
	 */
	public void setEmpPan(String empPan) {
		this.empPan = empPan;
	}
	/**
	 * @param empAadhaarNo the empAadhaarNo to set
	 */
	public void setEmpAadhaarNo(String empAadhaarNo) {
		this.empAadhaarNo = empAadhaarNo;
	}
	/**
	 * @param bankId the bankId to set
	 */
	public void setBankId(BankMaster bankId) {
		this.bankId = bankId;
	}
	/**
	 * @param empBankAccNo the empBankAccNo to set
	 */
	public void setEmpBankAccNo(String empBankAccNo) {
		this.empBankAccNo = empBankAccNo;
	}
	/**
	 * @param empGender the empGender to set
	 */
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	/**
	 * @param doj the doj to set
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(ProjectMaster projectId) {
		this.projectId = projectId;
	}
	/**
	 * @param empResume the empResume to set
	 */
	public void setEmpResume(String empResume) {
		this.empResume = empResume;
	}
	/**
	 * @param empStatus the empStatus to set
	 */
	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}
	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(DepartmentMaster departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * @param designationId the designationId to set
	 */
	public void setDesignationId(DesignationMaster designationId) {
		this.designationId = designationId;
	}
	/**
	 * @param empQualification the empQualification to set
	 */
	public void setEmpQualification(String empQualification) {
		this.empQualification = empQualification;
	}
	/**
	 * @param demandId the demandId to set
	 */
	public void setDemandId(int demandId) {
		this.demandId = demandId;
	}
	/**
	 * @param empId
	 * @param empName
	 * @param empEmail
	 * @param empPhonePrimary
	 * @param empPhoneAlternative
	 * @param empAddress
	 * @param dob
	 * @param empPan
	 * @param empAadhaarNo
	 * @param bankId
	 * @param empBankAccNo
	 * @param empGender
	 * @param doj
	 * @param projectId
	 * @param empResume
	 * @param empStatus
	 * @param departmentId
	 * @param designationId
	 * @param empQualification
	 * @param demandId
	 */
	public EmployeeMaster(int empId, String empName, String empEmail, String empPhonePrimary,
			String empPhoneAlternative, String empAddress, Date dob, String empPan, String empAadhaarNo,
			BankMaster bankId, String empBankAccNo, String empGender, Date doj, ProjectMaster projectId,
			String empResume, String empStatus, DepartmentMaster departmentId, DesignationMaster designationId,
			String empQualification, int demandId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empPhonePrimary = empPhonePrimary;
		this.empPhoneAlternative = empPhoneAlternative;
		this.empAddress = empAddress;
		this.dob = dob;
		this.empPan = empPan;
		this.empAadhaarNo = empAadhaarNo;
		this.bankId = bankId;
		this.empBankAccNo = empBankAccNo;
		this.empGender = empGender;
		this.doj = doj;
		this.projectId = projectId;
		this.empResume = empResume;
		this.empStatus = empStatus;
		this.departmentId = departmentId;
		this.designationId = designationId;
		this.empQualification = empQualification;
		this.demandId = demandId;
	}
	@Override
	public String toString() {
		return "EmployeeMaster [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail
				+ ", empPhonePrimary=" + empPhonePrimary + ", empPhoneAlternative=" + empPhoneAlternative
				+ ", empAddress=" + empAddress + ", dob=" + dob + ", empPan=" + empPan + ", empAadhaarNo="
				+ empAadhaarNo + ", bankId=" + bankId + ", empBankAccNo=" + empBankAccNo + ", empGender=" + empGender
				+ ", doj=" + doj + ", projectId=" + projectId + ", empResume=" + empResume + ", empStatus=" + empStatus
				+ ", departmentId=" + departmentId + ", designationId=" + designationId + ", empQualification="
				+ empQualification + ", demandId=" + demandId + "]";
	}
	/**
	 * 
	 */
	public EmployeeMaster() {
		super();
	}
	
	public EmployeeMaster(int empID) {
		super();
		this.empId=empID;
	}
    
    
}
