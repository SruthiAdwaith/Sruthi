package com.text;



public class Contractemployee extends Emplo{

		
		Contractemployee(String str_n,int int_eid, int int_age,String  str_gen,int  int_pn, int int_bsalary)
		{
			super(str_n, int_eid, int_age,  str_gen,  int_pn,int_bsalary);
			
		}



	private static int int_cdur;


	private int setint_cdur(int int_cdur)
	{
		return(int_cdur);
		}


	public static void main(String arg[])
	{
		

		Contractemployee em= new Contractemployee("Mary",1002,24,"female",98967623,10000);
	    int int_ns=em.setint_cdur(6);
	    
	    
		System.out.println("Name:"+ str_n );
		System.out.println("Age"+ int_age );
		System.out.println("Emp Code:"+ int_eid);
		System.out.println("Gender:"+ str_gen );
		System.out.println("Phone Number:"+ int_pn );
		
		System.out.println("Salary:"+ int_bsalary );
		System.out.println("Contract Duration:"+ int_ns );
		
		
		
	}

}
