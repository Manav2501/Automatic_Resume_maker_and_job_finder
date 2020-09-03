package com.resumeBuilder.view.admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.resumeBuilder.controller.admin.AdmLoginListener;


public class AdminLoginView extends JFrame {

	private JPanel contentPane;
	private JTextField txtAdminID;
	private JPasswordField passwordField;
	private JLabel lblUsrName;
	private JLabel lblPaswd;
	private JButton btnUsrLogin;
	private JLabel lblAdminLogin;
	
	public String getTxtAdminID() {
		return txtAdminID.getText();
	}

	public String getPasswordField() {
		return passwordField.getText();
	}

	public AdminLoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblUsrName = new JLabel("Admin ID ");
		lblUsrName.setForeground(Color.BLACK);
		lblUsrName.setBackground(Color.BLACK);
		lblUsrName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsrName.setBounds(65, 103, 93, 23);
		contentPane.add(lblUsrName);
		
		lblPaswd = new JLabel("Password");
		lblPaswd.setForeground(Color.BLACK);
		lblPaswd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPaswd.setBounds(65, 144, 68, 23);
		contentPane.add(lblPaswd);
		
		txtAdminID = new JTextField();
		txtAdminID.setBounds(158, 106, 157, 20);
		contentPane.add(txtAdminID);
		txtAdminID.setColumns(10);
		
		btnUsrLogin = new JButton("Login");
		btnUsrLogin.addActionListener(new AdmLoginListener(this)); 
		btnUsrLogin.setBackground(Color.WHITE);
		btnUsrLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnUsrLogin.setBounds(185, 216, 68, 23);
		contentPane.add(btnUsrLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(158, 144, 157, 20);
		contentPane.add(passwordField);
		
		 lblAdminLogin = new JLabel("Admin Login");
		lblAdminLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAdminLogin.setBounds(170, 27, 93, 33);
		contentPane.add(lblAdminLogin);
	}
}
