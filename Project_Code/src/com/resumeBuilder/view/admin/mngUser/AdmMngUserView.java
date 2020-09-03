package com.resumeBuilder.view.admin.mngUser;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.resumeBuilder.controller.admin.UserOptionsListener;
import com.resumeBuilder.view.MainView;
import com.resumeBuilder.view.admin.AdminManagementView;


public class AdmMngUserView extends JFrame {

	private JPanel contentPane;
	private JLabel lblMngUser;
	private JButton btnDispUsres;
	private JButton btnSearchByName;
	private JButton btnRemoveUser;
	private JButton btnLogOut;
	private JLabel lblLogOut;
	private JButton btnBack;
	private JLabel lblBack;
	
	public AdmMngUserView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMngUser = new JLabel("MANAGE USERS");
		lblMngUser.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMngUser.setBounds(159, 23, 122, 37);
		contentPane.add(lblMngUser);
		
		btnDispUsres = new JButton("Display All Users");
		btnDispUsres.addActionListener(new UserOptionsListener(this));
		btnDispUsres.setFont(new Font("Tahoma", Font.ITALIC, 14));
		btnDispUsres.setBounds(120, 79, 197, 25);
		contentPane.add(btnDispUsres);
		
		btnSearchByName = new JButton("Search By Name");
		btnSearchByName.addActionListener(new UserOptionsListener(this));
		btnSearchByName.setFont(new Font("Tahoma", Font.ITALIC, 14));
		btnSearchByName.setBounds(120, 133, 197, 25);
		contentPane.add(btnSearchByName);
		
		btnRemoveUser = new JButton("Remove User");
		btnRemoveUser.addActionListener(new UserOptionsListener(this));
		btnRemoveUser.setFont(new Font("Tahoma", Font.ITALIC, 14));
		btnRemoveUser.setBounds(120, 184, 197, 25);
		contentPane.add(btnRemoveUser);
		
		btnLogOut = new JButton("[->");
		btnLogOut.addActionListener(new UserOptionsListener(this));
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogOut.setBounds(361, 20, 63, 23);
		contentPane.add(btnLogOut);
		
		lblLogOut = new JLabel("Log Out");
		lblLogOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOut.setBounds(361, 45, 63, 14);
		contentPane.add(lblLogOut);
		
		btnBack = new JButton("<--");
		btnBack.addActionListener(new UserOptionsListener(this));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack.setBounds(10, 20, 63, 23);
		contentPane.add(btnBack);
		
		lblBack = new JLabel("Back");
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBack.setBounds(10, 45, 63, 14);
		contentPane.add(lblBack);
	}

}