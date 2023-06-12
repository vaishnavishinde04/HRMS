package com.HRMS.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_otp")
public class OtpLoginMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String username;
	
	private int pin;
	
	@CreationTimestamp
	private Timestamp ts;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public OtpLoginMaster(int id, String username, int pin, Timestamp ts) {
		super();
		this.id = id;
		this.username = username;
		this.pin = pin;
		this.ts = ts;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public Timestamp getTs() {
		return ts;
	}

	public void setTs(Timestamp timestamp) {
		this.ts = timestamp;
	}

	@Override
	public String toString() {
		return "OtpLoginMaster [id=" + id + ", Username=" + username + ", pin=" + pin + ", ts=" + ts + "]";
	}

	

	public OtpLoginMaster() {
		super();
	}
	
	

}
