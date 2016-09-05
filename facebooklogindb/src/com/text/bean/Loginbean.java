package com.text.bean;

public class Loginbean {
	
		String str_email;
		String str_paswd;
		public void setEmail(String str_username)
		{
			str_email=str_username;	
		}
		public String getEmail()
		{
			return this.str_email;
		}
		public void setPassword(String str_password)
		{
			str_paswd=str_password;
		}
		public String getPassword()
		{
			return this.str_paswd;
		}

}
