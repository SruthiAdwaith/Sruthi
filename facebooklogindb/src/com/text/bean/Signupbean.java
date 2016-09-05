package com.text.bean;

public class Signupbean {
	String str_fname;
	String str_lname;
	String str_emaile;
	String str_npsw;
	int int_day;
	int int_month;
	int  int_year;
	String str_gen;
	public void setFirstname(String str_username)
	{
		str_fname=str_username;	
	}
	public String getFirstname()
	{
		return this.str_fname;
	}
	
	public void setLastname(String str_name)
	{
		str_lname=str_name;
	}
	public String getLastname()
	{
		return this.str_lname;
	}
	
	public void setEmaile(String str_email)
	{
		str_emaile=str_email;
	}
	public String getEmaile()
	{
		return this.str_emaile;
	}
	

	public void setNewpsw(String str_psw)
	{
		str_npsw=str_psw;
	}
	public String getNewpsw()
	{
		return this.str_npsw;
	}
	
	public void setDay(int int_dy)
	{
		int_day=int_dy;
	}
	public int getDay()
	{
		return this.int_day;
	}
	
	public void setMonth(int int_mon)
	{
		int_month=int_mon;
	}
	public int getMonth()
	{
		return this.int_month;
	}
	
	public void setYear(int int_yr)
	{
		int_year=int_yr;
	}
	public int getYear()
	{
		return this.int_year;
	}
	
	
	public void setGender(String str_ge)
	{
		str_gen=str_ge;
	}
	public String getGender()
	{
		return this.str_gen;
	}
	
}
