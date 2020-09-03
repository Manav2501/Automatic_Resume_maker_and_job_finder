package com.resumeBuilder.model.user;

import java.io.FileOutputStream;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public abstract class MakePDF {
	
	private static User object;
	private static String FILE = "C:/Users/jaypatel/Desktop/Resume.pdf";
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 24, Font.BOLD);
    private static Font subTitleFont = new Font(Font.FontFamily.TIMES_ROMAN, 14,Font.BOLD);
   // private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,Font.BOLD);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL);

    public static boolean makeResumePdf(User obj) {
            try {
            		object = obj;
                    Document document = new Document();
                    PdfWriter.getInstance(document, new FileOutputStream(FILE));
                    document.open();
                    addContent(document);
                    document.close();
                    return true;
            } catch (Exception e) {
                    return false;
            }
    }

   
    private static void addContent(Document document)
                    throws DocumentException {
            Paragraph preface = new Paragraph();
            addEmptyLine(preface, 1);
           
            preface.add(new Paragraph(object.getUsrFName() + " " + object.getUsrLName(), catFont));

            addEmptyLine(preface, 2);
           
            preface.add(new Paragraph("DOB                       : " + object.getPersonal().getUsrDob() ,smallBold));
            
             preface.add(new Paragraph("Email                     : " + object.getUsrEmailId(),smallBold));
             preface.add(new Paragraph("Gender                   : " + object.getPersonal().getUsrGender(),smallBold));
             preface.add(new Paragraph("Contact Number    : " + object.getPersonal().getUsrConNo(),smallBold));
             preface.add(new Paragraph("Profession             : " + object.getArr().get(0).getUsrprofession(),smallBold));
             preface.add(new Paragraph("College                  : " + object.getArr().get(2).getNameOfSchool(),smallBold));
             addEmptyLine(preface, 1);
             preface.add(new Paragraph("_______________________________________________________________________________________",smallBold));

             createTable(preface);
             addprojectDtls(preface);
             document.newPage();
             addInterests(preface);
             addAwards(preface);
             addCoCurriculars(preface);
             addHobies(preface);
             addPersonalDtls(preface);
            
             
            document.add(preface);
            
            document.newPage();
    }
    
    private static void addAwards(Paragraph preface) {
        addEmptyLine(preface, 2);
        preface.add(new Paragraph("Awards & Achievements", subTitleFont));
        preface.add(new Paragraph("_______________________________________________________________________________________",smallBold));
        addEmptyLine(preface, 2);
        
        String mainString = object.getOtherDtls().getUsrAchievements();
        String[] achievements = mainString.split("\n");
        for(String temp : achievements){
        	preface.add(new Paragraph("- " + temp,new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL)));
        }
        
    }
    private static void addCoCurriculars(Paragraph preface) {
        addEmptyLine(preface, 2);
        preface.add(new Paragraph("Cocurricular Activities", subTitleFont));
        preface.add(new Paragraph("_______________________________________________________________________________________",smallBold));
        addEmptyLine(preface, 2);
        
        String mainString = object.getOtherDtls().getUsrCurricular();
        String[] coCurriculars = mainString.split("\n");
        for(String temp : coCurriculars){
        	preface.add(new Paragraph("- " + temp,new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL)));
        }
        
    }
    private static void addHobies(Paragraph preface) {
        addEmptyLine(preface, 2);
        preface.add(new Paragraph("Hobbies", subTitleFont));
        preface.add(new Paragraph("_______________________________________________________________________________________",smallBold));
        addEmptyLine(preface, 2);
        
        String mainString = object.getOtherDtls().getUsrHobbies();
        String[] awards = mainString.split("\n");
        for(String temp : awards){
        	preface.add(new Paragraph("- " + temp,new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL)));
        }
        
    }
    private static void addInterests(Paragraph preface) {

        addEmptyLine(preface, 7);
        preface.add(new Paragraph("Areas of Interest", subTitleFont));
        preface.add(new Paragraph("_______________________________________________________________________________________",smallBold));
        addEmptyLine(preface, 2);
        
        String mainString = object.getOtherDtls().getUsrInterest();
        String[] interests = mainString.split("\n");
        for(String temp : interests){
        	preface.add(new Paragraph("- " + temp,new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL)));
        }
        
    }
    
    private static void addPersonalDtls(Paragraph preface) {

        addEmptyLine(preface, 15);
        preface.add(new Paragraph("Personal Details ", subTitleFont));
        preface.add(new Paragraph("_______________________________________________________________________________________",smallBold));
        addEmptyLine(preface, 2);
        
        preface.add(new Paragraph("-Age                       : " + object.getPersonal().getUsrAge(),new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL)));
        preface.add(new Paragraph("-Marital Status        : " + object.getPersonal().getUsrMaritalStatus(),new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL)));
        preface.add(new Paragraph("-Nationality            : " + object.getPersonal().getUsrNationlity(),new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL)));
        preface.add(new Paragraph("-Languages known : " + object.getPersonal().getUsrLanguages(),new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL)));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("-Address                 : ",new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL)));
        addEmptyLine(preface, 1);
        
        String mainString = object.getPersonal().getUsrAddress();
        String[] address = mainString.split("\n");
        
        for(String temp : address){
        	preface.add(new Paragraph(temp,new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL)));
        }
        
    }
    
    public static void addprojectDtls(Paragraph preface){
    	
    	addEmptyLine(preface, 5);
        preface.add(new Paragraph("Final Project", subTitleFont));
        preface.add(new Paragraph("_______________________________________________________________________________________",smallBold));
        addEmptyLine(preface, 2);
        
    	preface.add(new Paragraph("-Project Title : " + object.getPrj().getPrjTitle() ,new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL)));
    	preface.add(new Paragraph("-Team Size : " + object.getPrj().getPrjNoOfMembers() ,new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL)));
    	addEmptyLine(preface, 1);
    	preface.add(new Paragraph("-Project Description :" ,new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL)));
    	addEmptyLine(preface, 1);
    	preface.add(new Paragraph(object.getPrj().getPrjDescription() ,new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.NORMAL)));
    	
    }

    private static void createTable(Paragraph preface)
            throws BadElementException {
    	
    addEmptyLine(preface, 2);
    preface.add(new Paragraph("Educational  Qualifications", subTitleFont));
    addEmptyLine(preface, 1);
    PdfPTable table = new PdfPTable(5);
    try {
		table.setWidths(new int[]{1,2,2,1,1});
	} catch (DocumentException e) {
		e.printStackTrace();
	}

     //((pdfPTable) table).setBorderColor(BaseColor.GRAY);
    // t.setPadding(4);
    // t.setSpacing(4);
    // t.setBorderWidth(1);

    PdfPCell c1 = new PdfPCell(new Phrase("Name of Course"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    c1.setHorizontalAlignment(5);
    c1.setFixedHeight(36f);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("School/College Name"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("Percentage"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);
    
    c1 = new PdfPCell(new Phrase("Grade"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);
    
    c1 = new PdfPCell(new Phrase("Passing Year"));
    c1.setHorizontalAlignment(Element.ALIGN_CENTER);
    table.addCell(c1);
    
    table.setHeaderRows(1);

    for(UserEduDtls temp:object.getArr()){
    	
	    table.addCell(temp.getBoardType());
	    table.addCell(temp.getNameOfSchool());
	    table.addCell(temp.getPercentage());
	    table.addCell(temp.getGrade());
	    table.addCell(temp.getPassingYear());

    	}
    preface.add(table);
    
    }
    private static void addEmptyLine(Paragraph paragraph, int number) {
            for (int i = 0; i < number; i++) {
                    paragraph.add(new Paragraph(" "));
            }
    }

}
