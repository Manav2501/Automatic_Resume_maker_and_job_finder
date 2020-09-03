package com.resumeBuilder.controller.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.resumeBuilder.controller.company.FindCompany;
import com.resumeBuilder.model.company.Company;
import com.resumeBuilder.model.company.CompanyStorage;
import com.resumeBuilder.view.admin.mngCompany.AdmMngCompanyView;
import com.resumeBuilder.view.admin.mngCompany.AdmRemoveComByName;

public class RemoveCompListener implements ActionListener {

	private AdmRemoveComByName removeCompView;
	
	public RemoveCompListener(AdmRemoveComByName removeCompView) {
		this.removeCompView = removeCompView;
	}
	
@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getActionCommand().equals("<--")){
				AdmMngCompanyView frame = new AdmMngCompanyView();
				frame.setVisible(true);
				removeCompView.setVisible(false);
			}
			else{
				ArrayList<Company> companies = new ArrayList<>();
				companies = CompanyStorage.readCompanies();
				if(companies != null){
					Company obj = FindCompany.findCompanyName(companies,removeCompView.getTxtComName());
					if(obj == null){
						JOptionPane.showMessageDialog(null, "Username not match");
					}
					else{
						int cnt = 0,isFound = 0,key=0;
						for (Company temp : companies) {
							if (temp.getComUserName().equals(removeCompView.getTxtComName())) {
								key = cnt;
								isFound = 1;
							}
							cnt++;
						}
						if(isFound != 0){
							companies.remove(key);
							JOptionPane.showMessageDialog(null,"Company Account Removed Successfully...");
							AdmMngCompanyView frame= new AdmMngCompanyView();
							frame.setVisible(true);
							removeCompView.setVisible(false);
						}
						else{
							JOptionPane.showMessageDialog(null, "Username not match");
						}
						CompanyStorage.writeCompanyList(companies);
				
					}
				}
				else{
						JOptionPane.showMessageDialog(null, "File not Found");
					}
				}
		} catch (Exception error) {
			error.printStackTrace();
			}
		
		}
		
}
