package com.resumeBuilder.view.admin;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.resumeBuilder.controller.admin.AdmOptionsListener;
import com.resumeBuilder.view.MainView;
import com.resumeBuilder.view.admin.mngCompany.AdmMngCompanyView;
import com.resumeBuilder.view.admin.mngUser.AdmMngUserView;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class AdminManagementView extends JFrame {

	private JPanel contentPane;
	private JLabel lblAdminMenu;
	private JButton btnManageUsers;
	private JButton btnManageCompany;
	private JButton btnLogOut;
	private JLabel lblLogOut;
	
	public AdminManagementView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAdminMenu = new JLabel("ADMIN MENU");
		lblAdminMenu.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAdminMenu.setBounds(170, 13, 101, 37);
		contentPane.add(lblAdminMenu);
		
		btnManageUsers = new JButton("Manage Users");
		btnManageUsers.addActionListener(new AdmOptionsListener(this)); 
		btnManageUsers.setFont(new Font("Tahoma", Font.ITALIC, 14));
		btnManageUsers.setBounds(120, 96, 197, 25);
		contentPane.add(btnManageUsers);
		
		btnManageCompany = new JButton("Manage Company");
		btnManageCompany.addActionListener(new AdmOptionsListener(this));
		btnManageCompany.setFont(new Font("Tahoma", Font.ITALIC, 14));
		btnManageCompany.setBounds(120, 149, 197, 25);
		contentPane.add(btnManageCompany);
		
		btnLogOut = new JButton("[->");
		btnLogOut.addActionListener(new AdmOptionsListener(this));
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogOut.setBounds(361, 20, 63, 23);
		contentPane.add(btnLogOut);
		
		lblLogOut = new JLabel("Log Out");
		lblLogOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOut.setBounds(361, 45, 63, 14);
		contentPane.add(lblLogOut);
	}
}
