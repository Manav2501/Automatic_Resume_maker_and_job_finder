package com.resumeBuilder.view.admin.mngUser;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import com.resumeBuilder.controller.admin.DispAllUserListener;
import com.resumeBuilder.model.user.User;
import com.resumeBuilder.model.user.UserStorage;

public class AdmDispAllUsers extends JFrame {

	private JPanel contentPane;
	private JButton btnBack;
	private JLabel lblBack;
	private JLabel lblUsername;
	private JLabel lblUserList;
	
	
	public AdmDispAllUsers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 279);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		JScrollPane ScrUsrList = new JScrollPane(contentPane,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		contentPane.add(new JLabel("   "));
		
		btnBack = new JButton("<--");
		btnBack.addActionListener(new DispAllUserListener(this));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnBack);
		
		lblBack = new JLabel("     back");
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBack);
		 lblUserList = new JLabel("                          Users List");
		lblUserList.setFont(new Font("Arial",Font.BOLD,20));
		contentPane.add(lblUserList);

		contentPane.add(new JLabel("   "));
		
		
		ArrayList<User> disp = new ArrayList<>();
		disp = UserStorage.readUsers();
	
			for(User temp : disp){
				
				 lblUsername = new JLabel(temp.getUsrUserName());
			
				contentPane.add(lblUsername);
				contentPane.add(new JLabel("   "));
			}
		
		getContentPane().add(ScrUsrList);
		setLocationRelativeTo(null);
		
	}
}

