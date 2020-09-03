package com.resumeBuilder.model.user;

import java.io.Serializable;

public  class UserOtherDtls implements Serializable {
	
	private String usrInterest;
	private String usrHobbies ;
	private String usrAchievements;
	private String usrCurricular;
	
	public UserOtherDtls(String usrInterest, String usrHobbies, String usrAchievements, String usrCurricular) {
		this.usrInterest = usrInterest;
		this.usrHobbies = usrHobbies;
		this.usrAchievements = usrAchievements;
		this.usrCurricular = usrCurricular;
	}
	public String getUsrInterest() {
		return usrInterest;
	}
	public void setUsrInterest(String usrInterest) {
		this.usrInterest = usrInterest;
	}
	public String getUsrHobbies() {
		return usrHobbies;
	}
	public void setUsrHobbies(String usrHobbies) {
		this.usrHobbies = usrHobbies;
	}
	public String getUsrAchievements() {
		return usrAchievements;
	}
	public void setUsrAchievements(String usrAchievements) {
		this.usrAchievements = usrAchievements;
	}
	public String getUsrCurricular() {
		return usrCurricular;
	}
	public void setUsrCurricular(String usrCurricular) {
		this.usrCurricular = usrCurricular;
	}

	
}
