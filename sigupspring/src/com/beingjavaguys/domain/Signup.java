package com.beingjavaguys.domain;

import java.io.File;
import org.springframework.web.multipart.MultipartFile;
public class Signup {
	
	
	 int id;
	 String firstname;
	 String surname;
	 String emailid;
     String passwordi;
	 String gender;
	 MultipartFile file;
	 File fileUpload;
	 String fileUploadContentType;
	String fileUploadFileName;
	 String day;
	 String month;
	 String  year;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return this.surname;
	}

	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getEmailid() {
		return this.emailid;
	}
	
	
	public void setPasswordi(String passwordi) {
		this.passwordi = passwordi;
	}

	public String getPasswordi() {
		return this.passwordi;
	}


	public void setDay(String  day)
	{
		this.day=day;
	}
	public String getDay()
	{
		return this.day;
	}
	
	public void setMonth(String month)
	{
		this.month=month;
	}
	public String getMonth()
	{
		return this.month;
	}
	
	public void setYear(String year)
	{
		this.year=year;
	}
	public String getYear()
	{
		return this.year;
	}
	

	
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFileUploadContentType() {
		return this.fileUploadContentType;
	}

	public void setFileUploadContentType(String fileUploadContentType) {
		this.fileUploadContentType = fileUploadContentType;
	}

	public String getFileUploadFileName() {
		return this.fileUploadFileName;
	}

	public void setFileUploadFileName(String fileUploadFileName) {
		this.fileUploadFileName = fileUploadFileName;
	}
	
	public File getFileUpload() {
        return this.fileUpload;
    }
 
    public void setFileUpload(File fileUpload) {
        this.fileUpload = fileUpload;
    }

  

}
