package com.resumeBuilder.view.admin.mngCompany;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.resumeBuilder.controller.admin.SearchCompListener;
import com.resumeBuilder.controller.company.FindCompany;
import com.resumeBuilder.model.company.Company;
import com.resumeBuilder.model.company.CompanyStorage;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class AdmSrchCompByName extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsrName;
	private JLabel lblEnterUsername;
	private JButton btnSearch;
	private JLabel lblSrchComp;
	private JButton btnBack;
	private JLabel lblBack;
	
	public String getTxtUsrName() {
		return txtUsrName.getText();
	}
	
	public AdmSrchCompByName() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEnterUsername = new JLabel("Company UserName");
		lblEnterUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEnterUsername.setBounds(10, 90, 125, 27);
		contentPane.add(lblEnterUsername);
		
		txtUsrName = new JTextField();
		txtUsrName.setBounds(165, 91, 210, 27);
		contentPane.add(txtUsrName);
		txtUsrName.setColumns(10);
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new SearchCompListener(this));
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSearch.setBounds(165, 159, 89, 23);
		contentPane.add(btnSearch);
		
		lblSrchComp = new JLabel("Search Company");
		lblSrchComp.setHorizontalAlignment(SwingConstants.CENTER);
		lblSrchComp.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSrchComp.setBounds(157, 36, 134, 27);
		contentPane.add(lblSrchComp);
		
		btnBack = new JButton("<--");
		btnBack.addActionListener(new SearchCompListener(this));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack.setBounds(10, 20, 63, 23);
		contentPane.add(btnBack);
		
		lblBack = new JLabel("Back");
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBack.setBounds(10, 45, 63, 14);
		contentPane.add(lblBack);
	}
}
