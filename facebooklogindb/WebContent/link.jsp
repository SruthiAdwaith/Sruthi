<%@page import="jdk.nashorn.internal.ir.RuntimeNode.Request"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.text.bean.Loginbean"%>
    <%@page import="com.text.bean.Signupbean"%>
<%@page import="com.text.service.Service"%>
    <%@ page import="java.util.*" %>
    <%@page import ="java.sql.*" %>
    <%@ page import ="java.io.*" %>
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

	String email=request.getParameter("email");
	String pwd=request.getParameter("pwd");
	
	
    
	Loginbean obj=new Loginbean();
	obj.setEmail(email);
	obj.setPassword(pwd);
	Statement objStatement=con.createStatement();
	
	
	
	String queryString="insert into login(vchr_email,vchr_psw) values('"+email+"','"+pwd+"')";
	objStatement.executeUpdate(queryString);
	
	
	
	
} catch (Exception e)
{
System.out.println(e);
}

//Service serv=new Service();


%>


</body>
</html>