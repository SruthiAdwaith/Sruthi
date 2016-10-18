<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Facebook</title>
<link rel="icon" 
  type="image/icon" 
  href="fb.ico">
  
  <style>
  .navbar-nav > li{
  margin-left:2px;
  margin-right:2px;
}
inner-addon {
  position: relative;
}




/* style glyph */
.inner-addon .glyphicon {
  position: absolute;
  padding: 10px;
  pointer-events: none;
}

/* align glyph */
.left-addon .glyphicon  { left:  0px;}
.right-addon .glyphicon { right: 0px;}

/* add padding  */
.left-addon input  { padding-left:  30px; }
.right-addon input { padding-right: 30px; }



body {
  margin: 10px;
}


.verticalLine {
    border-left: thin solid  #3b5998;
}

</style>
  
  

</head>
<body>




<div class="container-fluid" style="background:#dfe3ee">
<div class="row" >

<nav  class="navbar navbar-default " STYLE="BACKGROUND: #3b5998">
<div class="container-fluid">

    <div class="col-md-6 " STYLE="margin-left:150px;BACKGROUND: #3b5998 ">
     <form class="formSearch form-inline" role="search">
     
     
      
      
     <img src="<%= request.getParameter("uar")%>" width="30" style="margin-top:4px">
        <input type="text" class="form-control form-inline " style="width:400px ;margin-top:7px" placeholder="Search in facebook" id="Searcher">
      
      </form>
      
     </div>
     
  
  <ul class="nav navbar-nav">  
    
    
     
     
   <li>  <img src="" alt="sa" class="img-responsive " style="width:40px;height:30px;margin-top:7px"></li>
      
       
       
       
        
      <li><a href="default.html"><font color="white"><%= request.getParameter("fin")%> <%= request.getParameter("lan")%></font></a></li>
   <li> <a href="rowing.html"><font color="white">Home</font></a></li>
  <li> <a href="school.html"><font color="white">Notification</font></a></li>
 </ul>

   
   
   
  
  </div>
</nav>




</div>





<div class="user-body">
		<div class="container">
			<div class="row">
				<div class="col-md-2 ">
					<div class="row profile">
						
							<img src="ss.jpg" width="50">
						
						
							
								<%= request.getParameter("fin")%><%= request.getParameter("lan")%>
							

					</div>
				</div>

				<div class="col-md-6 news">
					<div class="panel panel-default" >
						<div class="panel-heading " style="background:white">

							
								<a href="#"><b>Photo/Video</b></a>
								<a href="#"class="verticalLine" style="margin-left:1px"><b>Photo Album</b></a>
								
						</div>
						
						<div class="panel-body">
							<div class="row ">
								<div class="col-md-2">
									<img src="" class="img-responsive" width="40">
								</div>
								<div class="col-md-10">
									<textarea rows="4" cols="50" placeholder="Whats on your mind?"
										style="border: medium none; width: 445px; height: 45px;"></textarea>
								</div>

							</div>
							
							<hr>
							
							<div class="row" style="height:20px">
							
						
							<input type="button" id="avail" style="margin-left:440px;margin-bottom:20px; height:25px" class="btn btn-primary" value="Post" >
							
							</div>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-body" style="height:100px"></div>
						
						
						
					</div>
					</div>
					
					
					
				<div class="col-md-3 adds">
					<div class="panel panel-default">
						<div class="panel-body">
						<div>
						</div>
						<hr>
							<div style="margin-top:-20px; "><font color="grey" face="Lucida Grande">TRENDING</font>
							<hr style="margin-top:-2px; ">
							
							<a hef="#">Entertainment</a><br>
							<a hef="#">News</a><br>
							<a hef="#">Politics</a><br>
							<a hef="#">Sportst</a>
							<hr>
							</div>
							
							
							<div style="margin-top:-20px; ">
							     <font color="grey" face="Lucida Grande">PEOPLE YOU MAY KNOW</font> 
							     <a href="#"><font style="margin-left:12px"size="2">See All</font></a>
							     <hr style="margin-top:-2px; ">
							     						
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>



</div>
</body>
</html>