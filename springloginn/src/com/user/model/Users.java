package com.user.model;

import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.persistence.Embeddable;

@Entity
@Table(name = "tbl_fb")
@SuppressWarnings("serial")

public class Users  implements Serializable {
	/*@Id
	@GeneratedValue
	@Column(name = "vhr_id", length = 11 )
	private Long id;*/
	
	@Column(name = "vchr_email")
	String email;

	@Column(name = "vchr_pswd")
	String password;


	
	/*public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	} */



	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}


