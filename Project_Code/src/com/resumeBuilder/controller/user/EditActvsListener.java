package com.resumeBuilder.controller.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import com.resumeBuilder.model.user.User;
import com.resumeBuilder.model.user.UserStorage;
import com.resumeBuilder.view.user.EditUserActvs;
import com.resumeBuilder.view.user.EditUserDtls;

public class EditActvsListener implements ActionListener {
	
	private EditUserActvs editActvsView;
	private User obj;
	
	public EditActvsListener(EditUserActvs view, User obj) {
		editActvsView = view;
		this.obj = obj;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			ArrayList<User> user = new ArrayList<>();
			user = UserStorage.readUsers();
			obj.getOtherDtls().setUsrAchievements(editActvsView.getTxtAchieve());
			obj.getOtherDtls().setUsrCurricular(editActvsView.getTxtOther());
			obj.getOtherDtls().setUsrHobbies(editActvsView.getTxtHobbies());
			obj.getOtherDtls().setUsrInterest(editActvsView.getTxtInterests());
			
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
			editActvsView.setVisible(false);
		} catch (Exception error) {
			
			error.printStackTrace();
		}
		
	}
	
	

}
