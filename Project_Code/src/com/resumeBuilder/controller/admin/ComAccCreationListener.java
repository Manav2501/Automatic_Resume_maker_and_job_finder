package com.resumeBuilder.controller.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.resumeBuilder.model.company.Company;
import com.resumeBuilder.model.company.CompanyStorage;
import com.resumeBuilder.view.admin.mngCompany.AdmComAccCreation;
import com.resumeBuilder.view.admin.mngCompany.AdmMngCompanyView;

public class ComAccCreationListener implements ActionListener{

	private AdmComAccCreation comAccView;

	public ComAccCreationListener(AdmComAccCreation comAccView) {

		this.comAccView = comAccView;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			if(comAccView.getTxtComPwd().trim().equals("") || comAccView.getTxtComConfirmPwd().trim().equals("") || comAccView.getTxtComUserName().trim().equals("") || comAccView.getTxtComEmail().trim().equals("") || comAccView.getTxtComFullName().trim().equals("")){
				throw new Exception("Not Valid");
			}
			else if(comAccView.getTxtComPwd().trim().equals("") && comAccView.getTxtComConfirmPwd().trim().equals("") && comAccView.getTxtComUserName().trim().equals("") && comAccView.getTxtComEmail().trim().equals("") && comAccView.getTxtComFullName().trim().equals("")){
				throw new Exception("Not Valid");
			}
			else{
				int flag = 0;
				ArrayList<Company> companies = new ArrayList<>();
				companies = CompanyStorage.readCompanies();
				if(companies != null){
					for(Company temp : companies){
						if(comAccView.getTxtComUserName().equals(temp.getComUserName()) || comAccView.getTxtComEmail().equals(temp.getComEmailId())){
							JOptionPane.showMessageDialog(null, "This UserName or EmailId is used already please use different");
							flag = 1;
						}
					}
				}
				if(flag == 0){
					if(comAccView.getTxtComConfirmPwd().equals(comAccView.getTxtComPwd())){
						Company newCompany = new Company (comAccView.getTxtComUserName(),comAccView.getTxtComPwd(),comAccView.getTxtComFullName(),comAccView.getTxtComEmail(),"<None>","<None>","<None>","<None>");
						CompanyStorage.writeCompanyFile(newCompany);
						JOptionPane.showMessageDialog(null, "Account Created successfully...");
						AdmMngCompanyView frame = new AdmMngCompanyView();
						frame.setVisible(true);
						comAccView.setVisible(false);
					}
					else{
						JOptionPane.showMessageDialog(null, "Password and Confirm_Password is not the same");
					}
				}
			}	
		}
		catch(Exception err){
			JOptionPane.showMessageDialog(null, "Fill out all details", "ERROR IN CREATING ACCOUNT", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}

}
