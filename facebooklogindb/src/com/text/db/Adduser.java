package com.text.db;


	
	import java.sql.Statement;
	import java.sql.Connection;

	import com.text.bean.Loginbean;

	public class Adduser {
		
		Dbconnection dbcon=new Dbconnection();
		Connection con=dbcon.con;
		public String RegisterDb(Loginbean user){
			
			//retrieving information from employee bean
			
			 String email=user.getEmail();
			 String pwd=user.getPassword();
			 
			 
			 
			 try
			 {	//Connection con=dbcon.con;
				Statement objStatement=con.createStatement();
				
				String queryString="insert into login(vchr_email,vchr_empname,vchr_psw) values('"+email+"','"+pwd+"')";
				objStatement.executeUpdate(queryString);
				
			 }
			 catch(Exception e){
				 System.out.println(e);
					e.printStackTrace();
			 }
			 
			
			return null;
			
		}


	
}
