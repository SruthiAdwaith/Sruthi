package com.text;
import com.opensymphony.xwork2.ActionSupport;


public class Fb extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String word;
	
	public String authenticate() {
		 
		
		if (this.getUsername().equals("info@baabtra.com")
				&& this.getPassword().equals("thisistrue")) {
			return "success";
		} else {
			//addActionError(getText("error.login"));
                        //a function from ActionSupport, to get properties values from properties file
                        //we will explore this below.
			return "error";
		}
	}
	public String getUsername() {
		
		 setUsername(username);
		 return this.username;
		
	}
 
	public void setUsername(String username) {
		this.username = username;
		
	}
 
	
	public String getPassword() 
	{    
		return password;
	}
 
	public void setPassword(String password) {
		this.password = password;
	}

}
