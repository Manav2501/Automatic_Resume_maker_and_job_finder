package com.resumeBuilder.view.user;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.resumeBuilder.controller.user.AccCreationListener;
import com.resumeBuilder.model.user.User;
import com.resumeBuilder.model.user.UserEduDtls;
import com.resumeBuilder.model.user.UserOtherDtls;
import com.resumeBuilder.model.user.UserPersonalDtls;
import com.resumeBuilder.model.user.UserProjectDtls;
import com.resumeBuilder.model.user.UserStorage;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class UserAccountCreation extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JTextField txtEmail;
	private JTextField txtFirstName;
	private JPasswordField txtPwd;
	private JPasswordField txtConPwd;
	private JTextField txtLastName;
	private JLabel lblTitle;
	private JLabel lblUserName;
	private JLabel lblPwd;
	private JLabel lblEmail ;
	private JLabel lblConfirmPwd ;
	private JLabel lblFirstName ;
	private JButton btnAccCreate;
	private JLabel lblLastName;

	public String getTxtLastName() {
		return txtLastName.getText();
	}

	public String getTxtUserName() {
		return txtUserName.getText();
	}

	public String getTxtEmail() {
		return txtEmail.getText();
	}

	public String getTxtFirstName() {
		return txtFirstName.getText();
	}

	public String getTxtPwd() {
		return txtPwd.getText();
	}

	public String getTxtConPwd() {
		return txtConPwd.getText();
	}

	
	public UserAccountCreation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setBounds(100, 100, 450, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 lblTitle = new JLabel("CREATE A NEW ACCOUNT");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setBounds(116, 11, 189, 14);
		contentPane.add(lblTitle);
		
		 lblUserName = new JLabel("User name  ");
		lblUserName.setForeground(Color.BLACK);
		lblUserName.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblUserName.setBackground(Color.BLACK);
		lblUserName.setBounds(10, 49, 93, 23);
		contentPane.add(lblUserName);
		
		 lblPwd = new JLabel("Password");
		lblPwd.setForeground(Color.BLACK);
		lblPwd.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblPwd.setBounds(10, 83, 68, 23);
		contentPane.add(lblPwd);
		
		 lblEmail = new JLabel("Email ID");
		lblEmail.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblEmail.setBounds(10, 156, 68, 14);
		contentPane.add(lblEmail);
		
		 lblConfirmPwd = new JLabel("Confirm Password");
		lblConfirmPwd.setForeground(Color.BLACK);
		lblConfirmPwd.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblConfirmPwd.setBounds(10, 117, 118, 23);
		contentPane.add(lblConfirmPwd);
		
		 lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(Color.BLACK);
		lblFirstName.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblFirstName.setBackground(Color.BLACK);
		lblFirstName.setBounds(10, 181, 93, 23);
		contentPane.add(lblFirstName);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(146, 52, 253, 20);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(146, 155, 253, 20);
		contentPane.add(txtEmail);
		
		txtFirstName = new JTextField();
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(146, 184, 253, 20);
		contentPane.add(txtFirstName);
		
		txtPwd = new JPasswordField();
		txtPwd.setBounds(146, 85, 253, 23);
		contentPane.add(txtPwd);
		
		txtConPwd = new JPasswordField();
		txtConPwd.setBounds(146, 120, 253, 23);
		contentPane.add(txtConPwd);
		
		 btnAccCreate = new JButton("Create Account");
		btnAccCreate.addActionListener(new AccCreationListener(this)) ;
		btnAccCreate.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAccCreate.setBounds(146, 257, 143, 23);
		contentPane.add(btnAccCreate);
		
		 lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(Color.BLACK);
		lblLastName.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblLastName.setBackground(Color.BLACK);
		lblLastName.setBounds(10, 215, 93, 23);
		contentPane.add(lblLastName);
		
		txtLastName = new JTextField();
		txtLastName.setColumns(10);
		txtLastName.setBounds(146, 218, 253, 20);
		contentPane.add(txtLastName);
	}
}
