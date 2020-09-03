package com.resumeBuilder.view.user;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.resumeBuilder.controller.user.UserPerInfoListener;
import com.resumeBuilder.model.user.User;
import com.resumeBuilder.model.user.UserPersonalDtls;
import com.resumeBuilder.model.user.UserStorage;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class EditUserPerInfo extends JFrame {

	private JPanel contentPane;
	private JTextField txtFName;
	private JTextField txtLName;
	private JTextField txtUserName;
	private JTextField txtDoB;
	private JTextField txtEmailId;
	private JTextField txtConNo;
	private  User obj;
	private JComboBox comboUserGen;
	private JComboBox comboMarital;
	private JPasswordField txtPassword;
	private JTextField txtAge;
	private JTextArea txtAddress;
	private JTextField txtNationality;
	private JTextField txtLangKnown;
	private JLabel lblFName;
	private JLabel lblLastName;
	private JLabel lblUserName;
	private JLabel lblDateOfBirth;
	private JLabel lblEmaiId;
	private JLabel lblContactNo;
	private JLabel lblGen;
	private JLabel lblMaritalStatus;
	private JLabel lblPassword;
	private JLabel lblAge;
	private JLabel lblAddress;
	private JLabel lblNationality;
	private JLabel lblLangKnown;
	private JLabel lblNewLabel;
	private JButton btnSave;
	

	public String getComboMarital() {
		return (String)comboMarital.getSelectedItem();
	}

	public String getTxtLangKnown() {
		return txtLangKnown.getText();
	}

	public String getTxtFName() {
		return txtFName.getText();
	}
	
	public String getTxtLName() {
		return txtLName.getText();
	}

	public String getTxtUserName() {
		return txtUserName.getText();
	}

	public String getTxtDoB() {
		return txtDoB.getText();
	}

	public String getTxtEmailId() {
		return txtEmailId.getText();
	}

	public String getTxtConNo() {
		return txtConNo.getText();
	}

	public String getComboUserGen() {
		return (String)comboUserGen.getSelectedItem();
	}

	public String getPasswordField() {
		return txtPassword.getText();
	}

	public String getTxtAge() {
		return txtAge.getText();
	}
	
	public String getTxtAddress(){
		return txtAddress.getText();
	}
	
	public String getTxtNationality(){
		return txtNationality.getText();
	}

	public EditUserPerInfo(User obj) {
		this.obj = obj;
		UserPersonalDtls per = obj.getPersonal();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(25, 25, 500,700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 lblNewLabel = new JLabel("Personal Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(179, 11, 145, 30);
		contentPane.add(lblNewLabel);
		
		 lblFName = new JLabel("First Name :");
		lblFName.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblFName.setBounds(10, 73, 75, 14);
		contentPane.add(lblFName);
		
		 lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblLastName.setBounds(10, 115, 75, 14);
		contentPane.add(lblLastName);
		
		txtFName = new JTextField(obj.getUsrFName());
	//	txtFName = new JTextField();
		txtFName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtFName.setBounds(116, 70, 133, 20);
		contentPane.add(txtFName);
		txtFName.setColumns(10);
		
		 lblUserName = new JLabel("User Name :");
		lblUserName.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblUserName.setBounds(10, 157, 75, 14);
		contentPane.add(lblUserName);
		
		 lblPassword = new JLabel("PassWord :");
		lblPassword.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblPassword.setBounds(10, 200, 75, 14);
		contentPane.add(lblPassword);
		
		 lblDateOfBirth = new JLabel("Date of Birth :");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblDateOfBirth.setBounds(10, 243, 85, 14);
		contentPane.add(lblDateOfBirth);
		
		 lblEmaiId = new JLabel("Emai Id :");
		lblEmaiId.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblEmaiId.setBounds(10, 284, 75, 14);
		contentPane.add(lblEmaiId);
		
		 lblContactNo = new JLabel("Contact No. :");
		lblContactNo.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblContactNo.setBounds(10, 416, 85, 14);
		contentPane.add(lblContactNo);
		
		 lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblAddress.setBounds(10, 460, 75, 14);
		contentPane.add(lblAddress);
		
		txtLName = new JTextField(obj.getUsrLName());
		txtLName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtLName.setColumns(10);
		txtLName.setBounds(116, 112, 133, 20);
		contentPane.add(txtLName);
		
	txtUserName = new JTextField(obj.getUsrUserName());
	//	txtUserName = new JTextField();
		txtUserName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtUserName.setColumns(10);
		txtUserName.setBounds(116, 154, 148, 20);
		txtUserName.setEditable(false);
		contentPane.add(txtUserName);
		
		txtDoB = new JTextField(per.getUsrDob());
		txtDoB.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtDoB.setColumns(10);
		txtDoB.setBounds(116, 240, 112, 20);
		contentPane.add(txtDoB);
		
		txtEmailId = new JTextField(obj.getUsrEmailId());
	//	txtEmailId = new JTextField();
		txtEmailId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEmailId.setColumns(10);
		txtEmailId.setBounds(116, 281, 208, 20);
		contentPane.add(txtEmailId);
		
		 btnSave = new JButton("Save And Close");
		btnSave.addActionListener(new UserPerInfoListener(this,obj));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSave.setBounds(166, 626, 145, 23);
		contentPane.add(btnSave);
		
		txtConNo = new JTextField(per.getUsrConNo());
		txtConNo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtConNo.setColumns(10);
		txtConNo.setBounds(116, 414, 148, 20);
		contentPane.add(txtConNo);
		
		 lblGen = new JLabel("Gender :");
		lblGen.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblGen.setBounds(10, 327, 75, 20);
		contentPane.add(lblGen);
		
		 lblAge = new JLabel("Age :");
		lblAge.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblAge.setBounds(10, 375, 75, 20);
		contentPane.add(lblAge);
		
		txtPassword = new JPasswordField(obj.getUsrPassWord());
		//txtPassword = new JPasswordField();
		txtPassword.setBounds(116, 198, 148, 20);
		txtPassword.setEditable(false);
		contentPane.add(txtPassword);
		
		txtAge = new JTextField(per.getUsrAge());
		txtAge.setBounds(116, 376, 85, 20);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		JScrollPane scrollAddress = new JScrollPane();
		scrollAddress.setBounds(116, 466, 234, 77);
		contentPane.add(scrollAddress);
		
		txtAddress = new JTextArea(per.getUsrAddress());
		scrollAddress.setViewportView(txtAddress);
		
		String[] gen = {per.getUsrGender(),"Male","Female"};
		comboUserGen = new JComboBox(gen);
		comboUserGen.setSelectedIndex(0);;
		comboUserGen.setBounds(116, 328, 85, 20);
		contentPane.add(comboUserGen);
		
		 lblLangKnown = new JLabel("Languages :");
		lblLangKnown.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblLangKnown.setBounds(10, 576, 96, 14);
		contentPane.add(lblLangKnown);
		
		 lblNationality = new JLabel("Nationality :");
		lblNationality.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNationality.setBounds(228, 378, 96, 14);
		contentPane.add(lblNationality);
		
		 lblMaritalStatus = new JLabel("Marital Status :");
		lblMaritalStatus.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblMaritalStatus.setBounds(228, 331, 96, 14);
		contentPane.add(lblMaritalStatus);
		
		String[] mStatus = {per.getUsrMaritalStatus(),"Married","Unmarried"};
		comboMarital = new JComboBox(mStatus);
		comboMarital.setBounds(352, 328, 85, 20);
		contentPane.add(comboMarital);
		
		txtNationality = new JTextField(per.getUsrNationlity());
		txtNationality.setColumns(10);
		txtNationality.setBounds(352, 376, 122, 20);
		contentPane.add(txtNationality);
		
		txtLangKnown = new JTextField(per.getUsrLanguages());
		txtLangKnown.setBounds(115, 574, 235, 20);
		contentPane.add(txtLangKnown);
		txtLangKnown.setColumns(10);
	}
}
