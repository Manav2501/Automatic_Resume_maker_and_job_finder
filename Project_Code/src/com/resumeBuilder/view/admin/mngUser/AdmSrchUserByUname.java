package com.resumeBuilder.view.admin.mngUser;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.resumeBuilder.controller.admin.SearchUserListener;
import com.resumeBuilder.controller.user.FindUser;
import com.resumeBuilder.model.user.User;
import com.resumeBuilder.model.user.UserStorage;

public class AdmSrchUserByUname extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsrName;
	private JButton btnSearch;
	private JLabel lblSrchUser ;
	private JButton btnBack;
	private JLabel lblBack;
	private JLabel lblEnterUsername ;
	
	public String getTxtUsrName() {
		return txtUsrName.getText();
	}

	public AdmSrchUserByUname() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 lblEnterUsername = new JLabel("Enter UserName");
		lblEnterUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEnterUsername.setBounds(40, 90, 125, 27);
		contentPane.add(lblEnterUsername);
		
		txtUsrName = new JTextField();
		txtUsrName.setBounds(195, 91, 134, 27);
		contentPane.add(txtUsrName);
		txtUsrName.setColumns(10);
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new SearchUserListener(this));
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSearch.setBounds(165, 159, 89, 23);
		contentPane.add(btnSearch);
		
		 lblSrchUser = new JLabel("Search User");
		lblSrchUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblSrchUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSrchUser.setBounds(157, 36, 97, 27);
		contentPane.add(lblSrchUser);
		
		 btnBack = new JButton("<--");
		btnBack.addActionListener(new SearchUserListener(this));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack.setBounds(10, 20, 63, 23);
		contentPane.add(btnBack);
		
		 lblBack = new JLabel("Back");
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBack.setBounds(10, 45, 63, 14);
		contentPane.add(lblBack);
	}
}
