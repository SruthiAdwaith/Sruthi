 package com.text;

public class Permenantemployee extends Custom
{
	
	
	Permenantemployee(String str_n, int int_bsalary)
	{
		super(str_n,int_bsalary);
		
	}
	
	
	private  int int_pcod;
	private static int int_pf;
	private static int  int_grat; 
	private static int int_m;
	private int int_cod;
	
	private int setint_pcod(int int_pcod)
	{
		  
		return(int_pcod);
	}
	
	private void getint_pcod()
	{
		setint_pcod( int_pcod);
		
		
	}
	
	
	private int setint_pf(int int_pf)
	{
		return(int_pf);
	}
	
	private int getint_pf()
	{
		int int_pfu=setint_pf( int_pf);
		return(int_pfu);
	}
	
	
	private int setint_grat(int int_grat)
	{
		
		return(int_grat);
	}
	
	
	private int getint_grat()
	{
		setint_grat( int_grat);
		return(int_grat);
	}
	
	
	static int salary(int int_pf,int int_grat)
	{
		return (int_bsalary-(int_pf+int_grat));
	}



public static void main(String arg[])
{ int int_sal;
	Permenantemployee em= new Permenantemployee("tom",45000);
	int_m=em.setint_pcod(23);
	 em.getint_pcod();
	
	 int  int_e=em.setint_pf(5000);
	   em.getint_pf();
	
	   int int_c=em.setint_grat(5000);
	em.getint_grat();
	
	
	int_sal = salary( int_e, int_c);
	
	System.out.println("Name:"+ str_sn );
	System.out.println("Permenant Code:"+ int_m );
	System.out.println("Salary:"+ int_sal );
	}

}