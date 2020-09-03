package com.resumeBuilder.view.user;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.resumeBuilder.controller.Main;
import com.resumeBuilder.controller.user.FindUser;
import com.resumeBuilder.controller.user.UserLoginListener;
import com.resumeBuilder.model.user.User;
import com.resumeBuilder.model.user.UserStorage;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class UserLoginView extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsrName;
	private JPasswordField txtPwd;
	private JLabel lblUsrName;
	private JLabel lblPassWord;
	private JButton btnUsrLogin;
	private JLabel lblTitle;

	public String getTxtUsrName() {
		return txtUsrName.getText();
	}

	public String getPasswordField() {
		return txtPwd.getText();
	}

	public UserLoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblUsrName = new JLabel("User name  ");
		lblUsrName.setForeground(Color.BLACK);
		lblUsrName.setBackground(Color.BLACK);
		lblUsrName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsrName.setBounds(65, 103, 93, 23);
		contentPane.add(lblUsrName);
		
		 lblPassWord = new JLabel("Password");
		lblPassWord.setForeground(Color.BLACK);
		lblPassWord.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassWord.setBounds(65, 144, 68, 23);
		contentPane.add(lblPassWord);
		
		txtUsrName = new JTextField();
		txtUsrName.setBounds(158, 106, 157, 20);
		contentPane.add(txtUsrName);
		txtUsrName.setColumns(10);
		
		btnUsrLogin = new JButton("Login");
		btnUsrLogin.addActionListener(new UserLoginListener(this));
	
		btnUsrLogin.setBackground(Color.WHITE);
		btnUsrLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUsrLogin.setBounds(173, 211, 93, 23);
		contentPane.add(btnUsrLogin);
		
		txtPwd = new JPasswordField();
		txtPwd.setBounds(158, 144, 157, 20);
		contentPane.add(txtPwd);
		
		lblTitle = new JLabel("User Login");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setBounds(173, 28, 80, 23);
		contentPane.add(lblTitle);
	}
}