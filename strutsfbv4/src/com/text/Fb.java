package com.text;
import java.sql.Connection;
import com.dbpropfile.Dbproperty;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import Signup.text.Signupbean;

import com.opensymphony.xwork2.ActionSupport;
import com.user.User;


public class Fb extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private User userBean;
	String ResponseCode;
	Dbproperty dbcon=new Dbproperty();
	
   // Connection con=dbcon.con;
	public String execute() {
		System.out.println(dbcon.con);
		/*
		 if (userBean.getUsername().equals("info@baabtra.com")
				&& userBean.getPassword().equals("thisistrue")) {
			return "success";
		} else {
			//addActionError(getText("error.login"));
                        //a function from ActionSupport, to get properties values from properties file
                        //we will explore this below.
			return "error";
		}*/
		String email=userBean.getEmail();
		String password=userBean.getPassword();
		
	/*	String url="jdbc:mysql://localhost:3306/";
		String dbname="mysql";
		String driver ="com.mysql.jdbc.Driver";
		String dbusername="root";
		String dbpassword="root";
		Connection con;*/
		try {
			//Class.forName(driver).newInstance();
			//con=DriverManager.getConnection(url+dbname,dbusername,dbpassword);
             
			
			/*User obj=new User();
			obj.setEmail(email);
			obj.setPassword(password);*/
		    
			
			System.out.println(email);
			System.out.println(password);
		
			Statement objStatement=dbcon.con.createStatement();
			
		System.out.println("hi");
			
			String queryString="select * from  tbl_fb where vchr_email='"+email+"' || vchr_pswd='"+password+"'";
			System.out.println("hi");
			ResultSet rs =objStatement.executeQuery(queryString);
			
			if(!rs.next())
			{
				ResponseCode="404";
				
			}
			
			else {
			rs.beforeFirst();
			while(rs.next())
			{
				String dbemail=rs.getString("vchr_email");
				String dbpswd=rs.getString("vchr_pswd");
				String firstname=rs.getString("vchr_firstname");
				String lastname=rs.getString("vchr_surname");
				
				Signupbean user=new Signupbean();  
				   user.setFirstname(firstname);  
				   user.setLastname( lastname);  
						
						System.out.println(dbemail);
				System.out.println(dbpswd);
			 
			if(dbemail.equals(email)&& dbpswd.equals(password))	 
			{
				 ResponseCode="200";
				
				 
			}
				
				
				
				else if(dbemail.equals(email)&& !(dbpswd.equals(password)))
				{
					ResponseCode="500";
				}
				
				else if(dbpswd.equals(password)&&!(dbemail.equals(email)))
				{
					ResponseCode="404";
					
				}
			}
		}
			
			
			rs.close();
		} 
		
		catch (Exception e)
		{
		System.out.println(e);
		
		}

		
		System.out.println(ResponseCode);
		 return ResponseCode;
	}
	
	
	public User getUserBean() {
        return userBean;
    }
 
    public void setUserBean(User userBean) {
        this.userBean = userBean;
    }
}

