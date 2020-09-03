package com.resumeBuilder.view.admin.mngCompany;

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

import com.resumeBuilder.controller.admin.RemoveCompListener;
import com.resumeBuilder.controller.company.FindCompany;
import com.resumeBuilder.model.company.Company;
import com.resumeBuilder.model.company.CompanyStorage;


public class AdmRemoveComByName extends JFrame {

	private JPanel contentPane;
	private JTextField txtCompName;
	private JLabel lblEnterUsername;
	private JButton btnRemove;
	private JLabel lblDeleteComp;
	private JButton btnBack;
	private JLabel lblBack;

	public String getTxtComName() {
		return txtCompName.getText();
	}


	public AdmRemoveComByName() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEnterUsername = new JLabel("Company Username");
		lblEnterUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEnterUsername.setBounds(10, 90, 142, 27);
		contentPane.add(lblEnterUsername);
		
		txtCompName = new JTextField();
		txtCompName.setBounds(154, 91, 197, 27);
		contentPane.add(txtCompName);
		txtCompName.setColumns(10);
		
		btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new RemoveCompListener(this));
		btnRemove.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRemove.setBounds(165, 159, 89, 23);
		contentPane.add(btnRemove);
		
		lblDeleteComp = new JLabel("Detete Company");
		lblDeleteComp.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteComp.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDeleteComp.setBounds(144, 28, 142, 27);
		contentPane.add(lblDeleteComp);
		
		btnBack = new JButton("<--");
		btnBack.addActionListener(new RemoveCompListener(this));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack.setBounds(10, 11, 63, 23);
		contentPane.add(btnBack);
		
		lblBack = new JLabel("Back");
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBack.setBounds(10, 36, 63, 14);
		contentPane.add(lblBack);
	}

}
