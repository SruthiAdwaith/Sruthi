package com.text;

public class Cust {
	private int int_eid;
	private String  String_sn;
	
	Cust(int int_eid,String str_n)
	{
		this.int_eid=int_eid;
		this.String_sn=str_n;
		System.out.println("Employee id:" + int_eid +
			"| Employee Name:" +String_sn  );
		
	}
	
	
	public static void main(String arg[])
	{
		Cust em= new Cust(123,"Tom");
		
	}

}
