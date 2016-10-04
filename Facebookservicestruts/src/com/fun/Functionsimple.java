package com.fun;
import com.db.Dbconnection;
public class Functionsimple {
	
	Dbconnection db=new Dbconnection();
	int response= db.getSearchUserProfile() ;
	{
	if (response==0)
	{
		System.out.println(response);
	}
		
	else
	{
		System.out.println(response);
	}
	
	}
	}
			

