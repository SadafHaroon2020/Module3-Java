package com.springmvc.model;


/*11. Create a new class ContactInfo.
Inside that class add private fields String “email”, Long “phoneNumber”, String “linkedInUrl”.
Create public getters and setters for them.
 */
public class ContactInfo {

	private String email;
	private String phonenumber;
	private String linkedInUrl;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getLinkedInUrl() {
		return linkedInUrl;
	}
	public void setLinkedInUrl(String linkedInUrl) {
		this.linkedInUrl = linkedInUrl;
	}
}
