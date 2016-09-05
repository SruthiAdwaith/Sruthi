<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="jdk.nashorn.internal.ir.RuntimeNode.Request"%>
    <%@page import="com.text.bean.Loginbean"%>
    <%@page import="com.text.bean.Signupbean"%>
<%@page import="com.text.service.Service"%>
    <%@ page import="java.util.*" %>
    <%@ page import="java.util.Date" %>
    <%@page import ="java.sql.*" %>
    <%@ page import ="java.io.*" %>
     <%@ page import ="java.text.SimpleDateFormat"%>
     <%@ page import ="java.text.ParseException"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String url="jdbc:mysql://localhost:3306/";
String dbname="mysql";
String driver ="com.mysql.jdbc.Driver";
String dbusername="root";
String dbpassword="root";
Connection con;
try {
	Class.forName(driver).newInstance();
	con=DriverManager.getConnection(url+dbname,dbusername,dbpassword);
	System.out.println(con);
 
 String fname=request.getParameter("fname");
	String lname=request.getParameter("lastname");
	String emaile=request.getParameter("emailnum");
	String npwd=request.getParameter("pswd");
	System.out.println("1");
	int sday=Integer.parseInt(request.getParameter("Day"));
	System.out.println("2");
   int smonth=Integer.parseInt(request.getParameter("Month"));
   System.out.println("3");
    int syear=Integer.parseInt(request.getParameter("Year"));
    String dob=syear+"-"+smonth+"-"+sday;
    String gen=request.getParameter("gender");
    

  
   // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
  //surround below line with try catch block as below code throws checked exception
 // Date startDate = sdf.parse(dob);
 // String reportDate = sdf.format(startdate);
		  
   
   Signupbean ob= new Signupbean();
	ob.setFirstname(fname);
	ob.setLastname(lname);
	ob.setEmaile(emaile);
	ob.setNewpsw(npwd);
	ob.setDay(sday);
	ob.setMonth(smonth);
	ob.setYear(syear);
	ob.setGender(gen);
	System.out.println("hi");
	
		 Statement objStatement=con.createStatement();
	
	String query="insert into tb_signup(vchr_fname,vchr_lname,vchr_emaile,vchr_npsw,dt_dob,vchr_gender)values('"+fname+"','"+lname+"','"+emaile+"','"+npwd+"','"+dob+"','"+gen+"')";
	objStatement.executeUpdate(query);
	System.out.println("hi");
	
} catch (Exception e)
{
System.out.println(e);
}
    %>
</body>
</html>