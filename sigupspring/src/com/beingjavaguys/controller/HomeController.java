package com.beingjavaguys.controller;
import  com.beingjavaguys.domain.Signup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
 
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.beingjavaguys.domain.User;
import com.beingjavaguys.service.UserService;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;

@Controller
public class HomeController {
	 private static final long serialVersionUID = 1L;
	 
	    private static final String UPLOAD_DIRECTORY = "upload";
	    private static final int THRESHOLD_SIZE     = 1024 * 1024 * 3;  // 3MB
	    private static final int MAX_FILE_SIZE      = 1024 * 1024 * 40; // 40MB
	    private static final int MAX_REQUEST_SIZE   = 1024 * 1024 * 50; // 50MB

	@Autowired
	private UserService userService;

	@RequestMapping("/register")
	public ModelAndView getRegisterForm(@ModelAttribute("signup") Signup signup, 
			BindingResult result) {
		ArrayList<String> gender = new ArrayList<String>();
		gender.add("Male");
		gender.add("Female");
		ArrayList<String> day = new ArrayList<String>();
		day.add("Day");
		day.add("2");
		day.add("3");
		day.add("4");
		
		
		ArrayList<String> month = new ArrayList<String>();
		month.add("Month");
		month.add("1");
		month.add("2");
		month.add("3");
		month.add("4");
		
		
		ArrayList<String> year = new ArrayList<String>();
		year.add("Year");
		year.add("1990");
		year.add("1992");
		year.add("1993");
		year.add("1994");
		
		
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("gender", gender);
		model.put("day", day);
		model.put("month", month);
		model.put("year", year);
		
		System.out.println("Register Form");
		return new ModelAndView("Register", "command", model);
	}

	@RequestMapping("/saveUser")
	public ModelAndView saveUserData(@ModelAttribute("user") User user,
			BindingResult result,HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException  {
	
		Signup signup=new Signup();
		
		 String day=signup.getDay();
	      String month=signup.getMonth();
	      String year=signup.getYear();
	      String emailid=signup.getEmailid();
	      String passwordi=signup.getPasswordi();
	      File fileUpload=signup.getFileUpload();
	      String surname=signup.getSurname();
	      String gender=signup.getGender();
	      String firstname=signup.getFirstname();
	      String date=year+"-"+month+"-"+day;
	     
	      System.out.println(firstname);
	     	 System.out.println(emailid);
	     	
	     	 
	     	user.setDate(date);
	     	user.setEmailid(emailid);
	     	user.setFirstname(firstname);
	     	user.setGender(gender);
	     	user.setPasswordi(passwordi);
	     	//user.setFileUpload(fileUpload);
	     	user.setSurname(surname);
	     	
	     	
	               
	       
	   /*  	
		String destPath = "C:/apache-tomcat-6.0.33/work/";
        File destFile =null;
	      try{
	     	 System.out.println("Src File name: " + signup.getFileUpload());
	     	 System.out.println("Dst File name: " + signup.getFileUploadFileName());
	     	String FileUploadFilename=signup.getFileUploadFileName();
	     	 File FileUpload=   signup.getFileUpload();
	   
	     	  destFile  = new File(destPath, FileUploadFilename);
	     	
	    	 FileUtils.copyFile(FileUpload, destFile);
	    	 System.out.println(destFile);
	  
	      }catch(IOException e){
	         e.printStackTrace();
	        
	      }*/
	     	/*MultipartFile file = article.getFileData();  //Will return CommonsMultipartFile
	     	String filePath = "C:/MyApplication/UploadedImages/" + file.getOriginalFilename(); //Please note that I am going to remove hardcoaded path to get it from resource/property file
	     	File dest = new File(filePath);
	     	file.transferTo(dest);
		*/
		userService.addUser(user);
		System.out.println("Save User Data");
		return new ModelAndView("redirect:/userList.html");
	}

	@RequestMapping("/userList")
	public ModelAndView getUserList() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("user", userService.getUser());
		return new ModelAndView("UserDetails", model);

	}
}
