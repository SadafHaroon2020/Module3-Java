package com.springmvc.SpringMVCLab01.model;

import java.sql.Date;

/*12. Create a new class PrivateInfo Inside the class add private fields Long “ssn”, Long “ccn”, Date “dob” 
 * Create public getters and setters for them.
 */
public class PrivateInfo {
	
	private Long ssn;
	private Long ccn;
	private Date dob;
	
	public Long getSsn() {
		return ssn;
	}
	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}
	public Long getCcn() {
		return ccn;
	}
	public void setCcn(Long ccn) {
		this.ccn = ccn;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
}
