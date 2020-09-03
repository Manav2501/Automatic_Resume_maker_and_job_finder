package com.resumeBuilder.view.user;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.resumeBuilder.controller.user.EditEduInfoListener;
import com.resumeBuilder.model.user.User;
import com.resumeBuilder.model.user.UserEduDtls;
import com.resumeBuilder.model.user.UserStorage;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EditUserEduInfo extends JFrame {

	private JPanel contentPane;
	private  User obj;
	private JComboBox comboProfessionType;
	private JTextField txtProfession;
	private JTextField txtSscSchool;
	private JTextField txtSscPer;
	private JTextField txtSscPassing;
	private JTextField txtHscPer;
	private JTextField txtHscSchool;
	private JTextField txtHscPassing;
	private JTextField txtGradClg;
	private JTextField txtGradPer;
	private JTextField txtGradPassing;
	private JTextField txtSscGrade;
	private JTextField txtHscGrade;
	private JTextField txtGradGrade;
	private JLabel lblbTitle;
	private JLabel lblProfession;
	private JLabel lblProfessionType;
	private JLabel lblSscSchool;
	private JLabel lblSscPer;
	private JLabel lblSscPassing;
	private JLabel lblHscPer;
	private JLabel lblHscSchool;
	private JLabel lblHscPassing;
	private JLabel lblGradClg;
	private JLabel lblGradPer;
	private JLabel lblGradPassing;
	private JLabel lblSscGrade;
	private JLabel lblHscGrade;
	private JLabel lblGradGrade;
	private JLabel lblSscInfo;
	private JLabel lblHscInfo;
	private JLabel lblPrtgSign2;
	private JLabel lblPrtgSign1;
	private JLabel lblGraduationInfo;
	private JButton btnSave;

	public String getTxtSscGrade() {
		return txtSscGrade.getText();
	}

	public String getTxtHscGrade() {
		return txtHscGrade.getText();
	}

	public String getTxtGradGrade() {
		return txtGradGrade.getText();
	}

	public String getTxtSscSchool() {
		return txtSscSchool.getText();
	}

	public String getTxtSscPer() {
		return txtSscPer.getText();
	}

	public String getTxtSscPassing() {
		return txtSscPassing.getText();
	}

	public String getTxtHscPer() {
		return txtHscPer.getText();
	}

	public String getTxtHscSchool() {
		return txtHscSchool.getText();
	}

	public String getTxtHscPassing() {
		return txtHscPassing.getText();
	}

	public String getTxtGradSchool() {
		return txtGradClg.getText();
	}

	public String getTxtGradPer() {
		return txtGradPer.getText();
	}

	public String getTxtGradPassing() {
		return txtGradPassing.getText();
	}

	public String getComboProfessionType() {
		return (String)comboProfessionType.getSelectedItem();
	}

	public String  getTxtProfession() {
		return txtProfession.getText();
	}

	public EditUserEduInfo(User obj) {
		this.obj = obj;
		ArrayList<UserEduDtls> currDtls = new ArrayList<>();
		currDtls = obj.getArr();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525,635);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] proType = {obj.getArr().get(0).getUsrprofessionType(),"Academics" , "Medical","Engineering","Commercials"};
		comboProfessionType = new JComboBox(proType);
		comboProfessionType.setBounds(134, 69, 102, 20);
		comboProfessionType.setSelectedIndex(0);
		contentPane.add(comboProfessionType);
		
		 lblbTitle = new JLabel("Educational Qualifications");
		lblbTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblbTitle.setBounds(151, 11, 201, 28);
		contentPane.add(lblbTitle);
		
		 lblProfessionType = new JLabel("Profession Type :");
		lblProfessionType.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblProfessionType.setBounds(10, 70, 102, 17);
		contentPane.add(lblProfessionType);
		
		 lblProfession = new JLabel("Profession :");
		lblProfession.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblProfession.setBounds(281, 70, 102, 17);
		contentPane.add(lblProfession);
		
		txtProfession = new JTextField(obj.getArr().get(0).getUsrprofession());
		txtProfession.setBounds(377, 69, 102, 20);
		contentPane.add(txtProfession);
		txtProfession.setColumns(10);
		
		 lblSscInfo = new JLabel("SSC Info :");
		lblSscInfo.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblSscInfo.setBounds(10, 113, 102, 17);
		contentPane.add(lblSscInfo);
		
		 lblSscSchool = new JLabel("Name of School -");
		lblSscSchool.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblSscSchool.setBounds(52, 141, 102, 17);
		contentPane.add(lblSscSchool);
		
		txtSscSchool = new JTextField(currDtls.get(0).getNameOfSchool());
		txtSscSchool.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtSscSchool.setBounds(164, 140, 219, 20);
		contentPane.add(txtSscSchool);
		txtSscSchool.setColumns(10);
		
		 lblSscPer = new JLabel("Percentage -");
		lblSscPer.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblSscPer.setBounds(52, 179, 102, 17);
		contentPane.add(lblSscPer);
		
		txtSscPer = new JTextField(currDtls.get(0).getPercentage());
		txtSscPer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtSscPer.setBounds(164, 178, 45, 20);
		contentPane.add(txtSscPer);
		txtSscPer.setColumns(10);
		
		
		lblSscGrade = new JLabel("Grade -");
		lblSscGrade.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblSscGrade.setBounds(281, 181, 53, 17);
		contentPane.add(lblSscGrade);
		
		lblSscPassing = new JLabel("Year of Passing -");
		lblSscPassing.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblSscPassing.setBounds(52, 220, 102, 17);
		contentPane.add(lblSscPassing);
		
		txtSscPassing = new JTextField(currDtls.get(0).getPassingYear());
		txtSscPassing.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtSscPassing.setColumns(10);
		txtSscPassing.setBounds(164, 219, 111, 20);
		contentPane.add(txtSscPassing);
		
		lblHscInfo = new JLabel("HSC Info :");
		lblHscInfo.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblHscInfo.setBounds(10, 265, 102, 17);
		contentPane.add(lblHscInfo);
		
		lblHscSchool = new JLabel("Name of School -");
		lblHscSchool.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblHscSchool.setBounds(52, 293, 102, 17);
		contentPane.add(lblHscSchool);
		
		 lblHscPer = new JLabel("Percentage -");
		lblHscPer.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblHscPer.setBounds(52, 331, 102, 17);
		contentPane.add(lblHscPer);
		
		txtHscPer = new JTextField(currDtls.get(1).getPercentage());
		txtHscPer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtHscPer.setColumns(10);
		txtHscPer.setBounds(164, 330, 45, 20);
		contentPane.add(txtHscPer);
		
		txtHscSchool = new JTextField(currDtls.get(1).getNameOfSchool());
	//	txtHscSchool = new JTextField();
		txtHscSchool.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtHscSchool.setColumns(10);
		txtHscSchool.setBounds(164, 292, 219, 20);
		contentPane.add(txtHscSchool);
		
		 lblHscPassing = new JLabel("Year of Passing -");
		lblHscPassing.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblHscPassing.setBounds(52, 370, 102, 17);
		contentPane.add(lblHscPassing);
		
		txtHscPassing = new JTextField(currDtls.get(1).getPassingYear());
	//	txtHscPassing = new JTextField();
		txtHscPassing.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtHscPassing.setColumns(10);
		txtHscPassing.setBounds(164, 369, 111, 20);
		contentPane.add(txtHscPassing);
		
		 lblHscGrade = new JLabel("Grade -");
		lblHscGrade.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblHscGrade.setBounds(281, 333, 53, 17);
		contentPane.add(lblHscGrade);
		
		 lblPrtgSign1 = new JLabel("%");
		lblPrtgSign1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrtgSign1.setBounds(219, 333, 46, 14);
		contentPane.add(lblPrtgSign1);
		
		 lblGraduationInfo = new JLabel("Graduation Info :");
		lblGraduationInfo.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblGraduationInfo.setBounds(10, 418, 102, 17);
		contentPane.add(lblGraduationInfo);
		
		 lblGradClg = new JLabel("Name of College -");
		lblGradClg.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblGradClg.setBounds(52, 446, 102, 17);
		contentPane.add(lblGradClg);
		
		txtGradClg = new JTextField(currDtls.get(2).getNameOfSchool());
	//	txtGradSchool = new JTextField();
		txtGradClg.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtGradClg.setColumns(10);
		txtGradClg.setBounds(164, 445, 219, 20);
		contentPane.add(txtGradClg);
		
		 lblGradPer = new JLabel("Percentage -");
		lblGradPer.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblGradPer.setBounds(52, 487, 102, 17);
		contentPane.add(lblGradPer);
		
		txtGradPer = new JTextField(currDtls.get(2).getPercentage());
	//	txtGradPer = new JTextField();
		txtGradPer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtGradPer.setColumns(10);
		txtGradPer.setBounds(164, 486, 45, 20);
		contentPane.add(txtGradPer);
		
		 lblGradGrade = new JLabel("Grade -");
		lblGradGrade.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblGradGrade.setBounds(281, 489, 53, 17);
		contentPane.add(lblGradGrade);
		
		 lblPrtgSign2 = new JLabel("%");
		lblPrtgSign2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrtgSign2.setBounds(219, 489, 46, 14);
		contentPane.add(lblPrtgSign2);
		
		 lblGradPassing = new JLabel("Year of Passing -");
		lblGradPassing.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblGradPassing.setBounds(52, 525, 102, 17);
		contentPane.add(lblGradPassing);
		
		txtGradPassing = new JTextField(currDtls.get(2).getPassingYear());
		//txtGradPassing = new JTextField();
		txtGradPassing.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtGradPassing.setColumns(10);
		txtGradPassing.setBounds(164, 524, 111, 20);
		contentPane.add(txtGradPassing);
		
		 btnSave = new JButton("Save and Close");
		btnSave.addActionListener(new EditEduInfoListener(this,obj)); 
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSave.setBounds(194, 562, 140, 23);
		contentPane.add(btnSave);
		
		txtSscGrade = new JTextField(currDtls.get(0).getGrade());
		txtSscGrade.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtSscGrade.setBounds(336, 178, 86, 20);
		contentPane.add(txtSscGrade);
		txtSscGrade.setColumns(10);
		
		txtHscGrade = new JTextField(currDtls.get(1).getGrade());
		txtHscGrade.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtHscGrade.setColumns(10);
		txtHscGrade.setBounds(344, 330, 86, 20);
		contentPane.add(txtHscGrade);
		
		txtGradGrade = new JTextField(currDtls.get(2).getGrade());
		txtGradGrade.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtGradGrade.setColumns(10);
		txtGradGrade.setBounds(344, 486, 86, 20);
		contentPane.add(txtGradGrade);
		
	}
	
	
}
