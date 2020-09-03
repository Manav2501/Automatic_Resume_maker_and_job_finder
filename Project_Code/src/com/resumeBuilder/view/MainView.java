package com.resumeBuilder.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.resumeBuilder.controller.MainViewController;
import com.resumeBuilder.view.admin.AdminLoginView;
import com.resumeBuilder.view.user.UserAccountCreation;

public class MainView extends JFrame {

	private JPanel contentPane;
	private JLabel lblLogin;
	private JButton btnCompanyLogin;
	private JButton btnUserLogin;
	private JButton btnAdminLogin;
	private JButton btnSignUp;
	private JLabel lblOr;
	
	public MainView () {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblLogin = new JLabel("Login Required !!");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLogin.setBounds(160, 11, 120, 22);
		contentPane.add(lblLogin);
		
		btnCompanyLogin = new JButton("Company Login");
		btnCompanyLogin.addActionListener(new MainViewController(this)); 
		btnCompanyLogin.setForeground(Color.BLACK);
		btnCompanyLogin.setBackground(Color.WHITE);
		btnCompanyLogin.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnCompanyLogin.setBounds(10, 77, 120, 23);
		contentPane.add(btnCompanyLogin);
		
		btnUserLogin = new JButton("User Login");
		btnUserLogin.addActionListener(new MainViewController(this)); 
		btnUserLogin.setForeground(Color.BLACK);
		btnUserLogin.setBackground(Color.WHITE);
		btnUserLogin.setFont(new Font("Tahoma", Font.ITALIC, 11));
		
		btnUserLogin.setBounds(160, 77, 120, 23);
		contentPane.add(btnUserLogin);
		
		btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.addActionListener(new MainViewController(this));
		btnAdminLogin.setForeground(Color.BLACK);
		btnAdminLogin.setBackground(Color.WHITE);
		btnAdminLogin.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnAdminLogin.setBounds(304, 77, 120, 23);
		contentPane.add(btnAdminLogin);
		
		lblOr = new JLabel("or");
		lblOr.setForeground(Color.DARK_GRAY);
		lblOr.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOr.setBounds(208, 111, 26, 14);
		contentPane.add(lblOr);
		
		btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new MainViewController(this));
		btnSignUp.setForeground(Color.BLACK);
		btnSignUp.setBackground(Color.WHITE);
		btnSignUp.setFont(new Font("Tahoma", Font.ITALIC, 11));
		btnSignUp.setBounds(174, 136, 89, 23);
		contentPane.add(btnSignUp);
	}
}
