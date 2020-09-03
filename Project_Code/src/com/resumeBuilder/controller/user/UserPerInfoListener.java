package com.resumeBuilder.controller.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.resumeBuilder.model.user.User;
import com.resumeBuilder.model.user.UserPersonalDtls;
import com.resumeBuilder.model.user.UserStorage;
import com.resumeBuilder.view.user.EditUserDtls;
import com.resumeBuilder.view.user.EditUserPerInfo;

public class UserPerInfoListener implements ActionListener{

	private EditUserPerInfo editPerInfoView;
	private User obj;
	
	public UserPerInfoListener(EditUserPerInfo  view,User obj) {
		editPerInfoView = view;
		this.obj = obj;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			obj.setUsrEmailId(editPerInfoView.getTxtEmailId());
			ArrayList<User> user = new ArrayList<>();
			user = UserStorage.readUsers();
			int flag =0;
				for(User temp : user){
					if(editPerInfoView.getTxtEmailId().equals(temp.getUsrEmailId())){
						if (!(temp.getUsrUserName().equals(editPerInfoView.getTxtUserName()) && temp.getUsrPassWord().equals(editPerInfoView.getPasswordField())))
						{
							JOptionPane.showMessageDialog(null, "Use different Email Id   ");
							flag = 1;
						}
					}
				}
			if(flag == 0)	{
				UserPersonalDtls personal = new  UserPersonalDtls(editPerInfoView.getTxtDoB(),editPerInfoView.getComboUserGen(),editPerInfoView.getTxtConNo(),editPerInfoView.getTxtAddress(),editPerInfoView.getTxtAge(),editPerInfoView.getTxtNationality(),editPerInfoView.getComboMarital(),editPerInfoView.getTxtLangKnown());
				obj.setPersonal(personal);
				obj.setUsrFName(editPerInfoView.getTxtFName());
				obj.setUsrLName(editPerInfoView.getTxtLName());
				int cnt = 0,isFound = 0,key=0;
				for (User temp : user) {
					if (temp.getUsrUserName().equals(editPerInfoView.getTxtUserName()) && temp.getUsrPassWord().equals(editPerInfoView.getPasswordField())) {
						key = cnt;
						isFound = 1;
					}
					cnt++;
				}
				if(isFound != 0){
					user.remove(key);
					user.add(obj);
				}
				UserStorage.writeUserList(user);
				EditUserDtls frame = new EditUserDtls(obj);
				frame.setVisible(true);
				editPerInfoView.setVisible(false);
				}
		}catch (Exception error) {
			error.printStackTrace();
		}
	}
}
	
	
