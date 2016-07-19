package com.text;

public class Empl {
	private int int_eid;
	private int int_age;
	private String str_name;
	private String str_dep;
	private int int_inc;
	private  int int_we;
	
	Empl(int int_eid,String str_name,String str_dep,int int_age,int int_we, int int_inc)
	{  
		this.int_eid=int_eid;
		this.str_name=str_name;
		this.int_age=int_age;
		this.str_dep=str_dep;
		
		System.out.println("Employee id:"+ int_eid );
		System.out.println("Name:" + str_name);
		System.out.println("Age:" + int_age);
		System.out.println("Department:" + str_dep);
		System.out.println("Work Experience:" + int_we);
		System.out.println("Monthly Income:" + int_inc);
		System.out.println("\n");
		
	}
	
	public static void main(String arg[])
	{
		Empl sh=new Empl(1,"Christy","A",25,2,30000);
		Empl sr=new Empl(2,"Tom","A",35,4,45000);
		Empl ss=new Empl(3,"Hari","C",40,5,50000);
		
	}
}
