package com.resumeBuilder.controller.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.resumeBuilder.model.company.Company;
import com.resumeBuilder.view.MainView;
import com.resumeBuilder.view.company.CompanyOptionsView;
import com.resumeBuilder.view.company.DifferentUsersView;
import com.resumeBuilder.view.company.EditCompanyDtls;

public class CompOptionsListener implements ActionListener{
	
	private CompanyOptionsView compOptionView;
	private Company obj;

	public CompOptionsListener(CompanyOptionsView compOptionView,Company obj) {
		this.compOptionView = compOptionView;
		this.obj = obj; 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getActionCommand().equals("Edit Details")){
				EditCompanyDtls comInfo = new EditCompanyDtls(obj);
				comInfo.setVisible(true);
				compOptionView.setVisible(false);
			}
			else if(e.getActionCommand().equals("[->")){
				MainView mainView = new MainView();
				mainView.setVisible(true);
				compOptionView.setVisible(false);
			}
			else{
				DifferentUsersView frame = new DifferentUsersView(obj);
				frame.setVisible(true);
				compOptionView.setVisible(false);
			}
		} catch (Exception error) {
			error.printStackTrace();
		}
		
	}
	
	

}
