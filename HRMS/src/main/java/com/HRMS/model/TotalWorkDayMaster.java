package com.HRMS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class TotalWorkDayMaster {

	@Id
	@Column(name="year")
	private int year;
	
	@Id
	@Column(name="month")
	private String month;
	
	@Column(name="days")
	private int days;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public TotalWorkDayMaster(int year, String month, int days) {
		super();
		this.year = year;
		this.month = month;
		this.days = days;
	}

	public TotalWorkDayMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TotalWorkDayMaster [year=" + year + ", month=" + month + ", days=" + days + "]";
	}

	
}
