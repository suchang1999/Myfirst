package com.lovo.beans;

import java.io.Serializable;

public class UserInfo implements Serializable{
	private long id;
	private String userName;
	private int age;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserInfo [toString()=" + super.toString() + "]";
	}
	public UserInfo(long id, String userName, int age) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
	}	
}
