package com.Shandeep.AppleStore;

public class login {
	private String name;
	private String password;
	private String User;
	public login(){
		
	}
	public login(String name,String password,String User){
		this.name=name;
		this.password=password;
		this.User=User;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return this.password;
	}
	public void setUser(String User) {
		this.User=User;
	}
	public String getUser() {
		return this.User;
	}
}
