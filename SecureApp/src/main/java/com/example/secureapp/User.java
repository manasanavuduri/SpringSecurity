package com.example.secureapp;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private long id;
	private String username;
	private String pass;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
