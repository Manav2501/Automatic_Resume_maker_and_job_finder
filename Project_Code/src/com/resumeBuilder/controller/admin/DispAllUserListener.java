package com.resumeBuilder.controller.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.resumeBuilder.view.admin.mngUser.AdmDispAllUsers;
import com.resumeBuilder.view.admin.mngUser.AdmMngUserView;

public class DispAllUserListener implements ActionListener{
	
	private AdmDispAllUsers dispAllUserView;

	public DispAllUserListener(AdmDispAllUsers dispAllUserView) {
		this.dispAllUserView = dispAllUserView;
	}


	public void actionPerformed(ActionEvent e) {
		try {
			AdmMngUserView frame1 =new AdmMngUserView();
			frame1.setVisible(true);
			dispAllUserView.setVisible(false);
		}
		catch (Exception error) {
			error.printStackTrace();
		}
		
	}
	
	

}
