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
         
       
		 var result = JSON.parse(response);
         console.log(result[0].ResponseCode);
        
        
	
       /* if (data[0].ResponseCode == 200) {
        	 window.location.href = 'success.jsp';
        }
    
        else if(data[0].ResponseCode==404) 
        {
       
        window.location.href = 'Check.jsp';
        }
        
        else {
        	
        	
        	var ema=$("#email").val();
        	alert(ema);
        			var url= "psw.jsp?email=" + ema;
        	 window.location.href=url;
        	
        
        }*/
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
	