package com.resumeBuilder.view.admin.mngCompany;

import java.awt.EventQueue;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import com.resumeBuilder.controller.admin.DispAllCompListener;
import com.resumeBuilder.model.company.Company;
import com.resumeBuilder.model.company.CompanyStorage;;

public class AdmDispAllCompanies extends JFrame {

	private JPanel contentPane;
	private JLabel lblCompUsername;
	private JScrollPane ScrCompList;
	private JButton btnBack;
	private JLabel lblBack;
	private JLabel Title;
	
	public AdmDispAllCompanies() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 279);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		
		ScrCompList = new JScrollPane(contentPane,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		contentPane.add(new JLabel("   "));
		
		btnBack = new JButton("<--");
		btnBack.addActionListener(new DispAllCompListener(this));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnBack);
		
		lblBack = new JLabel("    Back");
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBack);
		
		Title = new JLabel("                        COMPANY LIST");
		Title.setFont(new Font("Arial",Font.BOLD,20));
		contentPane.add(Title);
		contentPane.add(new JLabel("   "));
		
		
		ArrayList<Company> companies = new ArrayList<>();
		companies = CompanyStorage.readCompanies();
		if(companies != null){
			for(Company temp : companies){
				lblCompUsername = new JLabel(temp.getComUserName());
			
				contentPane.add(lblCompUsername);
				contentPane.add(new JLabel("   "));
			}
		}
		
		getContentPane().add(ScrCompList);
		setLocationRelativeTo(null);
		
		
		
	}
}
