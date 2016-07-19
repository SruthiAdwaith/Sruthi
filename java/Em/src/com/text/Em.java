package com.text;

public class Em {
	private int int_eid;
	private String  str_n;
	private String  str_na;
	private int int_n;
	
	
	private void getint_eid()
	{
	     int int_eid= setint_n(int_n );
	    
	    System.out.println("Employee id:"  + int_eid);
	}
	private int setint_n(int int_n)
	{
		this.int_n=int_n;
		return (int_n);
			}
	
	
	
	private   String  getstr_n()
	{
	     String str_na= setstr_n(str_n);
	    
	    System.out.println("Empoyee Name:" + str_na);
	    return str_na;
	}
	private String setstr_n(String str_n)
	{
		this.str_n=str_n;
		return (str_n);
			}
	
	



public static void main(String[] arg)
{
	Em dd= new Em();
	dd.setint_n(4);
	dd.setstr_n("Tim");
	dd.getint_eid();
	dd.getstr_n();
	 
	 System.out.println("\n");
	
	Em ds= new Em();
	ds.setint_n(9);
	ds.setstr_n("Tom");
	 ds.getint_eid();
	 ds.getstr_n();
	 System.out.println("\n");
	 
	 Em dm= new Em();
		dm.setint_n(8);
		dm.setstr_n("Tomy");
		dm.getint_eid();
		 dm.getstr_n();
	
		 System.out.println("\n");
	}

}


