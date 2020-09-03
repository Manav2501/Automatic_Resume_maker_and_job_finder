package com.resumeBuilder.model.user;

import java.io.Serializable;

public class UserPersonalDtls implements Serializable{

	private String usrDob ;
	private String usrGender;
	private String usrConNo;
	private String usrAddress;
	private String usrAge;
	private String usrNationlity;
	private String usrMaritalStatus;
	private String usrLanguages;
	
	public UserPersonalDtls(String usrDob, String usrGender, String usrConNo, String usrAddress,
			String usrAge, String usrNationlity, String usrMaritalStatus,
			String usrLanguages) {
		
		this.usrDob = usrDob;
		this.usrGender = usrGender;
		this.usrConNo = usrConNo;
		this.usrAddress = usrAddress;
		this.usrAge = usrAge;
		this.usrNationlity = usrNationlity;
		this.usrMaritalStatus = usrMaritalStatus;
		this.usrLanguages = usrLanguages;
	}

	public String getUsrDob() {
		return usrDob;
	}

	public void setUsrDob(String usrDob) {
		this.usrDob = usrDob;
	}

	public String getUsrGender() {
		return usrGender;
	}

	public void setUsrGender(String usrGender) {
		this.usrGender = usrGender;
	}

	public String getUsrConNo() {
		return usrConNo;
	}

	public void setUsrConNo(String usrConNo) {
		this.usrConNo = usrConNo;
	}

	public String getUsrAddress() {
		return usrAddress;
	}

	public void setUsrAddress(String usrAddress) {
		this.usrAddress = usrAddress;
	}

	public String getUsrAge() {
		return usrAge;
	}

	public void setUsrAge(String usrAge) {
		this.usrAge = usrAge;
	}

	public String getUsrNationlity() {
		return usrNationlity;
	}

	public void setUsrNationlity(String usrNationlity) {
		this.usrNationlity = usrNationlity;
	}

	public String getUsrMaritalStatus() {
		return usrMaritalStatus;
	}

	public void setUsrMaritalStatus(String usrMaritalStatus) {
		this.usrMaritalStatus = usrMaritalStatus;
	}

	public String getUsrLanguages() {
		return usrLanguages;
	}

	public void setUsrLanguages(String usrLanguages) {
		this.usrLanguages = usrLanguages;
	}
	
	
}
