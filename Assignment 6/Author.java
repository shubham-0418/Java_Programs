package com.oop;

public class Author {
private String name;
private String email;

public Author(String name, String email) {
	super();
	this.name = name;
	this.email = email;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

//to String method
	public String toString() {
	return "Author[name="+name+",email="+email+"]";  
	}



}
