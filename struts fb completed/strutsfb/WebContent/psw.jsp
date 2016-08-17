<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<title>Login to Facebook</title>
<link rel="icon" 
  type="image/icon" 
  href="fb.ico">


<STYLE>

.green_btn  {
     background-color: #4CAF50; 
    border: none;
    color: white;
    
    text-align: center-block;
   
    text-decoration: none;
    display: inline-block;
    font-size: 13px;
}

.col-md-6 {
    float:none;
    display:inline-block;
    vertical-align:middle;
    margin-right:4px;
    margin-top:90px;
    background:white;
}

</STYLE>







</head>




<body>


<div class="container-fluid">
<div class="row" >

<nav  class="navbar navbar-default " STYLE="BACKGROUND: #3b5998">
<div class="container-fluid">

    <div class="col-md-7" STYLE="margin-left:150px"class="navbar-header"  STYLE="BACKGROUND: #3b5998;height:90px ">
      <B><font   size="8" color="white" face="Lucida Grande">facebook</font></B>  
      
       
     
      <input type="button" STYLE="height:25px; width:80px;margin-left:30px" class="form-group green_btn" id="ad" class="form-inline" class="form-group"class="btn btn-primary" value="Sign Up"> 
    
    
    </div>
  
  
  </div>
</nav>
  
  
  <div class="row -container" STYLE="BACKGROUND:#dfe3ee ;margin-left:0px;margin-top:0px;height:500px">



<center>
<div class="col-md-6 " STYLE="BACKGROUND:white; width:500px" >



<br>
<font size=4 face="Lucida Grande"> Log in to Facebook </font>
<br><br>

<form>
  <div class="form-group" >
  
 
 
 <center> <img src="" alt="s" class="img-responsive"class="img-rounded" style="width:75px;height:90px"></center>
 <br>          
 
<%= request.getParameter("email")%>

</div>
<br>
<div class="form-group"><input class="form-control input-lg" STYLE="height:25px; width:270px" id="inputlg" type="password" name="pswd"   placeholder=" Password" >
<div class='validation' style='color:red;margin-bottom: 20px;'>	Password is incorrect</div>
</div>


    
    <br>
  <div class="form-inline"  >
        <div class="form-group">
     
       <input type="button"  STYLE="height:40px; width:270px;Background: #3b5998;color:white"class="btn btn-primary" value="log in">
  
  
  </div>
    </div>
    
    
      <br>
      <a STYLE="margin-left:20px" href="https://www.facebook.com/recover/initiate?lwv=110"> Forgotten Account?</a>
      <a STYLE="margin-left:20px" href="new.jsp"> Sign up for facebook account</a>
    
</form>
  <br>
  
  
  
  </div>
  </center>
  </div>
     





</div>
</div>






</body>
</html>