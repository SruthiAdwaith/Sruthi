package com.text;

public class Empl extends Emplo
{
		Empl(String str_n, int int_bsalary)
		{
			super(str_n,int_bsalary);
		}
		
	
	public static void main (String arg[])
	{
		
		Empl em= new Empl("Tim", 45000);
		
		
		
		System.out.println( str_n + ":" + em.csalary(1000));
		
		Emplo sh= new Emplo("yoke", 50000);
		
		System.out.println(str_n + ":" + sh.csalary(1000,4000));
	}

}
