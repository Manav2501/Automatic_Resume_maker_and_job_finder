package com.resumeBuilder.controller.user;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.resumeBuilder.model.user.User;
import com.resumeBuilder.model.user.UserStorage;
import com.resumeBuilder.view.user.UserEditOptions;
import com.resumeBuilder.view.user.UserLoginView;

public class UserLoginListener implements ActionListener{
	
	private UserLoginView userLoginView;

	public UserLoginListener(UserLoginView view) {
		userLoginView = view;
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			ArrayList<User> user = new ArrayList<>();
			user = UserStorage.readUsers();
			if(user != null){
				User obj = FindUser.findUser(user,userLoginView.getTxtUsrName(),userLoginView.getPasswordField());
				if(obj == null){
					JOptionPane.showMessageDialog(null, "Username or Password is incorrect");
					}
				else{
					JOptionPane.showMessageDialog(null, "Login successfully...");
					UserEditOptions frame = new UserEditOptions(obj);
					frame.setVisible(true);
					userLoginView.setVisible(false);
					}
			}
			else{
					JOptionPane.showMessageDialog(null, "Username or Password is incorrect");
				}
		} 
		
		catch (Exception error) {
			error.printStackTrace();
			}
		
		}
	
}
