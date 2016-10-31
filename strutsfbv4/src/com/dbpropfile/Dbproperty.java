package com.dbpropfile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dbproperty {
	public Connection con;
	
	public  Dbproperty(){
	String url="jdbc:mysql://localhost:3306/";
	String dbname="mysql";
	String driver ="com.mysql.jdbc.Driver";
	String dbusername="root";
	String dbpassword="root";

	try {
		Class.forName(driver).newInstance();
		this.con=DriverManager.getConnection(url+dbname,dbusername,dbpassword);
		//Statement objStatement=con.createStatement();
		System.out.println("connected to database:"+dbname);
	} 
	catch (Exception e)
	{
	System.out.println(e);
	e.printStackTrace();
	}

	}
	
}
