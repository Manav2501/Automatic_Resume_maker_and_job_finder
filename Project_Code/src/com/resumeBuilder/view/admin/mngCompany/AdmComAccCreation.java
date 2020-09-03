package com.resumeBuilder.view.admin.mngCompany;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.resumeBuilder.controller.admin.ComAccCreationListener;
import com.resumeBuilder.model.company.Company;
import com.resumeBuilder.model.company.CompanyStorage;

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

public class AdmComAccCreation extends JFrame {

	private JPanel contentPane;
	private JTextField txtComUserName;
	private JTextField txtComEmail;
	private JTextField txtComFullName;
	private JLabel lblTitle;
	private JLabel lblComUserName;
	private JLabel lblComPwd;
	private JLabel lblComConfirmPwd;
	private JLabel lblComFullName;
	private JLabel lblComEmail;
	private JPasswordField txtComPwd;
	private JPasswordField txtComConfirmPwd;
	private JButton btnComCreateAcc; 
	
	public String getTxtComUserName() {
		return txtComUserName.getText();
	}

	public String getTxtComPwd() {
		return txtComPwd.getText();
	}

	public String getTxtComConfirmPwd() {
		return txtComConfirmPwd.getText();
	}

	public String getTxtComEmail() {
		return txtComEmail.getText();
	}

	public String getTxtComFullName() {
		return txtComFullName.getText();
	}

	public AdmComAccCreation() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitle = new JLabel("CREATE A NEW ACCOUNT");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setBounds(124, 11, 189, 14);
		contentPane.add(lblTitle);
		
		lblComUserName = new JLabel("User name  ");
		lblComUserName.setForeground(Color.BLACK);
		lblComUserName.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblComUserName.setBackground(Color.BLACK);
		lblComUserName.setBounds(10, 56, 93, 23);
		contentPane.add(lblComUserName);
		
		lblComPwd = new JLabel("Password");
		lblComPwd.setForeground(Color.BLACK);
		lblComPwd.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblComPwd.setBackground(Color.BLACK);
		lblComPwd.setBounds(10, 90, 93, 23);
		contentPane.add(lblComPwd);
		
		lblComConfirmPwd = new JLabel("Confirm Password");
		lblComConfirmPwd.setForeground(Color.BLACK);
		lblComConfirmPwd.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblComConfirmPwd.setBackground(Color.BLACK);
		lblComConfirmPwd.setBounds(10, 124, 117, 23);
		contentPane.add(lblComConfirmPwd);
		
		lblComEmail = new JLabel("Email ID");
		lblComEmail.setForeground(Color.BLACK);
		lblComEmail.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblComEmail.setBackground(Color.BLACK);
		lblComEmail.setBounds(10, 158, 93, 23);
		contentPane.add(lblComEmail);
		
		lblComFullName = new JLabel("Full Name");
		lblComFullName.setForeground(Color.BLACK);
		lblComFullName.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblComFullName.setBackground(Color.BLACK);
		lblComFullName.setBounds(10, 192, 93, 23);
		contentPane.add(lblComFullName);
		
		txtComUserName = new JTextField();
		txtComUserName.setColumns(10);
		txtComUserName.setBounds(152, 59, 253, 20);
		contentPane.add(txtComUserName);
		
		txtComEmail = new JTextField();
		txtComEmail.setColumns(10);
		txtComEmail.setBounds(152, 161, 253, 20);
		contentPane.add(txtComEmail);
		
		txtComFullName = new JTextField();
		txtComFullName.setColumns(10);
		txtComFullName.setBounds(152, 195, 253, 20);
		contentPane.add(txtComFullName);
		
		 btnComCreateAcc = new JButton("Create Account");
		btnComCreateAcc.addActionListener(new ComAccCreationListener(this));
		btnComCreateAcc.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnComCreateAcc.setBounds(152, 226, 143, 23);
		contentPane.add(btnComCreateAcc);
		
		txtComPwd = new JPasswordField();
		txtComPwd.setBounds(152, 90, 253, 23);
		contentPane.add(txtComPwd);
		
		txtComConfirmPwd = new JPasswordField();
		txtComConfirmPwd.setBounds(152, 124, 253, 23);
		contentPane.add(txtComConfirmPwd);
	}
}