package com.text;

public class Emplo extends Insurance {
	
	public int int_a;
	
	Emplo(int int_innum,int int_totemi,int int_insamt){
		this.int_innum=int_innum;
		this.int_totemi=int_totemi;
		this.int_insamt=int_insamt;
		
	}
	public void registerinsurance()
	{
		
		System.out.println("Register number:" );
		
	}

	
	public int payemi(){
		
		return (5*int_insamt/100);
			
		
	}

	public int claiminsurance()
	{
		
		
		if(int_totemi==int_insamt)
		{
			int_a=int_insamt;
			return (int_a);
		}
		
		else
			return int_totemi;
	}

	
	public static void main (String args[])
	{
	
		Insurance em=new Emplo(5000,2000,3000);
		em.registerinsurance();
		System.out.println("Emi payed:"+em.payemi());
		System.out.println("Insurance claim:"+ em.claiminsurance());
	}
		
	}

