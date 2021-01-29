package com.travelService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.springframework.stereotype.Component;

import javax.persistence.Id;

@Component
@Entity
public class User {

	private String email;
	private String username;
	private String password;
	private boolean enabled;
	
	@Column(name = "phoneno")
	private String PhoneNo;
	
	@Column(name = "userprofilename")
	private String UserProfileName;
	
	@Id
	private int Id;
	
	@Column(name = "creation_date")
	private long CreationDate;

	@Column(name = "login_type")
	private String LoginType;

	@Column(name = "account_locked")
	private boolean accountNonLocked;

	@Column(name = "account_expired")
	private boolean accountNonExpired;

	@Column(name = "credentials_expired")
	private boolean credentialsNonExpired;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "role_user", joinColumns = {
			@JoinColumn(name = "user_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "role_id", referencedColumnName = "id") })

	public int getId() {
		return Id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getUserProfileName() {
		return UserProfileName;
	}

	public void setUserProfileName(String userProfileName) {
		UserProfileName = userProfileName;
	}

	public long getCreationDate() {
		return CreationDate;
	}

	public void setCreationDate(long creationDate) {
		CreationDate = creationDate;
	}

	public String getLoginType() {
		return LoginType;
	}

	public void setLoginType(String loginType) {
		LoginType = loginType;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public boolean isAccountNonExpired() {
		return !accountNonExpired;
	}

	public boolean isCredentialsNonExpired() {
		return !credentialsNonExpired;
	}

	public boolean isAccountNonLocked() {
		return !accountNonLocked;
	}

}
