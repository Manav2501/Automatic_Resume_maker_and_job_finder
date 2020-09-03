package com.resumeBuilder.view.admin.mngUser;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.resumeBuilder.controller.admin.UserDtlsViewListener;
import com.resumeBuilder.model.user.User;

public class AdmUsrDtlsDsply extends JFrame {

	private JPanel contentPane;
	private   User obj;
	private JLabel lblUserInformation;
	private JLabel lblUsername;
	private JLabel lblUsrUname;
	private JLabel lblFullName;
	private JLabel lblF;
	private JLabel lblFname;
	private JLabel lblLname;
	private JLabel lblL;
	private JLabel lblDateOfBirth;
	private JLabel lblDob;
	private JLabel lblAge;
	private JLabel lblAge1;
	private JLabel lblEmailId;
	private JLabel lblUsrEmail;
	private JButton btnClose;
	private JLabel lblGender;
	private JLabel lblGndr;
	
	public AdmUsrDtlsDsply(User obj) {
		this.obj = obj;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblUserInformation = new JLabel("User Information");
		lblUserInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserInformation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUserInformation.setBounds(0, 0, 434, 32);
		contentPane.add(lblUserInformation);
		
		lblUsername = new JLabel("UserName :");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsername.setBounds(10, 43, 84, 24);
		contentPane.add(lblUsername);
		
		lblUsrUname = new JLabel(obj.getUsrUserName());
		lblUsrUname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsrUname.setBounds(102, 46, 216, 18);
		contentPane.add(lblUsrUname);
		
		lblFullName = new JLabel("Full Name :");
		lblFullName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFullName.setBounds(10, 71, 84, 24);
		contentPane.add(lblFullName);
		
		lblF = new JLabel("F");
		lblF.setHorizontalAlignment(SwingConstants.CENTER);
		lblF.setBounds(123, 97, 46, 14);
		contentPane.add(lblF);
		
		lblFname = new JLabel(obj.getUsrFName());
		lblFname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFname.setBounds(102, 75, 110, 18);
		contentPane.add(lblFname);
		
		lblLname = new JLabel(obj.getUsrLName());
		lblLname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLname.setBounds(222, 75, 110, 18);
		contentPane.add(lblLname);
		
		lblL = new JLabel("L");
		lblL.setHorizontalAlignment(SwingConstants.CENTER);
		lblL.setBounds(232, 97, 46, 14);
		contentPane.add(lblL);
		
		lblDateOfBirth = new JLabel("Date Of Birth :");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDateOfBirth.setBounds(10, 124, 84, 24);
		contentPane.add(lblDateOfBirth);
		
		lblDob = new JLabel(obj.getPersonal().getUsrDob());
		lblDob.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDob.setBounds(102, 126, 110, 18);
		contentPane.add(lblDob);
		
		lblAge = new JLabel("Age :");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAge.setBounds(10, 151, 84, 24);
		contentPane.add(lblAge);
		
		lblAge1 = new JLabel(obj.getPersonal().getUsrAge());
		lblAge1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAge1.setBounds(102, 155, 110, 18);
		contentPane.add(lblAge1);
		
		lblEmailId = new JLabel("Email Id :");
		lblEmailId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmailId.setBounds(10, 177, 84, 24);
		contentPane.add(lblEmailId);
		
		lblUsrEmail = new JLabel(obj.getUsrEmailId());
		lblUsrEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsrEmail.setBounds(102, 180, 216, 18);
		contentPane.add(lblUsrEmail);
		
		btnClose = new JButton("Close");
		btnClose.addActionListener(new UserDtlsViewListener(this));
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.setBounds(170, 227, 89, 23);
		contentPane.add(btnClose);
		
		lblGender = new JLabel("Gender :");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGender.setBounds(222, 151, 74, 24);
		contentPane.add(lblGender);
		
		lblGndr = new JLabel(obj.getPersonal().getUsrGender());
		lblGndr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblGndr.setBounds(302, 154, 110, 18);
		contentPane.add(lblGndr);
	}

}
