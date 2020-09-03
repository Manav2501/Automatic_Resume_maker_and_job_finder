package com.resumeBuilder.controller.admin;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.resumeBuilder.controller.company.FindCompany;
import com.resumeBuilder.model.company.Company;
import com.resumeBuilder.model.company.CompanyStorage;
import com.resumeBuilder.view.admin.mngCompany.AdmCompDtlsDsply;
import com.resumeBuilder.view.admin.mngCompany.AdmMngCompanyView;
import com.resumeBuilder.view.admin.mngCompany.AdmSrchCompByName;

public class SearchCompListener implements ActionListener {
	
	private AdmSrchCompByName searchCompView;

	public SearchCompListener(AdmSrchCompByName searchCompView) {
		
		this.searchCompView = searchCompView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			if(e.getActionCommand().equals("<--")){
				AdmMngCompanyView frame = new AdmMngCompanyView();
				frame.setVisible(true);
				searchCompView.setVisible(false);
			}
			else{
				ArrayList<Company> companies = new ArrayList<>();
				companies = CompanyStorage.readCompanies();
				if(companies != null){
					Company obj = FindCompany.findCompanyName(companies, searchCompView.getTxtUsrName());
					if(obj == null){
						JOptionPane.showMessageDialog(null, "Company Username not match");
						}
					else{
						AdmCompDtlsDsply frame = new AdmCompDtlsDsply(obj);
						frame.setVisible(true);
						searchCompView.setVisible(false);
						}
					}
				else{
						JOptionPane.showMessageDialog(null, "File not found");
					}
			}
		} catch (Exception error) {
			// TODO Auto-generated catch block
			error.printStackTrace();
		}
		
	}
	
	

}
