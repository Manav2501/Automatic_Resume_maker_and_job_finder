package com.resumeBuilder.view.company;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.resumeBuilder.controller.company.CompEditDtlsListener;
import com.resumeBuilder.model.company.Company;
import com.resumeBuilder.model.company.CompanyStorage;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollPane;

public class EditCompanyDtls extends JFrame {

	private  Company obj;
	private JPanel contentPane;
	private JTextField txtComUsername;
	private JTextField txtComEmailid;
	private JTextField txtComName;
	private JPasswordField pwdComPass;
	private JTextField txtComContactNum;
	private JTextField txtReqEmployee;
	private JTextField txtCompanyField;
	private JLabel lblCompanyField;
	private JLabel lblEditCompanyInfo;
	private JLabel lblCompanyName;
	private JLabel lblConpanyUserName;
	private JLabel lblEmailId;
	private JLabel lblPassword;
	private JLabel lblAddress;
	private JLabel lblContactnum;
	private JTextArea txtAddress ;
	private JLabel lblRequireEmployee;
	private JButton btnSave;
	
	
	public String getTxtReqEmployee() {
		return txtReqEmployee.getText();
	}

	public String getTxtCompanyField() {
		return txtCompanyField.getText();
	}

	public String getTxtAddress(){
		return txtAddress.getText();
	}

	public String getTxtComContactNum() {
		return txtComContactNum.getText();
	}

	public String getTxtComUsername() {
		return txtComUsername.getText();
	}

	public String getTxtComEmailid() {
		return txtComEmailid.getText();
	}

	public String getTxtComName() {
		return txtComName.getText();
	}

	public String getPwdComPass() {
		return pwdComPass.getText();
	}


	
	public EditCompanyDtls(Company obj) {
		this.obj = obj;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 lblEditCompanyInfo = new JLabel("Edit Company Info");
		lblEditCompanyInfo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEditCompanyInfo.setBounds(133, 11, 150, 20);
		contentPane.add(lblEditCompanyInfo);
		
		 lblCompanyName = new JLabel("Company Name");
		lblCompanyName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCompanyName.setBounds(10, 50, 150, 20);
		contentPane.add(lblCompanyName);
		
		 lblConpanyUserName = new JLabel("Company User Name");
		lblConpanyUserName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblConpanyUserName.setBounds(10, 75, 150, 20);
		contentPane.add(lblConpanyUserName);
		
		 lblEmailId = new JLabel("Email ID");
		lblEmailId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmailId.setBounds(10, 100, 150, 20);
		contentPane.add(lblEmailId);
		
		 lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword.setBounds(10, 125, 150, 20);
		contentPane.add(lblPassword);
				
		 lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAddress.setBounds(10, 156, 150, 20);
		contentPane.add(lblAddress);
		
		 lblContactnum = new JLabel("Contact No");
		lblContactnum.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblContactnum.setBounds(10, 222, 150, 20);
		contentPane.add(lblContactnum);
		
		txtComName = new JTextField(obj.getComFullName());
		txtComName.setBounds(200, 50, 189, 20);
		contentPane.add(txtComName);
		txtComName.setColumns(10);

		txtComUsername = new JTextField(obj.getComUserName());
		txtComUsername.setEnabled(false);
		txtComUsername.setEditable(false);
		txtComUsername.setBounds(200, 75, 189, 20);
		contentPane.add(txtComUsername);
		txtComUsername.setColumns(10);
		
		txtComEmailid = new JTextField(obj.getComEmailId());
		txtComEmailid.setBounds(200, 100, 189, 20);
		contentPane.add(txtComEmailid);
		txtComEmailid.setColumns(10);
		
		pwdComPass = new JPasswordField(obj.getComPassWord());
		pwdComPass.setEnabled(false);
		pwdComPass.setEditable(false);
		pwdComPass.setBounds(200, 125, 189, 20);
		contentPane.add(pwdComPass);

		txtComContactNum = new JTextField(obj.getComMainConNo());
		txtComContactNum.setBounds(200, 222, 189, 20);
		contentPane.add(txtComContactNum);
		txtComContactNum.setColumns(10);
		
		 btnSave = new JButton("Save & Close");
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSave.addActionListener(new CompEditDtlsListener(this,obj));
		btnSave.setBounds(133, 330, 150, 20);
		contentPane.add(btnSave);
		
		 txtAddress = new JTextArea(obj.getComHeadAddress());
		txtAddress.setBounds(200, 154, 189, 57);
		contentPane.add(txtAddress);
		
		 lblRequireEmployee = new JLabel("Require Employee");
		lblRequireEmployee.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRequireEmployee.setBounds(10, 253, 150, 20);
		contentPane.add(lblRequireEmployee);
		
		txtReqEmployee = new JTextField(obj.getReqEmployeeType());
		txtReqEmployee.setColumns(10);
		txtReqEmployee.setBounds(200, 253, 189, 20);
		contentPane.add(txtReqEmployee);
		
		 lblCompanyField = new JLabel("Company Field");
		lblCompanyField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCompanyField.setBounds(10, 284, 150, 20);
		contentPane.add(lblCompanyField);
		
		txtCompanyField = new JTextField(obj.getComType());
		txtCompanyField.setColumns(10);
		txtCompanyField.setBounds(200, 284, 189, 20);
		contentPane.add(txtCompanyField);	
	}
}
