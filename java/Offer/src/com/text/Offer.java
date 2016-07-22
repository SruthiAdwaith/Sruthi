package com.text;

public class Offer {
	
	public int int_a;
	public int int_b;
	
	
	public static void main (String arg[])
	{
		
		Pemp em= new Pemp();
		
		System.out.println("Permenant Employee");
		System.out.println("Season Offer:"+ em.seasonaloffer(2500));
		System.out.println("Regular Offer:"+em.regularoffer(2500));
		System.out.println("\n");
		
		Cust cs=new Cust();
		System.out.println("Customer");
		System.out.println("Season Offer:"+ cs.seasonaloffer(2500));
		System.out.println("Regular Offer:"+cs.regularoffer(2500));
		System.out.println("\n");
		
		Contra co=new Contra();
		System.out.println("Contract Employee");
		System.out.println("Season Offer:"+ co.seasonaloffer(2500));
		System.out.println("Regular Offer:"+co.regularoffer(2500));
		System.out.println("\n");
		
	}	
	

}
