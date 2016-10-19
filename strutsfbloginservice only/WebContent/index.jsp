<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
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

#height{
margin-left:6px;
  margin-right:4px;
  height:40px;
  width:200px;
  
  

}
.green_btn  {
    background: green;
}

#search {
    width: 12em;  height: 3em;
}
</STYLE>
  
</head>
<body>

<div class="container-fluid">

<div class="row" >

<nav  class="navbar navbar-default " STYLE="BACKGROUND: #3b5998">
<div class="container-fluid">

    <div class="col-md-7 navbar-header"  STYLE="BACKGROUND: #3b5998 ">
      <center><B><font   size="8" color="white" face="Lucida Grande">facebook</font></B></center>   
    </div>
    
    
    
    
    
    <div id="box">
    
    <s:form action="hello" id="log">
    
     
      
     <div class="col-md-2" style="margin-top:8px">
    <s:textfield name="userBean.email" size="25" />
    </div>
       
        
     
     <div class="col-md-2 form-group " style="margin-top:8px">
   <s:password name="userBean.password" value="" size="25" /><br>
      <a href="https://www.facebook.com/recover/initiate?lwv=110"> <font color="white">Forgotten Account?</font></a>       
        </div>
        
  
  
 
 
  
     <div class=" col-md-1 " style="margin-top:8px">  
       <s:submit value="log in" id="avail"    />
  </div> 
     
      

    
    
    </s:form>
    </div>
  </div>
</nav>


</div>


<div class="row " id="marginRow"style="margin-left:0px;margin-top:-20px ">

<div class="col-md-7 " STYLE="BACKGROUND:#f7f7f7">
     
      <img src="sa.jpg" alt="sd" class="img-responsive"class="img-rounded" style="width:660px;height:580px">          
</div>



<div class="col-md-5" STYLE="BACKGROUND:#f7f7f7" >
<br>
<br>
<B><font size=6>Sign Up<br></font></B>
<h4>It's free and always will be.</h4><br>

<br>

<form role="form">


  <div class="form-group form-inline " >
  
  
<input class="  form-control " id="height" type="text" name="fname"  placeholder="First Name" >     

<input  class="  form-control "id="height" type="text" name="lastname" s placeholder="SurName"><br>
</div>


 
 <div class="form-group">
 <input class="form-control input-lg" id="inputlg" type="text" style="width:450px" name="emailnum"  placeholder="Re-enter Mobile number or e-mail address">
</div>

<div class="form-group"><input class="form-control input-lg"  style="width:450px" id="inputlg" type="password" name="pswd"  placeholder="New Password">
</div>


<font size="4">Birthday:</font><br><br>

 <select name="Day" form="fb">
  <option value="Day">Day</option>
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
  <option value="6">6</option>
  <option value="7">7</option>
  <option value="8">8</option>
  <option value="9">9</option>
  <option value="10">10</option>
  <option value="11">11</option>
  <option value="12">12</option>
  <option value="13">13</option>
  <option value="14">14</option>
  <option value="15">15</option>
  <option value="16">16</option>
  <option value="17">17</option>
  <option value="18">18</option>
  <option value="19">19</option>
  <option value="20">20</option>
  <option value="21">21</option>
  <option value="22">22</option>
  <option value="23">23</option>
  <option value="24">24</option>
  <option value="25">25</option>
  <option value="26">26</option>
  <option value="27">27</option>
  <option value="28">28</option>
  <option value="29">29</option>
  <option value="30">30</option>
  <option value="31">31</option>
  
</select>


 <select style="margin-left:20px;"name="Day" >
  <option value="Day">Month</option>
  <option value="jan">January</option>
  <option value="feb">February</option>
  <option value="mar">March</option>
  <option value="apr">April</option>
  <option value="may">May</option>
  <option value="june">June</option>
  <option value="jul">July</option>
  <option value="aug">August</option>
  <option value="sep">September</option>
  <option value="0ct">October</option>
  <option value="nov">November</option>
  <option value="dec">December</option>
  
</select>

<select style="margin-left:20px;"name="Year" form="fb">
  <option value="Year">Year</option>
  <option value="1">2016</option>
  <option value="2">2015</option>
  <option value="3">2014</option>
  <option value="4">2013</option>
  <option value="1">2012</option>
  <option value="2">2011</option>
  <option value="3">2010</option>
  <option value="4">2009</option>
  <option value="1">2008</option>
  <option value="2">2007</option>
  <option value="3">2006</option>
  <option value="4">2005</option>
  <option value="1">2004</option>
  <option value="2">2003</option>
  <option value="3">2002</option>
  <option value="4">2001</option>
  <option value="1">2000</option>
  <option value="2">1999</option>
  <option value="3">1998</option>
  <option value="4">1997</option>
  <option value="1">1996</option>
  <option value="2">1995</option>
  <option value="3">1994</option>
  <option value="4">1993</option>
  <option value="1">1992</option>
  <option value="2">1991</option>
  <option value="3">1990</option>
  <option value="4">1989</option>
  <option value="1">1988</option>
  <option value="2">1987</option>
  
</select>
 <br><br>
 <div class="form-group">
 
 <input type="radio" name="gender" value="male" > Male
  <input type="radio" name="gender" value="female"> Female
  <br><br>
</div>

<div class="form-group">
<br><button class=" btn btn-primary green_btn" type="submit" id="search"><font size=3>Sign Up</font></button>
<br>
</div>

</form>
</div>


</div>

</div>





</body>
</html>