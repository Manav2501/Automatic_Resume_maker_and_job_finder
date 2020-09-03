package com.resumeBuilder.model.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public abstract class CompanyStorage {

public static void writeCompanyFile(Company obj){
		
		FileOutputStream fout = null; 
		ObjectOutputStream oOut = null;
		File fobj = null;
		
			try{	
				    fobj = new File("Companies.txt");
				    
				    if(fobj.exists()){
						fout = new FileOutputStream(fobj, true);
						oOut = new com.resumeBuilder.connectivity.AppendableObjectOutputStream(fout);
					}
					else
					{
						fout = new FileOutputStream(fobj, true);
						oOut = new ObjectOutputStream(fout);
						
					}	
					oOut.writeObject(obj);
		       }
			
			catch(IOException err){
				
					System.out.println(err);
				}
			
			finally{
				
					try{
						
						if(fout != null)
							fout.close();
						if(oOut != null)
							oOut.close();
			
					}
					
					catch(IOException err){
						
						System.out.println(err);
					}
				}
	}
	
	public static ArrayList<Company> readCompanies(){
		
		ArrayList<Company> companies = new ArrayList<>();
		
	    Company e = null;
		File fobj = new File("Companies.txt");
		FileInputStream fin = null;
		ObjectInputStream oIn = null;
		
		if(fobj.exists())
		{			
			try{
						
				fin = new FileInputStream(fobj);
				oIn = new ObjectInputStream(fin);
						
				while(fin.available() > 0){
							
					e = (Company) oIn.readObject();
					companies.add(e);	
					}
				}
						
			catch(IOException err){
						
				System.out.println(err);
			} 
					
			catch (Exception err) {
						
				System.out.println(err);
			}
					
			finally{
						
				try{
							
					if(oIn != null)
						oIn.close();
					if(fin != null)
						fin.close();
					}
				catch(IOException err){
							
					System.out.println(err);
					}
						
				   }
			
				return companies;
		}
			
		else{
			
		    return null;
		}
	}
	
	public static void writeCompanyList(ArrayList<Company> companies){
		
		FileOutputStream fout = null; 
		ObjectOutputStream oOut = null;
		
			try{	
					fout = new FileOutputStream("Companies.txt");
					oOut = new ObjectOutputStream(fout);
						
					for(Company e: companies){
						oOut.writeObject(e);
					}
					
		       }
			
			catch(IOException err){
				
					System.out.println(err);
				}
			
			finally{
				
					try{
						
						if(fout != null)
							fout.close();
						if(oOut != null)
							oOut.close();
			
					}
					
					catch(IOException err){
						System.out.println(err);
					}
				}
	}
	
}

