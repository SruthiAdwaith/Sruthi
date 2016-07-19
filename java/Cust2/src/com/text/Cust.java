package com.text;

public class Cust {
	private int int_eid;
	private int int_age;
	private String str_name;
	private  int int_ne;
	
	Cust(int int_eid,String str_name,int int_age,int int_ne)
	{  
		this.int_eid=int_eid;
		this.str_name=str_name;
		this.int_age=int_age;
		this.int_ne=int_ne;
		
		System.out.println("Customer id:"+ int_eid );
		System.out.println("Name:" + str_name);
		System.out.println("Age:" + int_age);
		
		System.out.println("No. of years:" + int_ne);
		
		System.out.println("\n");
		
	}
	
	public static void main(String arg[])
	{
		Cust sh=new Cust(1,"Christy",25,2);
		Cust sr=new Cust(2,"Tom",35,4);
		Cust ss=new Cust(3,"Hari",40,5);
		
	}
}
