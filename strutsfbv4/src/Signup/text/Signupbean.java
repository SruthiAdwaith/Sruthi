package Signup.text;

import java.io.File;

public class Signupbean {
	String firstname;
	String lastname;
	String emailid;
	String passwordi;
	String Day;
	String Month;
	String  Year;
	String gender;
	private File fileUpload;
	private String fileUploadFileName;
	private String fileUploadContentType;
	
	
	public String getFileUploadContentType() {
		return fileUploadContentType;
	}

	public void setFileUploadContentType(String fileUploadContentType) {
		this.fileUploadContentType = fileUploadContentType;
	}

	public String getFileUploadFileName() {
		return fileUploadFileName;
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
	
	
	public void setFirstname(String fname)
	{
		this.firstname = fname;	
	}
	public String getFirstname()
	{
		return this.firstname;
	}
	
	public void setLastname(String lastname)
	{
		this.lastname=lastname;
	}
	public String getLastname()
	{
		return this.lastname;
	}
	
	public void setEmailid(String ema)
	{
		this.emailid=ema;
	}
	public String getEmailid()
	{
		return this.emailid;
	}
	

	public void setPasswordi(String passwordi)
	{
	this.passwordi=passwordi;
	}
	public String getPasswordi()
	{
		return this.passwordi;
	}
	
	public void setDay(String  Da)
	{
		Day=Da;
	}
	public String getDay()
	{
		return this.Day;
	}
	
	public void setMonth(String Mnth)
	{
		Month=Mnth;
	}
	public String getMonth()
	{
		return this.Month;
	}
	
	public void setYear(String Yr)
	{
		Year=Yr;
	}
	public String getYear()
	{
		return this.Year;
	}
	
	
	public void setGender(String gen)
	{
		gender=gen;
	}
	public String getGender()
	{
		return this.gender;
	}
}
