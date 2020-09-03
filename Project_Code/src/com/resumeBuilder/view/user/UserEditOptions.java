package com.resumeBuilder.view.user;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.resumeBuilder.controller.user.UserEditOptionsListener;
import com.resumeBuilder.model.user.User;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class UserEditOptions extends JFrame {

	private JPanel contentPane;
	private  User obj;
	private JLabel lblProfile;
	private JButton btnMakeResume;
	private JButton btnEditDtls ;
	private JLabel lblLogOut;
	private JButton btnLogOut;

	public UserEditOptions(User object) {
		
		 this.obj = object;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 lblProfile = new JLabel("YOUR PROFILE");
		lblProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfile.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblProfile.setBounds(157, 11, 125, 37);
		contentPane.add(lblProfile);
		
	    btnEditDtls = new JButton("Edit Details");
		btnEditDtls.addActionListener(new UserEditOptionsListener(this,obj));
		btnEditDtls.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEditDtls.setBounds(120, 91, 197, 25);
		contentPane.add(btnEditDtls);
		
		 btnMakeResume = new JButton("Download Resume (PDF)");
		 btnMakeResume.addActionListener(new UserEditOptionsListener(this,obj));
		btnMakeResume.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMakeResume.setBounds(120, 135, 197, 25);
		contentPane.add(btnMakeResume);
		
		 lblLogOut = new JLabel("Log Out");
		lblLogOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOut.setBounds(346, 34, 75, 14);
		contentPane.add(lblLogOut);
		
		 btnLogOut = new JButton("[->");
		btnLogOut.addActionListener(new UserEditOptionsListener(this,obj)); 
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLogOut.setBounds(346, 11, 75, 23);
		contentPane.add(btnLogOut);
	}
}
