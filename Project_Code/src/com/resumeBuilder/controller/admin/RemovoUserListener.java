package com.resumeBuilder.controller.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.resumeBuilder.controller.user.FindUser;
import com.resumeBuilder.model.user.User;
import com.resumeBuilder.model.user.UserStorage;
import com.resumeBuilder.view.admin.mngUser.AdmMngUserView;
import com.resumeBuilder.view.admin.mngUser.AdmRemoveUsrByName;

public class RemovoUserListener implements ActionListener {
	
	private AdmRemoveUsrByName removeUserView;

	public RemovoUserListener(AdmRemoveUsrByName removeUserView) {
		this.removeUserView = removeUserView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			if(e.getActionCommand().equals("<--")){
				AdmMngUserView frame = new AdmMngUserView();
				frame.setVisible(true);
				removeUserView.setVisible(false);
			}
			else{
				ArrayList<User> user = new ArrayList<>();
				user = UserStorage.readUsers();
				if(user != null){
					User obj = FindUser.findUserName(user, removeUserView.getTxtUsrName());
					if(obj == null){
						JOptionPane.showMessageDialog(null, "Username not match");
					}
					else{
						int cnt = 0,isFound = 0,key=0;
						for (User temp : user) {
							if (temp.getUsrUserName().equals(removeUserView.getTxtUsrName())) {
								key = cnt;
								isFound = 1;
							}
							cnt++;
						}
						if(isFound != 0){
							user.remove(key);
							JOptionPane.showMessageDialog(null,"User Removed Successfully...");
							AdmMngUserView frame = new AdmMngUserView();
							frame.setVisible(true);
							removeUserView.setVisible(false);
						}
						else{
							JOptionPane.showMessageDialog(null, "Username not match");
						}
						UserStorage.writeUserList(user);
				
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
