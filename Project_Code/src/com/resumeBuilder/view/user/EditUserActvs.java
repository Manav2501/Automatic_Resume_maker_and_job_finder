package com.resumeBuilder.view.user;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.resumeBuilder.controller.user.EditActvsListener;
import com.resumeBuilder.model.user.User;
import com.resumeBuilder.model.user.UserOtherDtls;
import com.resumeBuilder.model.user.UserStorage;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class EditUserActvs extends JFrame {

	private JPanel contentPane;
	private  User obj;
	private JTextArea txtOther;
	private JTextArea txtAchieve;
	private JTextArea txtInterests;
	private JTextArea txtHobbies;
	private JButton btnSave;
	private JLabel lblHobbies;
	private JLabel lblInterests;
	private JLabel lblAchievements;
	private JLabel lblCocurricaular;
	private JLabel lblTitle;
	private JScrollPane scrollInterest;
	private JScrollPane scrollOther;
	private JScrollPane scrollAchieve;
	private JScrollPane scrollHobbies;
	
	
	public String getTxtOther() {
		return txtOther.getText();
	}

	public String getTxtAchieve() {
		return txtAchieve.getText();
	}

	public String getTxtInterests() {
		return txtInterests.getText();
	}

	public String getTxtHobbies() {
		return txtHobbies.getText();
	}

	public EditUserActvs(User obj) {
		this.obj = obj;
		UserOtherDtls other = obj.getOtherDtls();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 lblHobbies = new JLabel("Hobbies :");
		lblHobbies.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblHobbies.setBounds(10, 53, 64, 16);
		contentPane.add(lblHobbies);
		
		 scrollHobbies = new JScrollPane();
		scrollHobbies.setBounds(121, 50, 226, 83);
		contentPane.add(scrollHobbies);
		
		txtHobbies = new JTextArea(other.getUsrHobbies());
		scrollHobbies.setViewportView(txtHobbies);
		
		 lblInterests = new JLabel("Interests :");
		lblInterests.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblInterests.setBounds(10, 171, 64, 16);
		contentPane.add(lblInterests);
		
		 scrollInterest = new JScrollPane();
		scrollInterest.setBounds(121, 168, 226, 83);
		contentPane.add(scrollInterest);
		
		txtInterests = new JTextArea(other.getUsrInterest());
		scrollInterest.setViewportView(txtInterests);
		
		 lblAchievements = new JLabel("Achievements :");
		lblAchievements.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblAchievements.setBounds(10, 288, 100, 16);
		contentPane.add(lblAchievements);
		
		 scrollAchieve = new JScrollPane();
		scrollAchieve.setBounds(121, 285, 226, 83);
		contentPane.add(scrollAchieve);
		
		txtAchieve = new JTextArea(other.getUsrAchievements());
		scrollAchieve.setViewportView(txtAchieve);
		
		 lblCocurricaular = new JLabel("Co-Curricaular :");
		lblCocurricaular.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblCocurricaular.setBounds(10, 402, 100, 16);
		contentPane.add(lblCocurricaular);
		
		 scrollOther = new JScrollPane();
		scrollOther.setBounds(121, 399, 226, 83);
		contentPane.add(scrollOther);
		
		txtOther = new JTextArea(other.getUsrCurricular());
		scrollOther.setViewportView(txtOther);
		
		 btnSave = new JButton("Save And Close");
		btnSave.addActionListener(new EditActvsListener(this,obj));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSave.setBounds(146, 527, 153, 23);
		contentPane.add(btnSave);
		
		 lblTitle = new JLabel("Add other activities");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setBounds(146, 11, 153, 16);
		contentPane.add(lblTitle);
	}
}
