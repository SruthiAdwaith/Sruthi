package com.db;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
 import java.util.*;
 import java.sql.*;
  import java.io.*;
  import com.user.User;

@Controller
public class Dbconnection {
	int ResponseCode; 
	
	@RequestMapping(value="/login",method=RequestMethod.POST)

	   public  @ResponseBody int  getSearchUserProfile() 
	   
	   //(@RequestParam("email") String email, @RequestParam("password") String password
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
			
			
			
			String queryString="select vchr_email,vchr_pswd from  tb_service_login where vchr_email='"+email+"' && vchr_pswd='"+password+"'";
			//String queryString="select vchr_email,vchr_pswd from  tb_service_login where vchr_email='"+EMA+"' && vchr_pswd='"+pas+"'";
			ResultSet rs =objStatement.executeQuery(queryString);
			
			while(rs.next())
			{
			 
				 ResponseCode=200;
			}
			
			
			while(!rs.next())
			{
				
				String dbemail=rs.getString("vhr_email");
				String dbpswd=rs.getString("vchr_pswd");
				
				
				if(dbemail.equals(email))
				{
					ResponseCode=500;
				}
				
				else if(dbpswd.equals(password))
				{
					ResponseCode=404;
					
				}
			}
			
			
		} 
		catch (Exception e)
		{
		System.out.println(e);
		}

		
		
		
		
	      
	       return (ResponseCode);

}
	
	
}