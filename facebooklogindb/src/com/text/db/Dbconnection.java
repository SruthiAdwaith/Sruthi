package com.text.db;


	import java.sql.Connection;
	import java.sql.DriverManager;

	public class Dbconnection {
		public Connection con;
		public  Dbconnection()
		{
			String url="jdbc:mysql://localhost:3306/";
			String dbname="mysql";
			String driver ="com.mysql.jdbc.Driver";
			String dbusername="root";
			String dbpassword="root";
			try {
				Class.forName(driver).newInstance();
				con=DriverManager.getConnection(url+dbname,dbusername,dbpassword);
			System.out.println("connected to database:"+dbname);
			} catch (Exception e)
			{
			System.out.println(e);
			}

		}
		/*public static void main(String arg[])
		{
			Dbconnection obj = new Dbconnection();
			
		}*/

	
	

}
