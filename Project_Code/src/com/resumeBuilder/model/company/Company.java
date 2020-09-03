package com.resumeBuilder.model.company;
import java.io.Serializable;

public class Company implements Serializable{
	
	private String comUserName;
	private String comPassWord;
	private String comFullName;
	private String comEmailId;
	private String reqEmployeeType;
	private String comType;
	private String comHeadAddress;
	private String comMainConNo;
	
	
	public Company(String comUserName, String comPassWord, String comFullName, String comEmailId, String reqEmployeeType,
			String comType, String comHeadAddress, String comMainConNo) {

		this.comUserName = comUserName;
		this.comPassWord = comPassWord;
		this.comFullName = comFullName;
		this.comEmailId = comEmailId;
		this.reqEmployeeType = reqEmployeeType;
		this.comType = comType;
		this.comHeadAddress = comHeadAddress;
		this.comMainConNo = comMainConNo;
	}
	public String getComUserName() {
		return comUserName;
	}
	public void setComUserName(String comUserName) {
		this.comUserName = comUserName;
	}
	public String getComPassWord() {
		return comPassWord;
	}
	public void setComPassWord(String comPassWord) {
		this.comPassWord = comPassWord;
	}
	public String getComFullName() {
		return comFullName;
	}
	public void setComFullName(String comFullName) {
		this.comFullName = comFullName;
	}
	public String getComEmailId() {
		return comEmailId;
	}
	public void setComEmailId(String comEmailId) {
		this.comEmailId = comEmailId;
	}
	public String getReqEmployeeType() {
		return reqEmployeeType;
	}
	public void setReqEmployeeType(String reqEmployeeType) {
		this.reqEmployeeType = reqEmployeeType;
	}
	public String getComType() {
		return comType;
	}
	public void setComType(String comType) {
		this.comType = comType;
	}
	public String getComHeadAddress() {
		return comHeadAddress;
	}
	public void setComHeadAddress(String comHeadAddress) {
		this.comHeadAddress = comHeadAddress;
	}
	public String getComMainConNo() {
		return comMainConNo;
	}
	public void setComMainConNo(String comMainConNo) {
		this.comMainConNo = comMainConNo;
	}
}

