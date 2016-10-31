package com.db;


 import java.util.*;

import org.apache.commons.io.FileUtils;

import java.sql.*;
  import java.io.*;
  import Signup.text.Signupbean;

import com.dbpropfile.Dbproperty;
import com.opensymphony.xwork2.ActionSupport;



public class Dbconnection extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	Dbproperty dbco=new Dbproperty();
	
	
	public Signupbean SignupBean;
	int i=0;
	String firstname;
	String lastname;
	String emailid;
	String passwordi;
	String Day;
	String Month;
	String  Year;
	String gender;
	private File fileUpload;
	private String fileUploadFileName;
	private String fileUploadContentType;
	
	
	public String getFileUploadContentType() {
		return fileUploadContentType;
	}

	public void setFileUploadContentType(String fileUploadContentType) {
		this.fileUploadContentType = fileUploadContentType;
	}

	public String getFileUploadFileName() {
		return fileUploadFileName;
	}

	public void setFileUploadFileName(String fileUploadFileName) {
		this.fileUploadFileName = fileUploadFileName;
	}
	
	public File getFileUpload() {
        return this.fileUpload;
    }
 
    public void setFileUpload(File fileUpload) {
        this.fileUpload = fileUpload;
    }
	
	
	public void setFirstname(String fname)
	{
		this.firstname = fname;	
	}
	public String getFirstname()
	{
		return this.firstname;
	}
	
	public void setLastname(String lastname)
	{
		this.lastname=lastname;
	}
	public String getLastname()
	{
		return this.lastname;
	}
	
	public void setEmailid(String ema)
	{
		this.emailid=ema;
	}
	public String getEmailid()
	{
		return this.emailid;
	}
	

	public void setPasswordi(String passwordi)
	{
	this.passwordi=passwordi;
	}
	public String getPasswordi()
	{
		return this.passwordi;
	}
	
	public void setDay(String  Da)
	{
		Day=Da;
	}
	public String getDay()
	{
		return this.Day;
	}
	
	public void setMonth(String Mnth)
	{
		Month=Mnth;
	}
	public String getMonth()
	{
		return this.Month;
	}
	
	public void setYear(String Yr)
	{
		Year=Yr;
	}
	public String getYear()
	{
		return this.Year;
	}
	
	
	public void setGender(String gen)
	{
		gender=gen;
	}
	public String getGender()
	{
		return this.gender;
	}

	
	
	
	
		public String execute() {
			
			
	       
			
		/*	String email=SignupBean.getEmaile();
			String password=SignupBean.getNewpsw();
			String firstname=SignupBean.getFirstname();
			String lastname=SignupBean.getLastname();
	String day=SignupBean.getDay();
		String month=SignupBean.getMonth();
		String yr= SignupBean.getYear();
		String dob=yr+"-"+month+"-"+day;
		String gen=SignupBean.getGender();*/
			
			
			
			String firstname=this.getFirstname();
			String lastnam=this.getLastname();
			String email=this.getEmailid();
			String password=this.getPasswordi();
		String day=this.getDay();
		String month=this.getMonth();
		String yr= this.getYear();
		String dob=yr+"-"+month+"-"+day;
		String gen=this.getGender();
		String FileUploadFilename=this.getFileUploadFileName();
		File FileUpload=this.getFileUpload();
			
			System.out.println(firstname);
			System.out.println(lastnam);
			System.out.println(email);
			System.out.println(password);
		System.out.println(dob);
			System.out.println(gen);
			System.out.println(FileUploadFilename);
			System.out.println(FileUpload);
			
			/*String url="jdbc:mysql://localhost:3306/";
			String dbname="mysql";
			String driver ="com.mysql.jdbc.Driver";
			String dbusername="root";
			String dbpassword="root";
			Connection con;*/
			try {
				//Class.forName(driver).newInstance();
				//con=DriverManager.getConnection(url+dbname,dbusername,dbpassword);

				
				String destPath = "C:/apache-tomcat-6.0.33/work/";
 File destFile =null;
			      try{
			     	 System.out.println("Src File name: " + FileUpload);
			     	 System.out.println("Dst File name: " + FileUploadFilename);
			     	    	 
			     	  destFile  = new File(destPath, FileUploadFilename);
			     	
			    	 FileUtils.copyFile(FileUpload, destFile);
			    	 System.out.println(destFile);
			  
			      }catch(IOException e){
			         e.printStackTrace();
			        
			      }
			    
				
				System.out.println(email);
				System.out.println(password);
			
				
				
				Statement objStatement=dbco.con.createStatement();
				
				String queryString="insert into  tbl_fb (vchr_firstname,vchr_surname,vchr_email,vchr_pswd,dt_dob,vchr_gender,image)values('"+firstname+"','"+lastnam +"','"+email+"','"+password+"','"+dob+"','"+gen+"','"+destFile+"')";
				
				objStatement.executeUpdate(queryString);
				
				i++;
			
				
								
			}
			catch (Exception e)
			{
			System.out.println(e);
			
			}

			
			if(i==1){
			return "success";
			}
			else{
				return  "error";}

		}
		
		
}
		
/*	public Signupbean getSignupbean() {
	        return SignupBean;
	    }
	 
	    public void setSignupbean(Signupbean SignupBean) {
	        this.SignupBean = SignupBean;
	    }
	}*/