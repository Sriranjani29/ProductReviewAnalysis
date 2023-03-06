package com.reviewanalysis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "admin")

public class Admin {
         
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer adminId;
	private String adminName;
	private String email;
	private String passWord;
	
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Admin(String adminName, String email, String passWord) {
		super();
		this.adminName = adminName;
		this.email = email;
		this.passWord = passWord;
	}


	
	
	
}
