package com.resumeBuilder.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.resumeBuilder.view.MainView;
import com.resumeBuilder.view.admin.AdminLoginView;
import com.resumeBuilder.view.company.CompanyLogin;
import com.resumeBuilder.view.user.UserAccountCreation;
import com.resumeBuilder.view.user.UserLoginView;

public   class MainViewController implements ActionListener{
	private MainView mainView;
	
	public MainViewController(MainView view){
		mainView = view;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("User Login")){
			UserLoginView login = new UserLoginView();
			login.setVisible(true);
		}
		else if(e.getActionCommand().equals("Sign Up")){
			UserAccountCreation signUp = new UserAccountCreation();
			signUp.setVisible(true);
		}
		else if(e.getActionCommand().equals("Admin Login")){
			AdminLoginView admLogin = new AdminLoginView();
			admLogin.setVisible(true);
		}
		else{
			CompanyLogin comLogin = new CompanyLogin();
			comLogin.setVisible(true);
		}
		
		mainView.setVisible(false);
	//	instance.setVisible(false);

		}
	

}
