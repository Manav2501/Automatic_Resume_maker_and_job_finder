package com.resumeBuilder.controller.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.resumeBuilder.model.company.Company;
import com.resumeBuilder.view.MainView;
import com.resumeBuilder.view.company.CompanyOptionsView;
import com.resumeBuilder.view.company.DifferentUsersView;
import com.resumeBuilder.view.company.DisplayUsersDtls;

public class DiffUsersViewListener implements ActionListener{
	
	private DifferentUsersView diffUserView;
	
	private Company obj;
	
	public DiffUsersViewListener(DifferentUsersView diffUserView,Company obj) {
		
		this.diffUserView = diffUserView;
		this.obj = obj;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			if(e.getActionCommand().equals("<--")){
				CompanyOptionsView  comOptionsView = new CompanyOptionsView(obj) ;
				comOptionsView.setVisible(true);
				diffUserView.setVisible(false);
			}
			else if(e.getActionCommand().equals("[->")){
				MainView mainView = new MainView();
				mainView.setVisible(true);
				diffUserView.setVisible(false);
			}
			else{
				DisplayUsersDtls usersDtlsView = new DisplayUsersDtls(obj,diffUserView.getComboUserType());
				usersDtlsView.setVisible(true);
				diffUserView.setVisible(false);
			}
		} catch (Exception error) {
			error.printStackTrace();
		}
		
	}
	
	
	
	
	

}
