package com.HRMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_login")
public class LoginMaster {

	@Id
	private int userId;
	
	private String user;
	private String username;
	private String password;
	private String role;
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * @param userId
	 * @param user
	 * @param username
	 * @param password
	 * @param role
	 */
	public LoginMaster(int userId, String user, String username, String password, String role) {
		super();
		this.userId = userId;
		this.user = user;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	/**
	 * 
	 */
	public LoginMaster() {
		super();
	}
	@Override
	public String toString() {
		return "LoginMaster [userId=" + userId + ", user=" + user + ", username=" + username + ", password=" + password
				+ ", role=" + role + "]";
	}

	
	

}
