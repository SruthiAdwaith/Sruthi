package com.db;


 import java.util.*;
 import java.sql.*;
  import java.io.*;
  import com.user.User;
  import java.sql.Connection;
  import java.sql.DriverManager;
  
  import java.sql.ResultSet;

  import com.opensymphony.xwork2.ActionSupport;

public class Dbconnection extends ActionSupport {
	private static final long serialVersionUID = 1L;
	int ResponseCode; 
	
	

	  public   int  getSearchUserProfile() 
	   
	   
	{
	     
		String email="sruthi";
		String password="devu";
		String url="jdbc:mysql://localhost:3306/";
		String dbname="mysql";
		String driver ="com.mysql.jdbc.Driver";
		String dbusername="root";
		String dbpassword="root";
		Connection con;
		try {
			Class.forName(driver).newInstance();
			con=DriverManager.getConnection(url+dbname,dbusername,dbpassword);

			
			
		    
			User obj=new User();
			obj.setEmail(email);
			obj.setPassword(password);
			
			
			Statement objStatement=con.createStatement();
			
			
			
			String queryString="select vchr_email,vchr_pswd from  tb_service_login where vchr_email='"+email+"' || vchr_pswd='"+password+"'";
			//String queryString="select vchr_email,vchr_pswd from  tb_service_login where vchr_email='"+EMA+"' && vchr_pswd='"+pas+"'";
			ResultSet rs =objStatement.executeQuery(queryString);
			String dbemail=rs.getString("vhr_email");
			String dbpswd=rs.getString("vchr_pswd");
			while(rs.next())
			{
			 
			if(dbemail.equals(email)&& dbpswd.equals(password))	 
			{
				ResponseCode=200;	
			}
				
				
				
				else if(dbemail.equals(email)&& !(dbpswd.equals(password)))
				{
					ResponseCode=500;
				}
				
				else if(dbpswd.equals(password)&&!(dbemail.equals(email)))
				{
					ResponseCode=404;
					
				}
			}
			
			
		} 
		catch (Exception e)
		{
		System.out.println(e);
		return 0;
		}

		
		
		
		
	      
	       return (ResponseCode);

    }
	
	
   }