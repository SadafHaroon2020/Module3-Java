package com.springmvc.SpringMVCLab01.model;

/*13. Create a new class User. Inside the class add private fields String “firstName”, 
 * String “lastName”, String “userName”, String “gender”, ContactInfo “contactInfo”, PrivateInfo “privateInfo”.
 *  Create public getters and setters for them.*/

public class User {
	private String firstName;
	private String lastName;
	private String userName;
	private String gender;
	private ContactInfo contactinfo;
	private PrivateInfo privateinfo;
	
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public ContactInfo getContactinfo() {
		return contactinfo;
	}
	public void setContactinfo(ContactInfo contactinfo) {
		this.contactinfo = contactinfo;
	}
	public PrivateInfo getPrivateinfo() {
		return privateinfo;
	}
	public void setPrivateinfo(PrivateInfo privateinfo) {
		this.privateinfo = privateinfo;
	} 

}
