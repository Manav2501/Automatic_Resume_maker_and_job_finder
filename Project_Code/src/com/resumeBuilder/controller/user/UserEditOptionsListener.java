package com.resumeBuilder.controller.user;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.resumeBuilder.model.user.MakePDF;
import com.resumeBuilder.model.user.User;
import com.resumeBuilder.view.MainView;
import com.resumeBuilder.view.user.EditUserDtls;
import com.resumeBuilder.view.user.UserEditOptions;

public class UserEditOptionsListener implements ActionListener {
	
	private UserEditOptions editOptionView;
	private User obj;

	public UserEditOptionsListener(UserEditOptions view,User obj) {
		editOptionView = view;
		this.obj = obj;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getActionCommand().equals("[->")){
				MainView mainView = new MainView();
				mainView.setVisible(true);
				editOptionView.setVisible(false);
			}
			else if(e.getActionCommand().equals("Edit Details")){
				EditUserDtls frame = new EditUserDtls(obj);
				frame.setVisible(true);
				editOptionView.setVisible(false);
			}
			else{
				boolean isPDFCreated = MakePDF.makeResumePdf(obj);
				if(isPDFCreated == true){
					JOptionPane.showMessageDialog(null, "PDF named 'Resume' created successfully at your desktop");
				}
				else{
					JOptionPane.showMessageDialog(null, "PDF creation unsuccessful ");
				}
			}
		} 
		catch (Exception error) {
			error.printStackTrace();
		}
	}
		
}
