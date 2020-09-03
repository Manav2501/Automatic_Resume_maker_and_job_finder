package com.resumeBuilder.controller.admin;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.resumeBuilder.controller.user.FindUser;
import com.resumeBuilder.model.user.User;
import com.resumeBuilder.model.user.UserStorage;
import com.resumeBuilder.view.admin.mngUser.AdmMngUserView;
import com.resumeBuilder.view.admin.mngUser.AdmSrchUserByUname;
import com.resumeBuilder.view.admin.mngUser.AdmUsrDtlsDsply;

public class SearchUserListener implements ActionListener {
	
	private AdmSrchUserByUname serachUserView;

	public SearchUserListener(AdmSrchUserByUname serachUserView) {
		this.serachUserView = serachUserView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		try {
			if(e.getActionCommand().equals("<--")){
				AdmMngUserView frame = new AdmMngUserView();
				frame.setVisible(true);
				serachUserView.setVisible(false);
			}
			else{
				ArrayList<User> user = new ArrayList<>();
				user = UserStorage.readUsers();
				if(user != null){
					User obj = FindUser.findUserName(user, serachUserView.getTxtUsrName());
					if(obj == null){
						JOptionPane.showMessageDialog(null, "Username not match");
						}
					else{
						AdmUsrDtlsDsply frame = new AdmUsrDtlsDsply(obj);
						frame.setVisible(true);
						serachUserView.setVisible(false);
						}
					}
				else{
						JOptionPane.showMessageDialog(null, "File not found");
					}
				}
		} catch (Exception error) {
			
			error.printStackTrace();
			}
		}
		
}
