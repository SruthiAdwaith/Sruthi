package com.text;

public class Permenantemployee extends Emplo{

	

	Permenantemployee(String str_n,int int_eid, int int_age,String  str_gen,int  int_pn, int int_bsalary)
	{
		super(str_n, int_eid, int_age,  str_gen,  int_pn,int_bsalary);
		
	}

private static String str_pc;

private   String  getstr_n()
{
     String str_na= setstr_pc(str_pc);
    
    return str_na;
}
private String setstr_pc(String str_pc)
{
	this.str_pc=str_pc;
	return (str_pc);
		}


public static void main(String arg[])
{
	

	Permenantemployee em= new Permenantemployee("John",1001,35,"male",98967623,15000);
    String str_na=em.setstr_pc("PM100");
    
    
	System.out.println("Name:"+ str_n );
	System.out.println("Age"+ int_age );
	System.out.println("Emp Code:"+ int_eid);
	System.out.println("Gender:"+ str_gen );
	System.out.println("Phone Number:"+ int_pn );
	
	System.out.println("Salary:"+ int_bsalary );
	System.out.println("Permenant Code:"+ str_na );
	
	
	
}


}