package com.user.dao;
import com.user.model.*;
public interface LoginDAO {
	
	public boolean checkLogin(String email, String password);

}
