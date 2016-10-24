package com.text;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;
import com.user.User;


public class Fb extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private User userBean;
	String ResponseCode;
	
	public String execute() {
       
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
		
		String url="jdbc:mysql://localhost:3306/";
		String dbname="mysql";
		String driver ="com.mysql.jdbc.Driver";
		String dbusername="root";
		String dbpassword="root";
		Connection con;
		try {
			Class.forName(driver).newInstance();
			con=DriverManager.getConnection(url+dbname,dbusername,dbpassword);

			
			/*User obj=new User();
			obj.setEmail(email);
			obj.setPassword(password);*/
		    
			
			System.out.println(email);
			System.out.println(password);
		
			Statement objStatement=con.createStatement();
			
			
			
			String queryString="select vchr_email,vchr_pswd from  tbl_fb where vchr_email='"+email+"' || vchr_pswd='"+password+"'";
			
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

