package com.resumeBuilder.view.company;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.resumeBuilder.controller.admin.DispAllUserListener;
import com.resumeBuilder.controller.company.DsplyUsrDtlsListener;
import com.resumeBuilder.model.company.Company;
import com.resumeBuilder.model.user.User;
import com.resumeBuilder.model.user.UserStorage;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DisplayUsersDtls extends JFrame {

	private JPanel contentPane;
	private JButton btnBack;
	private JLabel lblBack;
	private  String profType;
	private  Company obj;

	public DisplayUsersDtls(Company obj , String profType) {
		this.obj = obj;
		this.profType = profType;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		JScrollPane ScrUsrList = new JScrollPane(contentPane,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		contentPane.add(new JLabel("   "));
		
		btnBack = new JButton("<--");
	   btnBack.addActionListener(new DsplyUsrDtlsListener(this,obj));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnBack);
		
		lblBack = new JLabel("     back");
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBack);
		JLabel lblUserList = new JLabel("                          Users List");
		lblUserList.setFont(new Font("Arial",Font.BOLD,20));
		contentPane.add(lblUserList);

		contentPane.add(new JLabel("   "));
		
		
		ArrayList<User> users = new ArrayList<>();
		users = UserStorage.readUsers();
	
			for(User temp : users){
				if(profType.equals(temp.getArr().get(0).getUsrprofessionType())){
					System.out.println(profType +"    " +temp.getArr().get(0).getUsrprofessionType() );
					contentPane.add(new JLabel("Name :  " + temp.getUsrFName() + "   " + temp.getUsrLName()));
					contentPane.add(new JLabel("Age :  " + temp.getPersonal().getUsrAge()));
					contentPane.add(new JLabel("Gender  :  " + temp.getPersonal().getUsrGender()));
					contentPane.add(new JLabel("Languages  :  " + temp.getPersonal().getUsrLanguages()));
					contentPane.add(new JLabel("Profession :  " + temp.getArr().get(0).getUsrprofession()));
					contentPane.add(new JLabel("Graduation College :  " + temp.getArr().get(2).getNameOfSchool()));
					contentPane.add(new JLabel("Graduation Percentage :  " + temp.getArr().get(2).getPercentage()));
					contentPane.add(new JLabel("Graduation Grade :  " + temp.getArr().get(2).getGrade()));
					contentPane.add(new JLabel("Final year Project  :  " + temp.getPrj().getPrjTitle()));
					contentPane.add(new JLabel("Email ID  :  " + temp.getUsrEmailId()));
					contentPane.add(new  JLabel("__________________________________________________"));
				}
				
			}
		setLocationRelativeTo(null);
		getContentPane().add(ScrUsrList);
	}

}
