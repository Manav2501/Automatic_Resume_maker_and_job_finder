package com.resumeBuilder.model.user;

import java.io.Serializable;

public class UserEduDtls implements Serializable{
	
	private String boardType;
	private String nameOfSchool;
	private String passingYear;
	private String grade;
	private String percentage;
	private String usrprofessionType;
	private String usrprofession;
	
	
	public UserEduDtls(String boardType, String nameOfSchool, String passingYear, String grade, String percentage,
			String usrprofessionType, String usrprofession) {
		this.boardType = boardType;
		this.nameOfSchool = nameOfSchool;
		this.passingYear = passingYear;
		this.grade = grade;
		this.percentage = percentage;
		this.usrprofessionType = usrprofessionType;
		this.usrprofession = usrprofession;
	}

	public String getBoardType() {
		return boardType;
	}

	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}

	public String getNameOfSchool() {
		return nameOfSchool;
	}

	public void setNameOfSchool(String nameOfSchool) {
		this.nameOfSchool = nameOfSchool;
	}

	public String getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(String passingYear) {
		this.passingYear = passingYear;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getUsrprofessionType() {
		return usrprofessionType;
	}

	public void setUsrprofessionType(String usrprofessionType) {
		this.usrprofessionType = usrprofessionType;
	}

	public String getUsrprofession() {
		return usrprofession;
	}

	public void setUsrprofession(String usrprofession) {
		this.usrprofession = usrprofession;
	}
	
	
}
