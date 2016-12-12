package com.beingjavaguys.dao;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.beingjavaguys.domain.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionfactory;

	@SuppressWarnings("unused")
	@Override
	public void saveUser(User user) {
		
		
		 /* String day=user.getDay();
	      String month=user.getMonth();
	      String year=user.getYear();
	      String date=year+"-"+month+"-"+day;
	      System.out.println(month);
	     	 System.out.println(year);

		String destPath = "C:/apache-tomcat-6.0.33/work/";
File destFile =null;
	      try{
	     	 System.out.println("Src File name: " + user.getFileUpload());
	     	 System.out.println("Dst File name: " + user.getFileUploadFileName());
	     	String FileUploadFilename=user.getFileUploadFileName();
	     	 File FileUpload=   user.getFileUpload();
	   
	     	  destFile  = new File(destPath, FileUploadFilename);
	     	
	    	 FileUtils.copyFile(FileUpload, destFile);
	    	 System.out.println(destFile);
	  
	      }catch(IOException e){
	         e.printStackTrace();
	        
	      }
	      */
	     /* String day=user.getDay();
	      String month=user.getMonth();
	      String year=user.getYear();
	      String date=year+"-"+month+"-"+day;
	      System.out.println(month);
	     	 System.out.println(year);*/
	    
		sessionfactory.getCurrentSession().saveOrUpdate(user);
	}

	@Override
	public List<User> getUser() {
		@SuppressWarnings("unchecked")
		List<User> userlist = sessionfactory.getCurrentSession()
				.createCriteria(User.class).list();
		return userlist;
	}

}
