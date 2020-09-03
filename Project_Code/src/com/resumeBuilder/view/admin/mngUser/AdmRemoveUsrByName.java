package com.resumeBuilder.view.admin.mngUser;

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

import com.resumeBuilder.controller.admin.RemovoUserListener;
import com.resumeBuilder.controller.user.FindUser;
import com.resumeBuilder.model.user.User;
import com.resumeBuilder.model.user.UserStorage;

public class AdmRemoveUsrByName extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsrName;
	private JLabel lblEnterUsername;
	private JButton btnRemove;
	private JLabel lblDeleteUser;
	private JButton btnBack;
	private JLabel lblBack;

	public String getTxtUsrName() {
		return txtUsrName.getText();
	}

	public AdmRemoveUsrByName() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEnterUsername = new JLabel("Enter UserName");
		lblEnterUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEnterUsername.setBounds(40, 90, 125, 27);
		contentPane.add(lblEnterUsername);
		
		txtUsrName = new JTextField();
		txtUsrName.setBounds(195, 91, 134, 27);
		contentPane.add(txtUsrName);
		txtUsrName.setColumns(10);
		
		btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new RemovoUserListener(this));
		btnRemove.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRemove.setBounds(165, 159, 89, 23);
		contentPane.add(btnRemove);
		
		lblDeleteUser = new JLabel("Delete User");
		lblDeleteUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleteUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDeleteUser.setBounds(157, 36, 97, 27);
		contentPane.add(lblDeleteUser);
		
		btnBack = new JButton("<--");
		btnBack.addActionListener(new RemovoUserListener(this));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack.setBounds(10, 20, 63, 23);
		contentPane.add(btnBack);
		
		lblBack = new JLabel("Back");
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBack.setBounds(10, 45, 63, 14);
		contentPane.add(lblBack);
	}

}
