package com.text;

public class Emplo {

	
	public static String  str_n;
	
	protected static int int_bsalary;
	
	  Emplo(String str_n,int int_bsalary)
	{
		
		this.str_n=str_n;
		this.int_bsalary=int_bsalary;
		
	}


int csalary(int int_s,int int_a)
{
	return(int_bsalary-(int_s+int_a));
	}

int csalary(int int_o)
{
	return (int_bsalary-int_o);
	}


}



