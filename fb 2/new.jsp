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
<title>LOGIN</title>


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


<script>
$(document).ready(function(){
$("#avail").on('click',function(){
	var email=$("#email").val();
	var pwd=$("#pwd").val();
	
  $.ajax({
	type:"post",
	dataType:"json",
	data:{email:email ,password:pwd},
	url:"http://api.baabtra.com/LoginService/login.php",
	success: function(data) {
         
        alert(data[0].ResponseCode); 
        
        console.log(data);
        
	
        if (data[0].ResponseCode == 200) {
            alert('Success');
        }
    
        else if(data[0].ResponseCode==404) 
        {
       
        window.location.href = 'Check.jsp';
        }
        
        else {
        	
        	
        	
        	window.location.href = "psw.jsp?email=" + ema;
        	
        	
        
        }
	},
			
		//console.log(data);
		//alert("Wrong Password");
		//$("#box1").append(data);
		//$("#box").remove();
  	
	
	error:function(){
		alert("did not execute");
	}
	
 

});
});
});
	


</script>



</head> 


<body>

<div class="container-fluid">
<div class="row" >

<nav  class="navbar navbar-default " STYLE="BACKGROUND: #3b5998">
<div class="container-fluid">

    <div class="col-md-7" class="navbar-header"  STYLE="BACKGROUND: #3b5998 ">
      <center><B><font   size="8" color="white" face="Lucida Grande">facebook</font></B></center>   
    </div>
    
    
    <div id="box1">
    <form style="display: hidden" action="psw.jsp" method="POST" id="form">
  <input type="hidden" id="var1" name="var1" value=""/>
  
</form>
    
    
    </div>
    <div id="box">
    
    <form  id="log">
    <ul class="nav navbar-nav">
     
      <li>
      <div class="form-group">
    <label for="email"> <font  color="white">E-mail or Phone: </font>   </label>
    <input type="text" class="form-control" id="email">
    </div>
        </li>
       
        
      <li> 
     <div class="form-group">
    <label for="pwd"><font color="white">Password:</font></label>
    <input type="password" class="form-control" id="pwd">
      <a href="https://www.facebook.com/recover/initiate?lwv=110"> <font color="white">Forgotten Account?</font></a>       
    </div>    
  </li>
  
  <li>
  <br>
  <div class="form-inline"  >
        <div class="form-group">
        <input type="button" id="avail" class="btn btn-primary" value="log in">
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

<form role="form">


  <div class="form-group " >
  
  
<input class="  form-inline " id="height" type="text" name="fname"  placeholder="First Name" >     

<input  class="  form-inline "id="height" type="text" name="lastname" s placeholder="SurName"><br>
</div>


 
 <div class="form-group">
 <input class="form-control input-lg" id="inputlg" type="text" name="emailnum"  placeholder="Re-enter Mobile number or e-mail address">
</div>

<div class="form-group"><input class="form-control input-lg" id="inputlg" type="password" name="pswd"  placeholder="New Password">
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
<br><button class="green_btn" type="submit" id="search" class="btn btn-primary"><font size=3>Sign Up</font></button>
<br>
</div>
</form>
</div>


</div>

</div>

</div>
</body>
</html>