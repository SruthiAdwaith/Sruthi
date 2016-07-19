package com.text;

public class Emplo {
	private int int_eid;
	private String  str_n;
	
	
	private int getint_eid()
	{
	     int int_eid= setint_n();
	    return int_eid;
	}
	private int setint_n()
	{
		int int_n= 2;
		return (int_n);
			}
	
	
	
	private String getstr_n()
	{
	     String str_n= setstr_n();
	    return str_n;
	}
	private String setstr_n()
	{
		String str_n="Tom";
		return (str_n);
			}
	



public static void main(String[] arg)
{
	Emplo dd= new Emplo();
	int 	tod= dd.getint_eid();
	String stri=dd.getstr_n();
	 System.out.println("Employee id:"  + tod);
	 System.out.println("Empoyee Name:" + stri);
	}

}