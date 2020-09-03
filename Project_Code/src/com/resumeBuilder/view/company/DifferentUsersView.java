package com.resumeBuilder.view.company;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.resumeBuilder.controller.company.DiffUsersViewListener;
import com.resumeBuilder.model.company.Company;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DifferentUsersView extends JFrame {

	private JPanel contentPane;
	private  Company obj;
	private JLabel lblTitle ;
	private JComboBox comboUserType;
	private JButton btnBack;
	private JButton btnLogOut;
	private JLabel lblBack;
	private JLabel lblLogOut;
	private JLabel lblType;
	private JButton btnSearch;
	
	public String getComboUserType() {
		return (String)comboUserType.getSelectedItem();
	}

	public DifferentUsersView(Company obj) {
		this.obj = obj;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 lblTitle = new JLabel("Type of Users");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setBounds(168, 13, 103, 25);
		contentPane.add(lblTitle);
		
		String[] type = {"Academics" , "Medical","Engineering","Commercials"};
		 comboUserType = new JComboBox(type);
		// comboUserType.setSelectedIndex(2);
		comboUserType.setBounds(155, 110, 130, 20);
		contentPane.add(comboUserType);
		
		 btnBack = new JButton("<--");
		 btnBack.addActionListener(new DiffUsersViewListener(this,obj));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBack.setBounds(10, 14, 75, 23);
		contentPane.add(btnBack);
		
		 btnLogOut = new JButton("[->");
		 btnLogOut.addActionListener(new DiffUsersViewListener(this, obj));
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLogOut.setBounds(349, 11, 75, 23);
		contentPane.add(btnLogOut);
		
		 lblBack = new JLabel("Back");
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBack.setBounds(10, 35, 75, 14);
		contentPane.add(lblBack);
		
		 lblLogOut = new JLabel("Log Out");
		lblLogOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOut.setBounds(352, 35, 72, 14);
		contentPane.add(lblLogOut);
		
		 lblType = new JLabel("Select Type : ");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblType.setBounds(10, 112, 103, 14);
		contentPane.add(lblType);
		
		 btnSearch = new JButton("Search");
		 btnSearch.addActionListener(new DiffUsersViewListener(this, obj));
		btnSearch.setBounds(167, 227, 89, 23);
		contentPane.add(btnSearch);
	}
}
