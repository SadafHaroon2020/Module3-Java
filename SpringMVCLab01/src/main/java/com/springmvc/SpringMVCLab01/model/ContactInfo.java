package com.springmvc.SpringMVCLab01.model;


/*11. Create a new class ContactInfo.
Inside that class add private fields String “email”, Long “phoneNumber”, String “linkedInUrl”.
Create public getters and setters for them.
 */
public class ContactInfo {

	private String email;
	private String phoneNumber;
	private String linkedInUrl;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLinkedInUrl() {
		return linkedInUrl;
	}
	public void setLinkedInUrl(String linkedInUrl) {
		this.linkedInUrl = linkedInUrl;
	}
}
