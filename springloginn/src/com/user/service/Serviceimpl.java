package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dao.*;
@Service("loginService")
public class Serviceimpl implements LoginService{
	
	 @Autowired
	 private LoginDAO loginDAO;

	   public void setLoginDAO(LoginDAO loginDAO) {
              this.loginDAO = loginDAO;
       }
      
       public boolean checkLogin(String email, String password){
              System.out.println("In Service class...Check Login");
              return loginDAO.checkLogin(email,password);
       }	

}
