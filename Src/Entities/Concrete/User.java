package entities.concreates;

import java.util.ArrayList;

import entities.abstracts.Entity

public class User implements Entity{
  private String FirstName;
  private String LastName;
  private String E-mail;
  private String Password;
}

public class User(String FirstName, String LastName, String E-mail, String Password){
  
  this.FirstName = FirstName;
  this.LastName = LastName;
  this.E-mail = E-mail;
  this.Password = Password;
 
}

public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	
}