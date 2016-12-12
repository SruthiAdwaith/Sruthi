package com.beingjavaguys.domain;

import java.io.File;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_fb")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "vchr_id")
	private int id;

	@Column(name = "vchr_firstname")
	private String firstname;

	@Column(name = "vchr_surname")
	private String surname;
	
	@Column(name = "vchr_email")
	private String emailid;

	@Column(name = "vchr_pswd")
	private String passwordi;
	
	@Column(name = "dt_dob")
	private String date;
	
	
	@Column(name = "vchr_gender")
	private String gender;

	@Column(name = "image")
	private String fileName;
	
	 @Column(name = "file_data")
	 private byte[] data;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getEmailid() {
		return emailid;
	}
	
	
	public void setPasswordi(String passwordi) {
		this.passwordi = passwordi;
	}

	public String getPasswordi() {
		return passwordi;
	}


	
	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	public String getFileName() {
        return fileName;
    }
 
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
 
   
    public byte[] getData() {
        return data;
    }
 
    public void setData(byte[] data) {
        this.data = data;
    }
	
}
