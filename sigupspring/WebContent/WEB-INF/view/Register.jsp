<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<script src="js/imp.js"></script>
<link rel="stylesheet" href="style/sty.css">

<title>Login to Facebook</title>
<link rel="icon" 
  type="image/icon" 
  href="fb.ico">
  
  
  
  
  
  <STYLE>
  .thumbnail{
border: 0px;
box-shadow: none;
border-radius:0px;
background-color: #f7f7f7;
}

.height{
margin-left:6px;
  margin-right:4px;
  height:40px;
  width:250px;
  
 

}
 #marginRow{
   margin-bottom:0px ;
   margin-top:0px ; 
   position: relative;
   top: -20px;
   }
.green_btn  {
    background: green;
}
.month{
margin-left:20px;

}
.ema
{width:450px}
.year
{margin-left:20px;}

#search {
    width: 12em;  height: 3em;
    
}

.label
{width:20px;}


$("#First").attr('placeholder', 'First Name')
$("#SurName").attr('placeholder', 'SurName')
$("#reenter").attr('placeholder', 'Re-enter Mobile number or e-mail address')
$("#nepas").attr('placeholder', 'New Password')

</STYLE>
  
</head>
<body>

<div class="container-fluid">

<%-- <div class="row" >

<div  class="navbar navbar-default " STYLE="BACKGROUND: #3b5998">
<div class="container-fluid">

    <div class="col-md-7 navbar-header"  STYLE="BACKGROUND: #3b5998 ">
      <center><B><font   size="8" color="white" face="Lucida Grande">facebook</font></B></center>   
    </div>
    
    
    
    
    
    <div id="box">
    
    <form:form action="hello" id="log">
    
     
      
     <div class="col-md-2" style="margin-top:8px">
 <form:label path="email"> <font  color="white">E-mail or Phone: </font>   </form:label> <br> 
    <form:input path="email" name="email" size="25" />
    </div>
       
        
     
     <div class="col-md-2 form-group " style="margin-top:8px">
     <form:label path="password"><font color="white">Password:</font></form:label><br>
   <form:input path="password" name="password" value="" size="25" /><br>
      <a href="https://www.facebook.com/recover/initiate?lwv=110"> <font color="white">Forgotten Account?</font></a>       
        </div>
        
  
  
 
 
  
     <div class=" col-md-1 " style="margin-top:8px">  
     <br>
       <input type="submit" value="log in" id="avail" class="btn btn-primary"    />
  </div> 
     
      

    
    
    </form:form>
    </div>
  </div>
</div>


</div> 
 --%>

<div class="row " id="marginRow" >

<div class="col-md-7 " STYLE="BACKGROUND:#f7f7f7;height:580px;margin-left:0px">
     
      <img src="bb.png" alt="sd" class="img-responsive"class="img-rounded" style="width:560px;height:380px;margin-left:0px">          
</div>



<div class="col-md-5" STYLE="BACKGROUND:#f7f7f7;height:560px" >
<br>
<br>
<B><font size=6>Sign Up<br></font></B>
<h4>It's free and always will be.</h4><br>


<c:url var="userRegistration" value="saveUser.html"/>
<form:form  action="${userRegistration}" method="post" enctype="multipart/form-data" commandName="signup">


  <div class="form-group form-inline " > 
  <form:input class="form-control height"  placeholder="First Name" name="firstname"  id="First"  path="firstname"/>
 
 <form:input class="form-control height"  placeholder="Surname" name="lastname"  id="SurName" path="surname"/>

</div>


 
 <div class="form-group">
 
 <form:input class="form-control input-lg ema"  placeholder="enter your email id" path="emailid" name="emailid"  />
<br>
<form:input cssClass="form-control input-lg ema" type="password" path="passwordi" placeholder="enter your password"  name="passwordi"  />
</div>

<form:input type="file" path="fileUpload" name="fileUpload"  label="Select a File to upload" size="40"  /><br>
   <%---  <s:submit cssClass="btn btn-success"/> --%>

<br>
<font size="4">Birthday:</font><br><br>

<form:select path="day" items="${model.day}"></form:select>

<form:select path="month" class="month" items="${model.month}"></form:select>
<form:select path="year" class="year" items="${model.year}"></form:select>


 <br><br>
 <div class="form-group">
 
 <form:label path="gender">Gender</form:label>
 <form:radiobuttons path="gender" items="${model.gender}"/>
  <br><br>

<br><input type="submit" class=" btn btn-success"  id="search" value="Sign Up" />
<br>
</div>

</form:form>
</div>


</div>

</div>





</body>
</html>