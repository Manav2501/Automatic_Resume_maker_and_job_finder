package com.resumeBuilder.controller.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import com.resumeBuilder.model.user.User;
import com.resumeBuilder.model.user.UserEduDtls;
import com.resumeBuilder.model.user.UserStorage;
import com.resumeBuilder.view.user.EditUserDtls;
import com.resumeBuilder.view.user.EditUserEduInfo;

public class EditEduInfoListener implements ActionListener {
	
	private EditUserEduInfo editEduInfoView;
	private User obj;
	
	public EditEduInfoListener(EditUserEduInfo view,User obj){
		
		editEduInfoView = view;
		this.obj = obj;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			ArrayList<UserEduDtls> arr = new ArrayList<>();
			ArrayList<User> user = new ArrayList<>();
			user = UserStorage.readUsers();
			obj.getArr().get(0).setUsrprofessionType(editEduInfoView.getComboProfessionType());
			obj.getArr().get(0).setUsrprofessionType(editEduInfoView.getTxtProfession());
			
			arr.add(new UserEduDtls("S.S.C",editEduInfoView.getTxtSscSchool(),editEduInfoView.getTxtSscPassing(),editEduInfoView.getTxtSscGrade(),editEduInfoView.getTxtSscPer(),editEduInfoView.getComboProfessionType(),editEduInfoView.getTxtProfession()));
			arr.add(new UserEduDtls("H.S.C",editEduInfoView.getTxtHscSchool(),editEduInfoView.getTxtHscPassing(),editEduInfoView.getTxtHscGrade(),editEduInfoView.getTxtHscPer(),editEduInfoView.getComboProfessionType(),editEduInfoView.getTxtProfession()));
			arr.add(new UserEduDtls("Degree",editEduInfoView.getTxtGradSchool(),editEduInfoView.getTxtGradPassing(),editEduInfoView.getTxtGradGrade(),editEduInfoView.getTxtGradPer(),editEduInfoView.getComboProfessionType(),editEduInfoView.getTxtProfession()));
			obj.setArr(arr);
			
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
			editEduInfoView.setVisible(false);
		} catch (Exception error) {
		
			error.printStackTrace();
		}
		
	}

}
