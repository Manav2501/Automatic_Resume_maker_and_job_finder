package com.resumeBuilder.model.user;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
	
	private String usrUserName;
	private String usrPassWord;
	private String usrFName;
	private String usrLName;
	private String usrEmailId;
	private UserOtherDtls otherDtls ;
	private UserPersonalDtls personalDtls;
	private ArrayList<UserEduDtls> eduDtls;
	private UserProjectDtls prjDtls;
	
	
	public User(String usrUserName, String usrPassWord, String usrFName, String usrLName, String usrEmailId,
			UserOtherDtls otherDtls, UserPersonalDtls personalDtls, ArrayList<UserEduDtls> eduDtls,
			UserProjectDtls prjDtls) {
		
		this.usrUserName = usrUserName;
		this.usrPassWord = usrPassWord;
		this.usrFName = usrFName;
		this.usrLName = usrLName;
		this.usrEmailId = usrEmailId;
		this.otherDtls = otherDtls;
		this.personalDtls = personalDtls;
		this.eduDtls = setListAtBegining(eduDtls);
		this.prjDtls = prjDtls;
	}

	public UserProjectDtls getPrj() {
		return prjDtls;
	}
	
	public void setPrj(UserProjectDtls prj) {
		this.prjDtls = prj;
	}

	public UserOtherDtls getOtherDtls() {
		return otherDtls;
	}

	public void setOtherDtls(UserOtherDtls other) {
		this.otherDtls = other;
	}

	public UserPersonalDtls getPersonal() {
		return personalDtls;
	}

	public void setPersonal(UserPersonalDtls personal) {
		this.personalDtls = personal;
	}

	public static ArrayList<UserEduDtls> setListAtBegining(ArrayList<UserEduDtls> ref){
		ref.add(new UserEduDtls("S.S.C","<None>","<None>","<None>","0.0","<None>","<None>"));
		ref.add(new UserEduDtls("H.S.C","<None>","<None>","<None>","0.0","<None>","<None>"));
		ref.add(new UserEduDtls("Graduation","<None>","<None>","<None>","0.0","<None>","<None>"));
		
		return ref;
	}
	
	public String getUsrEmailId() {
		return usrEmailId;
	}

	public void setUsrEmailId(String usrEmailId) {
		this.usrEmailId = usrEmailId;
	}

	public ArrayList<UserEduDtls> getArr() {
		return eduDtls;
	}

	public void setArr(ArrayList<UserEduDtls> arr) {
		this.eduDtls = arr;
	}

	public String getUsrUserName() {
		return usrUserName;
	}

	public void setUsrUserName(String usrUserName) {
		this.usrUserName = usrUserName;
	}

	public String getUsrFName() {
		return usrFName;
	}

	public void setUsrFName(String usrFName) {
		this.usrFName = usrFName;
	}

	public String getUsrLName() {
		return usrLName;
	}

	public void setUsrLName(String usrLName) {
		this.usrLName = usrLName;
	}

	public String getUsrPassWord() {
		return usrPassWord;
	}

	public void setUsrPassWord(String usrPassWord) {
		this.usrPassWord = usrPassWord;
	}

	
	
}