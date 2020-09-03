package com.resumeBuilder.view.company;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.resumeBuilder.controller.company.CompOptionsListener;
import com.resumeBuilder.model.company.Company;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class CompanyOptionsView extends JFrame {

	private JPanel contentPane;
	private  Company obj;
	private JLabel lblCompanyOption;
	private JButton btnEdit;
	private JButton btnUserDetails;
	private JButton btnLogOut;
	private JLabel lblLogOut;

	public CompanyOptionsView(Company object) {
		
		this.obj = object;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 lblCompanyOption = new JLabel("Company Options");
		lblCompanyOption.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompanyOption.setBounds(116, 27, 208, 27);
		contentPane.add(lblCompanyOption);
		lblCompanyOption.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		 btnEdit = new JButton("Edit Details");
		 btnEdit.addActionListener(new CompOptionsListener(this,obj));
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEdit.setBounds(101, 95, 223, 25);
		contentPane.add(btnEdit);
		
		 btnUserDetails = new JButton("See User Details");
		btnUserDetails.addActionListener(new CompOptionsListener(this,obj));
		btnUserDetails.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnUserDetails.setBounds(105, 150, 222, 25);
		contentPane.add(btnUserDetails);
		
		btnLogOut = new JButton("[->");
		btnLogOut.addActionListener(new CompOptionsListener(this,obj));
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogOut.setBounds(361, 11, 63, 23);
		contentPane.add(btnLogOut);
		
		lblLogOut = new JLabel("Log Out");
		lblLogOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOut.setBounds(361, 35, 63, 14);
		contentPane.add(lblLogOut);
	}
}
