package com.resumeBuilder.controller.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.resumeBuilder.model.company.Company;
import com.resumeBuilder.model.company.CompanyStorage;
import com.resumeBuilder.view.company.CompanyOptionsView;
import com.resumeBuilder.view.company.EditCompanyDtls;

public class CompEditDtlsListener implements ActionListener{
	
	private EditCompanyDtls editDtlsView;
	private Company obj;
	
	public CompEditDtlsListener(EditCompanyDtls editDtlsView, Company obj) {
		
		this.editDtlsView = editDtlsView;
		this.obj = obj;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			obj.setComEmailId(editDtlsView.getTxtComEmailid());
			ArrayList<Company> company = new ArrayList<>();
			company = CompanyStorage.readCompanies();
			int flag = 0;
			for(Company temp : company) {
				if(editDtlsView.getTxtComEmailid().equals(temp.getComEmailId())) {
					if(!((temp.getComUserName().equals(editDtlsView.getTxtComUsername()) && (temp.getComPassWord().equals(editDtlsView.getPwdComPass()))))) {
						JOptionPane.showMessageDialog(null, "Enter Different Email ID!");
						flag = 1;
					}
				}
			}
			
			if(flag == 0) {
				obj.setComEmailId(editDtlsView.getTxtComEmailid());
				obj.setComFullName(editDtlsView.getTxtComName());
				obj.setComHeadAddress(editDtlsView.getTxtAddress());
				obj.setComMainConNo(editDtlsView.getTxtComContactNum());
				obj.setReqEmployeeType(editDtlsView.getTxtReqEmployee());
				obj.setComType(editDtlsView.getTxtCompanyField());
				
				int cnt, key;
				cnt = key = 0;
			
				for(Company temp : company) {
					if((temp.getComUserName().equals(editDtlsView.getTxtComUsername()) && (temp.getComPassWord().equals(editDtlsView.getPwdComPass())))) {
						key = cnt;
					}
					cnt++;
				}
				company.remove(key);
				company.add(obj);
				CompanyStorage.writeCompanyList(company);
				CompanyOptionsView frame = new CompanyOptionsView(obj);
				frame.setVisible(true);
				editDtlsView.setVisible(false);
			}
			
		}catch (Exception error) {
			error.printStackTrace();
		}
	}
		
}
