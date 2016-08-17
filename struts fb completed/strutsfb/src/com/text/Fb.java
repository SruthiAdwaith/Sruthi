package com.text;
import com.opensymphony.xwork2.ActionSupport;


public class Fb extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private User userBean;
	
	public String execute() {
       
		if (userBean.getUsername().equals("info@baabtra.com")
				&& userBean.getPassword().equals("thisistrue")) {
			return "success";
		} else {
			//addActionError(getText("error.login"));
                        //a function from ActionSupport, to get properties values from properties file
                        //we will explore this below.
			return "error";
		}
	}
	
	
	public User getUserBean() {
        return userBean;
    }
 
    public void setUserBean(User userBean) {
        this.userBean = userBean;
    }
}

