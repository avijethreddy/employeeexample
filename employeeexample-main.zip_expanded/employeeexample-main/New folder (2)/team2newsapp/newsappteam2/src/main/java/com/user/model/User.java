package com.user.model;
import lombok.NoArgsConstructor;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Table(name="user_info")
public class User 
{
  @Id
  @Column(name="user_id")
  private long userId;
  @Column(length =50,name="user_name")
  private String userName;
  @Column(unique=true , name="user_email")
  private String email;
  @Column(nullable=false)
  private String passWord;
  @Column(length =25,name="user_name")
  private boolean active;
  @Column(nullable=false)
  private String roles;
public long getUserId() {
	return userId;
}
public void setUserId(long userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}
public String getRoles() {
	return roles;
}
public void setRoles(String roles) {
	this.roles = roles;
}
public User(long userId, String userName, String email, String passWord, boolean active, String roles) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.email = email;
	this.passWord = passWord;
	this.active = active;
	this.roles = roles;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", passWord=" + passWord
			+ ", active=" + active + ", roles=" + roles + "]";
}
 


  
}
