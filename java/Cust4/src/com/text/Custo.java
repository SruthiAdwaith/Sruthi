package com.text;

public class Custo {
	private int int_eid;
	private String  str_n;
	private String  str_na;
	private int int_n;
	
	
	private void getint_eid()
	{
	     int int_eid= setint_n(int_n );
	    
	    System.out.println("Customer id:"  + int_eid);
	}
	private int setint_n(int int_n)
	{
		this.int_n=int_n;
		return (int_n);
			}
	
	
	
	private   String  getstr_n()
	{
	     String str_na= setstr_n(str_n);
	    
	    System.out.println("Customer Name:" + str_na);
	    System.out.println("\n");
	    return str_na;
	}
	private String setstr_n(String str_n)
	{
		this.str_n=str_n;
		return (str_n);
			}
	
	



public static void main(String[] arg)
{
	Custo dd= new Custo();
	dd.setint_n(4);
	dd.setstr_n("Tim");
	dd.getint_eid();
	dd.getstr_n();
	 
	 
	Custo ds= new Custo();
	ds.setint_n(9);
	ds.setstr_n("Tom");
	 ds.getint_eid();
	 ds.getstr_n();
	 
	 
	 Custo dm= new Custo();
		dm.setint_n(8);
		dm.setstr_n("Tomy");
		dm.getint_eid();
		 dm.getstr_n();
		
	 Custo dh= new Custo();
			dh.setint_n(77);
			dh.setstr_n("Achu");
			dh.getint_eid();
			 dh.getstr_n();
	
		
	}

}


