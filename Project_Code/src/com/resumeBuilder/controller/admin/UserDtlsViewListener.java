package com.resumeBuilder.controller.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.resumeBuilder.view.admin.mngUser.AdmMngUserView;
import com.resumeBuilder.view.admin.mngUser.AdmUsrDtlsDsply;

public class UserDtlsViewListener implements ActionListener{
	
	private AdmUsrDtlsDsply userDtlsView;

	public UserDtlsViewListener(AdmUsrDtlsDsply userDtlsView) {
		this.userDtlsView = userDtlsView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			AdmMngUserView frame = new AdmMngUserView();
			frame.setVisible(true);
			userDtlsView.setVisible(false);
		} catch (Exception error) {
			error.printStackTrace();
		}
		
	}
	
}
