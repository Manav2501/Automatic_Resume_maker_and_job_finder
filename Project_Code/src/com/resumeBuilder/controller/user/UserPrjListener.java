package com.resumeBuilder.controller.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import com.resumeBuilder.model.user.User;
import com.resumeBuilder.model.user.UserStorage;
import com.resumeBuilder.view.user.EditUserDtls;
import com.resumeBuilder.view.user.EditUserPrj;

public class UserPrjListener implements ActionListener {
	
	private EditUserPrj editPrjView;
	private User obj;
	
	public UserPrjListener(EditUserPrj view, User obj) {
		
		editPrjView = view;
		this.obj = obj;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {
			ArrayList<User> user = new ArrayList<>();
			user = UserStorage.readUsers();
			obj.getPrj().setPrjDescription(editPrjView.getTxtPrjDtls());
			obj.getPrj().setPrjTitle(editPrjView.getTxtPrjTitle());
			obj.getPrj().setPrjNoOfMembers(editPrjView.getTxtNoOfMembers());
			
			int cnt = 0,key = 0;
			for (User temp : user) {
				if (temp.getUsrUserName().equals(obj.getUsrUserName()) && temp.getUsrPassWord().equals(obj.getUsrPassWord())) {
					key = cnt;
				}
				cnt++;
			}
			user.remove(key);
			user.add(obj);
			UserStorage.writeUserList(user);

			EditUserDtls frame = new EditUserDtls(obj);
			frame.setVisible(true);
			editPrjView.setVisible(false);
		} 
		catch (Exception error) {
			error.printStackTrace();
		}
	}
}

