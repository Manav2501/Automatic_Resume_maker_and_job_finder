package com.resumeBuilder.view.user;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;

import com.resumeBuilder.controller.user.EditUserDtlsListener;
import com.resumeBuilder.model.user.User;
import com.resumeBuilder.view.MainView;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import java.awt.Font;
import java.awt.TextArea;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class EditUserDtls extends JFrame {
	
	private  User obj;
	private JButton btnEditPerInfo;
	private JButton btnEditEduInfo;
	private JButton btnAddProject ;
	private JButton btnAddOther;
	private JLabel lblOptions;
	private JButton btnBack;
	private JButton btnLogOut;
	private JLabel lblLogOut;
	private JLabel lblBack;

	
	public EditUserDtls(User obj) {
		this.obj = obj;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		 btnEditPerInfo = new JButton("Edit Personal Information");
		 btnEditPerInfo.addActionListener(new EditUserDtlsListener(this,obj));
		btnEditPerInfo.setFont(new Font("Tahoma", Font.ITALIC, 14));
		btnEditPerInfo.setBounds(83, 76, 271, 35);
		getContentPane().add(btnEditPerInfo);
		
		 btnEditEduInfo = new JButton("Edit Educational Qualifications");
		 btnEditEduInfo.addActionListener(new EditUserDtlsListener(this,obj));
		btnEditEduInfo.setFont(new Font("Tahoma", Font.ITALIC, 14));
		btnEditEduInfo.setBounds(83, 123, 271, 35);
		getContentPane().add(btnEditEduInfo);
		
		btnAddProject = new JButton("Add Your Project");
		btnAddProject.addActionListener(new EditUserDtlsListener(this,obj));
		btnAddProject.setFont(new Font("Tahoma", Font.ITALIC, 14));
		btnAddProject.setBounds(83, 169, 271, 35);
		getContentPane().add(btnAddProject);
		
		 btnAddOther = new JButton("Add Other Activities");
		 btnAddOther.addActionListener(new EditUserDtlsListener(this,obj));
		btnAddOther.setFont(new Font("Tahoma", Font.ITALIC, 14));
		btnAddOther.setBounds(83, 215, 271, 35);
		getContentPane().add(btnAddOther);
		
		 lblOptions = new JLabel("OPTIONS");
		lblOptions.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOptions.setBounds(178, 11, 89, 26);
		getContentPane().add(lblOptions);
		
	    btnBack = new JButton("<--");
		btnBack.addActionListener(new EditUserDtlsListener(this,obj)); 
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBack.setBounds(10, 15, 75, 23);
		getContentPane().add(btnBack);
		
		 btnLogOut = new JButton("[->");
		 btnLogOut.addActionListener(new EditUserDtlsListener(this,obj));
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLogOut.setBounds(349, 15, 75, 23);
		getContentPane().add(btnLogOut);
		
		 lblLogOut = new JLabel("Log Out");
		lblLogOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOut.setBounds(349, 40, 72, 14);
		getContentPane().add(lblLogOut);
		
		 lblBack = new JLabel("Back");
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBack.setBounds(10, 40, 75, 14);
		getContentPane().add(lblBack);
		
	}
}
