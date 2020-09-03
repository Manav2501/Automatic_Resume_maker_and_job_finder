package com.resumeBuilder.model.user;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import com.resumeBuilder.connectivity.AppendableObjectOutputStream;


public abstract class UserStorage {
		
	public static void writeUserFile(User obj){
		
		FileOutputStream fout = null; 
		ObjectOutputStream oOut = null;
		File fobj = null;
		
			try{	
				    fobj = new File("Users.txt");
				    
				    if(fobj.exists()){
						fout = new FileOutputStream(fobj, true);
						oOut = new AppendableObjectOutputStream(fout);
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
	
	public static ArrayList<User> readUsers(){
		
		ArrayList<User> users = new ArrayList<>();
		
	    User e = null;
		File fobj = new File("Users.txt");
		FileInputStream fin = null;
		ObjectInputStream oIn = null;
		
		if(fobj.exists())
		{			
			try{
						
				fin = new FileInputStream(fobj);
				oIn = new ObjectInputStream(fin);
						
				while(fin.available() > 0){
							
					e = (User) oIn.readObject();
					users.add(e);	
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
			
				return users;
		}
			
		else{
		    return null;
		}
	}
	
	public static void writeUserList(ArrayList<User> user){
		
		FileOutputStream fout = null; 
		ObjectOutputStream oOut = null;
		
			try{	
					fout = new FileOutputStream("Users.txt");
					oOut = new ObjectOutputStream(fout);
						
					for(User e: user){
						
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
