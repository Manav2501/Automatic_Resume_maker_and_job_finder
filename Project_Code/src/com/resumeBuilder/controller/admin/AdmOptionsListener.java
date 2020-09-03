package com.resumeBuilder.controller.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.resumeBuilder.view.MainView;
import com.resumeBuilder.view.admin.AdminManagementView;
import com.resumeBuilder.view.admin.mngCompany.AdmMngCompanyView;
import com.resumeBuilder.view.admin.mngUser.AdmMngUserView;

public class AdmOptionsListener implements ActionListener {
	
	private AdminManagementView admOptionsView;
	
	public AdmOptionsListener(AdminManagementView admOptionsView) {
		this.admOptionsView = admOptionsView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			if(e.getActionCommand().equals("Manage Users")){
				AdmMngUserView frame = new AdmMngUserView();
				frame.setVisible(true);
				admOptionsView.setVisible(false);
			}
			else if(e.getActionCommand().equals("[->")){
				MainView frame = new MainView();
				frame.setVisible(true);
				admOptionsView.setVisible(false);
			}
			else{
				AdmMngCompanyView frame = new AdmMngCompanyView();
				frame.setVisible(true);
				admOptionsView.setVisible(false);
			}
		} catch (Exception error) {
			error.printStackTrace();
		}
		
	}


}
