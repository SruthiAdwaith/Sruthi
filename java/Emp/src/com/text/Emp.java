package com.text;

public class Emp {
	private int int_eid;
	private String  String_sn;
	
	Emp(int int_eid,String str_n)
	{
		this.int_eid=int_eid;
		this.String_sn=str_n;
		System.out.println("Employee id:" + int_eid +
			"| Employee Name:" +String_sn  );
		
	}
	
	
	public static void main(String arg[])
	{
		Emp em= new Emp(123,"Tom");
		
	}

}
