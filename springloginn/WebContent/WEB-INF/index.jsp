<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:url var="userLogin" value="login.html"/>
<form:form method="POST" modelAttribute="loginForm" id="redirect" action="${userRegistration}">

    <form:label path="email">Email</form:label>
    <td><form:input  path="email"/></td><br/>
   <form:label path="password">Password</form:label>
   <<form:input  path="password"/>
     <input  type="submit" value="Log In" />

</form:form>

</body>
</html>