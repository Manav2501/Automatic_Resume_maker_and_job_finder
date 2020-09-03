package com.resumeBuilder.controller.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import com.resumeBuilder.model.admin.Admin;
import com.resumeBuilder.view.admin.AdminLoginView;
import com.resumeBuilder.view.admin.AdminManagementView;

public class AdmLoginListener implements ActionListener  {
	
	private AdminLoginView admLoginview;

	public AdmLoginListener(AdminLoginView admLoginview) {
		this.admLoginview = admLoginview;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Admin adm = new Admin();
			if(admLoginview.getTxtAdminID().equals(adm.getAdmUserName()) && admLoginview.getPasswordField().equals(adm.getAdmPassWord())){
				JOptionPane.showMessageDialog(null, "Login successfully...");
				AdminManagementView frame = new AdminManagementView();
				frame.setVisible(true);
				admLoginview.setVisible(false);
				}
			else{
				JOptionPane.showMessageDialog(null, "AdminID or Password is incorrect");
				}
		} catch (Exception error) {
			
			error.printStackTrace();
		}
		
	}
	
	

}
