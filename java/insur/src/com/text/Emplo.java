package com.text;

public class Emplo extends Insurance {
	
	public int int_a;
	public int int_b;
	public int int_c;
	
	Emplo(String str_innum,int int_totemi,int int_insamt){
		this.str_innum=str_innum;
		this.int_totemi=int_totemi;
		this.int_insamt=int_insamt;
		
	}
	public void registerinsurance()
	{
		
		System.out.println("Register number:INS_"+str_innum+33 );
		System.out.println("Insurace amount:"+int_insamt );
		
	}

	
	public int payemi(){
		
		
		int_c=	5*int_insamt/100;
		int_totemi=int_totemi+int_c;
		return (5*int_insamt/100);
		
	}
	
public int payemic(){
		
		
		int_b=8*int_insamt/100;
		int_totemi=int_totemi+int_b;
		return (8*int_insamt/100);	
		
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
	
		Insurance em=new Emplo("PM25",200,5000);
		em.registerinsurance();
		System.out.println("Emi payed:"+em.payemi());
		System.out.println("Insurance claim:"+ em.claiminsurance());
		System.out.println("\n");
		
		
		Insurance cm=new Emplo("CE25",200,3000);
		cm.registerinsurance();
		System.out.println("Emi payed:"+cm.payemic());
		System.out.println("Insurance claim:"+ cm.claiminsurance());
		
	}
		
	}

