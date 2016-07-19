package com.text;

public class Contractemployee extends Empl{
	
	Contractemployee(String str_n, int int_bsalary)
	{
		super(str_n,int_bsalary);
	}
	
	private static int int_cdur;
	private static int int_f;
	
	
	private int setint_cdur(int int_cdur)
	{
		  
		return(int_cdur);
	}
	
	private int setint_f(int int_f)
	{
		  
		return(int_f);
	}
	
	
	static int csalary(int int_f){
		return(int_bsalary-int_f);
		
	}
	

	
	public static void main(String arg[])
	{ int int_sal;
		Contractemployee em= new Contractemployee("tom",45000);
		int int_m=em.setint_cdur(3);
		 
		
		 int  int_e=em.setint_f(5000);
		   
		
		  
		
		int_sal = csalary( int_e);
		
		System.out.println("Name:"+ str_n );
		System.out.println("Contract Duration:"+ int_m );
		System.out.println("Salary:"+ int_sal );
		}	
	
	
}
