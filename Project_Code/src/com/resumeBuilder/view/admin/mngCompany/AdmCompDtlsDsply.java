package com.resumeBuilder.view.admin.mngCompany;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.resumeBuilder.controller.admin.CompDtlsViewListener;
import com.resumeBuilder.model.company.Company;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdmCompDtlsDsply extends JFrame {

	private JPanel contentPane;
	private JLabel lblCompInfo;
	private JLabel lblUsername ;
	private JLabel lblFullName;
	private JLabel lblEmailId  ;
	private JLabel lblContactNo;
	private JLabel lblType;
	private JLabel lblAddress;
	private JLabel lblCompUName ;
	private JLabel lblCompFullName;
	private JLabel lblCompEmailID;
	private JLabel lblCompContact ;
	private JLabel lblCompType ;
	private JButton btnClose;
	private JTextArea txtCompAddress;
	private  Company object;

	public AdmCompDtlsDsply(Company obj) {
		object = obj;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCompInfo = new JLabel("Company Information");
		lblCompInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompInfo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCompInfo.setBounds(10, 11, 414, 22);
		contentPane.add(lblCompInfo);
		
		lblUsername = new JLabel("Username :");
		lblUsername.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsername.setBounds(10, 57, 74, 22);
		contentPane.add(lblUsername);
		
		lblFullName = new JLabel("Full name :");
		lblFullName.setHorizontalAlignment(SwingConstants.LEFT);
		lblFullName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFullName.setBounds(10, 90, 74, 22);
		contentPane.add(lblFullName);
		
		lblEmailId = new JLabel("Email ID :");
		lblEmailId.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmailId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmailId.setBounds(10, 123, 74, 22);
		contentPane.add(lblEmailId);
		
		lblContactNo = new JLabel("Contact No : ");
		lblContactNo.setHorizontalAlignment(SwingConstants.LEFT);
		lblContactNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblContactNo.setBounds(10, 156, 88, 22);
		contentPane.add(lblContactNo);
		
		lblType = new JLabel("Type :");
		lblType.setHorizontalAlignment(SwingConstants.LEFT);
		lblType.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblType.setBounds(10, 189, 74, 22);
		contentPane.add(lblType);
		
		lblAddress = new JLabel("Address :");
		lblAddress.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAddress.setBounds(10, 222, 88, 22);
		contentPane.add(lblAddress);
		
		lblCompUName = new JLabel(object.getComUserName());
		lblCompUName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCompUName.setBounds(113, 62, 184, 14);
		contentPane.add(lblCompUName);
		
		lblCompFullName = new JLabel(object.getComFullName());
		lblCompFullName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCompFullName.setBounds(113, 95, 184, 14);
		contentPane.add(lblCompFullName);
		
		lblCompEmailID = new JLabel(object.getComEmailId());
		lblCompEmailID.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCompEmailID.setBounds(113, 128, 184, 14);
		contentPane.add(lblCompEmailID);
		
		lblCompContact = new JLabel(object.getComMainConNo());
		lblCompContact.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCompContact.setBounds(113, 161, 184, 14);
		contentPane.add(lblCompContact);
		
		lblCompType = new JLabel(object.getComType());
		lblCompType.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCompType.setBounds(113, 194, 184, 14);
		contentPane.add(lblCompType);
		
		txtCompAddress = new JTextArea(object.getComHeadAddress());
		txtCompAddress.setEditable(false);
		txtCompAddress.setBounds(108, 222, 232, 75);
		contentPane.add(txtCompAddress);
		
		btnClose = new JButton("Close");
		btnClose.addActionListener(new CompDtlsViewListener(this)); 
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.setBounds(176, 327, 89, 23);
		contentPane.add(btnClose);
	}
}
