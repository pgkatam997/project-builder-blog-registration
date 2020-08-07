package model;

import java.time.LocalDateTime;

public class User{
	 String email;
	 String password;
	 LocalDateTime date;
	
	 public User(String email, String password, LocalDateTime date) {
		 super();
		 this.email=email;
		 this.password=password;
		 this.date=date;
		// TODO Auto-generated constructor stub
		 
	}

	public void setEmail(String email) {
		// TODO Auto-generated method stub
		this.email=email;		
	}

	public void setPassword(String password) {
		// TODO Auto-generated method stub
		this.password=password;
		
	}

	public void setDate(LocalDateTime date) {
		// TODO Auto-generated method stub
		this.date=date;
		
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	public LocalDateTime getDate() {
		// TODO Auto-generated method stub
		return date;
	}
	 
}