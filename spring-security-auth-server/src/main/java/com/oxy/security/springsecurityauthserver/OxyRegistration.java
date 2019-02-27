package com.oxy.security.springsecurityauthserver;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@JsonIgnoreProperties( ignoreUnknown = true )
public class OxyRegistration {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String email;
private String password;
private long mobilenumber;
//default constractor
public OxyRegistration() {
	
}

public OxyRegistration(int id, String email, String password, long mobilenumber) {
	super();
	this.id = id;
	this.email = email;
	this.password = password;
	this.mobilenumber = mobilenumber;
}

//setters and getters
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
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
public long getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(long mobilenumber) {
	this.mobilenumber = mobilenumber;
}
@Override
public String toString() {
	    StringBuilder sb = new StringBuilder();
        sb.append("************************************");
        sb.append("\nemail: ").append(email);
        sb.append("\npassword: ").append(password);
        sb.append("\nmobilenumber: ").append(mobilenumber);
        sb.append("\n************************************");
        return sb.toString();
    }	

}
