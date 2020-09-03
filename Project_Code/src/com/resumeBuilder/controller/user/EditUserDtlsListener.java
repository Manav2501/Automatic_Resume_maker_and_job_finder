package com.resumeBuilder.controller.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.resumeBuilder.model.user.User;
import com.resumeBuilder.view.MainView;
import com.resumeBuilder.view.user.EditUserActvs;
import com.resumeBuilder.view.user.EditUserDtls;
import com.resumeBuilder.view.user.EditUserEduInfo;
import com.resumeBuilder.view.user.EditUserPerInfo;
import com.resumeBuilder.view.user.EditUserPrj;
import com.resumeBuilder.view.user.UserEditOptions;

public class EditUserDtlsListener implements ActionListener{

	private EditUserDtls esitDtlsView;
	private User obj;

	public EditUserDtlsListener(EditUserDtls view,User obj) {
		esitDtlsView = view;
		this.obj = obj;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getActionCommand().equals("<--")){
				UserEditOptions userEditOptionView = new UserEditOptions(obj);
				userEditOptionView.setVisible(true);
				esitDtlsView.setVisible(false);
			}
			else if(e.getActionCommand().equals("[->")){
				MainView mainView = new MainView();
				mainView.setVisible(true);
				esitDtlsView.setVisible(false);
			}
			else if(e.getActionCommand().equals("Add Other Activities")){
				EditUserActvs editUserActvsView = new EditUserActvs(obj);
				editUserActvsView.setVisible(true);
				esitDtlsView.setVisible(false);
			}
			else if(e.getActionCommand().equals("Add Your Project")){
				EditUserPrj editUserPrjView = new EditUserPrj(obj);
				editUserPrjView.setVisible(true);
				esitDtlsView.setVisible(false);
			}
			else if(e.getActionCommand().equals("Edit Personal Information")){
				EditUserPerInfo editUserPerInfoView = new EditUserPerInfo(obj);
				editUserPerInfoView.setVisible(true);
				esitDtlsView.setVisible(false);
			}
			else{
				EditUserEduInfo editUserEduInfoView = new EditUserEduInfo(obj);
				editUserEduInfoView.setVisible(true);
				esitDtlsView.setVisible(false);
			}
		} catch (Exception error) {
			error.printStackTrace();
		}
		
	}
	
	
}
