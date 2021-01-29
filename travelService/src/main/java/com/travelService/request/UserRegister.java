package com.travelService.request;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Bhavya Description-Stores UserRegistration Data
 *
 */
@XmlRootElement
public class UserRegister {

	
	private String userName;

	private String password;

	private String email;

	private String phoneNo;

	private String firstName;

	private String lastName;

	private List<String> role;

	private String loginType;

	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

    public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public List<String> getRole() {
		
		return role;
	}

	public void setRole(List<String> role) {
		this.role = role;
	}

	
}
