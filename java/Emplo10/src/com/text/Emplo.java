package com.text;

public class Emplo implements Emp {
	
	public int int_a;
	public int int_b;
	
	public void seasonaloffer(int int_a)
	{
	System.out.println("Season Offer:"+int_a);	
	}
	
	public void regularoffer(int int_b)
	{
	System.out.println("Regular Offer:"+int_b);	
	}
	
	
	public static void main(String arg[])
	{
		
		
		Emp ob=new Emplo();
		
		ob.seasonaloffer(1000);
		ob.regularoffer(2000);
		
	}

}
