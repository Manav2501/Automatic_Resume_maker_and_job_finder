package com.resumeBuilder.view.user;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.resumeBuilder.controller.user.UserPrjListener;
import com.resumeBuilder.model.user.User;
import com.resumeBuilder.model.user.UserProjectDtls;
import com.resumeBuilder.model.user.UserStorage;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class EditUserPrj extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrjTitle;
	private JTextField txtNoOfMembers;
	private JTextArea txtPrjDtls;
	private  User obj;
	private JLabel lblTitle;
	private JLabel lblPrjTitle;
	private JLabel lblPrjDtls;
	private JScrollPane scrollAddress;
	private JButton btnSave;
	private JLabel lblNoOfMembers;
	
	public String getTxtPrjTitle() {
		return txtPrjTitle.getText();
	}

	public String getTxtNoOfMembers() {
		return txtNoOfMembers.getText();
	}

	public String getTxtPrjDtls() {
		return txtPrjDtls.getText();
	}

	public EditUserPrj(User obj) {
		this.obj = obj;
		UserProjectDtls oldPrj = obj.getPrj();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 lblTitle = new JLabel("Final Year Project Details");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setBounds(118, 11, 184, 26);
		contentPane.add(lblTitle);
		
		 lblPrjTitle = new JLabel("Project  Title :");
		lblPrjTitle.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblPrjTitle.setBounds(10, 48, 93, 19);
		contentPane.add(lblPrjTitle);
		
		txtPrjTitle = new JTextField(oldPrj.getPrjTitle());
		txtPrjTitle.setBounds(128, 48, 184, 20);
		contentPane.add(txtPrjTitle);
		txtPrjTitle.setColumns(10);
		
		 lblPrjDtls = new JLabel("Short Description :");
		lblPrjDtls.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblPrjDtls.setBounds(10, 89, 119, 14);
		contentPane.add(lblPrjDtls);
		
		scrollAddress = new JScrollPane();
		scrollAddress.setBounds(128, 85, 296, 85);
		contentPane.add(scrollAddress);
		
		txtPrjDtls = new JTextArea(oldPrj.getPrjDescription());
		scrollAddress.setViewportView(txtPrjDtls);
		
		btnSave = new JButton("Save And Close");
		btnSave.addActionListener(new UserPrjListener(this,obj)); 
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSave.setBounds(128, 227, 145, 23);
		contentPane.add(btnSave);
		
		 lblNoOfMembers = new JLabel("Total Members :");
		lblNoOfMembers.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblNoOfMembers.setBounds(10, 191, 104, 14);
		contentPane.add(lblNoOfMembers);
		
		txtNoOfMembers = new JTextField(oldPrj.getPrjNoOfMembers());
		txtNoOfMembers.setColumns(10);
		txtNoOfMembers.setBounds(128, 189, 184, 20);
		contentPane.add(txtNoOfMembers);
	}
}
