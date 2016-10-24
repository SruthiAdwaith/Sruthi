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


$("#First").attr('placeholder', 'First Name')
$("#SurName").attr('placeholder', 'SurName')
$("#reenter").attr('placeholder', 'Re-enter Mobile number or e-mail address')
$("#nepas").attr('placeholder', 'New Password')

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
     <label for="email"> <font  color="white">E-mail or Phone: </font>   </label><br>
    <s:textfield name="userBean.email" size="25" />
    </div>
       
        
     
     <div class="col-md-2 form-group " style="margin-top:8px">
     <label for="pwd"><font color="white">Password:</font></label><br>
   <s:password name="userBean.password" value="" size="25" /><br>
      <a href="https://www.facebook.com/recover/initiate?lwv=110"> <font color="white">Forgotten Account?</font></a>       
        </div>
        
  
  
 
 
  
     <div class=" col-md-1 " style="margin-top:8px">  
     <br>
       <s:submit value="log in" id="avail" cssClass="btn btn-primary"    />
  </div> 
     
      

    
    
    </s:form>
    </div>
  </div>
</nav>


</div>


<div class="row " id="marginRow" >

<div class="col-md-7 " STYLE="BACKGROUND:#f7f7f7;height:580px;margin-left:0px">
     
      <img src="bb.png" alt="sd" class="img-responsive"class="img-rounded" style="width:560px;height:380px;margin-left:0px">          
</div>



<div class="col-md-5" STYLE="BACKGROUND:#f7f7f7;height:560px" >
<br>
<br>
<B><font size=6>Sign Up<br></font></B>
<h4>It's free and always will be.</h4><br>



<s:form  action="signup">


  <div class="form-group form-inline " > 
  
<s:textfield cssClass="form-control height"  name="firstname"  id="First"/>

<s:textfield cssClass="form-control height"  name="lastname"  id="SurName"/> <br>
  
</div>


 
 <div class="form-group">
 <s:textfield cssClass="form-control input-lg ema"    name="emailid"  id="reenter"/>
<br>
<s:textfield cssClass="form-control input-lg ema"     name="passwordi"  id="nepas"/>
</div>


<font size="4">Birthday:</font><br><br>

 <s:select name="Day" 
 list="#{'Day':'Day', '1':'1', '2':'2', '3':'3','4':'4','5':'5','6':'6','7':'7','8':'8'}"
/>


 <s:select cssClass="month" name="Month"   
  list="#{'Month':'Month', '01':'Jan', '02': 'Feb', '03' : 'March','04' : 'April','05' : 'May','06' : 'June','07' : 'July','08' : 'August'}"
  />

<s:select cssClass="year" name="Year" 
  list="#{'Year':'Year', '1999':'1999','1998':'1998','1997':'1997','1996':'1996','1995':'1995','1994':'1994','1993':'1993','1992':'1992','1991':'1991','1990':'1990'}"
/>
 <br><br>
 <div class="form-group">
 
 <s:radio label="Gender" name="gender" list="{'male','female'}" />
  <br><br>

<br><s:submit cssClass=" btn btn-success"  id="search" value="Sign Up"/>
<br>
</div>

</s:form>
</div>


</div>

</div>





</body>
</html>