<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String email=request.getParameter("email");
String psw=request.getParameter("pwd");


if (email.equals("info@baabtra.com")&& psw.equals("thisistrue"))

{
	response.sendRedirect("success.jsp");

}   


else if (email.equals("info@baabtra.com")&& !psw.equals("thisistrue") )

{
	response.sendRedirect("psw.jsp");

}
else 
{
	response.sendRedirect("Check.jsp");

}

%>


</body>
</html>