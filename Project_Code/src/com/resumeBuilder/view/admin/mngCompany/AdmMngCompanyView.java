package com.resumeBuilder.view.admin.mngCompany;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.resumeBuilder.controller.admin.ComAccCreationListener;
import com.resumeBuilder.controller.admin.CompOptionsListener;
import com.resumeBuilder.view.MainView;
import com.resumeBuilder.view.admin.AdminManagementView;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class AdmMngCompanyView extends JFrame {

	private JPanel contentPane;
	private JLabel lblCompMenu;
	private JButton btnComAcc;
	private JButton btnRemoveComAcc;
	private JButton btnDisplayCom;
	private JButton btnSearchCom;
	private JButton btnLogOut;
	private JLabel lblLogOut;
	private JButton btnBack;
	private JLabel lblBack;

	public AdmMngCompanyView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCompMenu = new JLabel("Company Menu");
		lblCompMenu.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCompMenu.setBounds(151, 11, 147, 35);
		contentPane.add(lblCompMenu);
		
		btnComAcc = new JButton("Make Company Account");
		btnComAcc.addActionListener(new CompOptionsListener(this));
		btnComAcc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnComAcc.setBounds(85, 69, 271, 35);
		contentPane.add(btnComAcc);
		
		btnRemoveComAcc = new JButton("Remove Company Account");
		btnRemoveComAcc.addActionListener(new CompOptionsListener(this));
		btnRemoveComAcc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRemoveComAcc.setBounds(85, 115, 271, 35);
		contentPane.add(btnRemoveComAcc);
		
		btnDisplayCom = new JButton("Display All Companies");
		btnDisplayCom.addActionListener(new CompOptionsListener(this));
		btnDisplayCom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDisplayCom.setBounds(85, 161, 271, 35);
		contentPane.add(btnDisplayCom);
		
		btnSearchCom = new JButton("Search Any Company");
		btnSearchCom.addActionListener(new CompOptionsListener(this));
		btnSearchCom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSearchCom.setBounds(85, 207, 271, 35);
		contentPane.add(btnSearchCom);
		
		btnLogOut = new JButton("[->");
		btnLogOut.addActionListener(new CompOptionsListener(this));
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLogOut.setBounds(349, 11, 75, 23);
		contentPane.add(btnLogOut);
		
		lblLogOut = new JLabel("Log Out");
		lblLogOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOut.setBounds(349, 32, 75, 14);
		contentPane.add(lblLogOut);
		
		btnBack = new JButton("<--");
		btnBack.addActionListener(new CompOptionsListener(this)); 
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBack.setBounds(10, 11, 75, 23);
		contentPane.add(btnBack);
		
		lblBack = new JLabel("Back");
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBack.setBounds(10, 32, 75, 14);
		contentPane.add(lblBack);
	}
}
