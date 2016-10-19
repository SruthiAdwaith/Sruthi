package com.fun;
import com.db.Dbconnection;
public class Functionsimple {
	
	
	public String execute()
	{
		Dbconnection dbs=new Dbconnection();
	int response= dbs.getSearchUserProfile() ;
	
	
		
	
	if (response==0)
	{
		return("error");
	}
		
	else
	{
		return("success");
	}
	
	}
	}
		

