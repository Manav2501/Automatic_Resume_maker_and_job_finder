package com.resumeBuilder.controller.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.resumeBuilder.model.company.Company;
import com.resumeBuilder.view.company.DifferentUsersView;
import com.resumeBuilder.view.company.DisplayUsersDtls;

public class DsplyUsrDtlsListener implements ActionListener{
	
	private DisplayUsersDtls usersDtlsView;
	private Company obj;
	
	public DsplyUsrDtlsListener(DisplayUsersDtls usersDtlsView, Company obj) {
		this.usersDtlsView = usersDtlsView;
		this.obj = obj;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {
			DifferentUsersView diffUsersView = new DifferentUsersView(obj);
			diffUsersView.setVisible(true);
			usersDtlsView.setVisible(false);
		} catch (Exception error) {
			error.printStackTrace();
		}
	}
	
	
	
	

}
