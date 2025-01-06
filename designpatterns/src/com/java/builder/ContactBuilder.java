package com.java.builder;

public class ContactBuilder {
	private String firstName;
	private String lastName;
	private String email;
	private long mobile;
	private long home;
	private long work;
	private int landline;
	private String dob;
	private String gender;
	private Address address;
	private Website website;
	
	
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public long getHome() {
		return home;
	}
	public void setHome(long home) {
		this.home = home;
	}
	public long getWork() {
		return work;
	}
	public void setWork(long work) {
		this.work = work;
	}
	public int getLandline() {
		return landline;
	}
	public void setLandline(int landline) {
		this.landline = landline;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Website getWebsite() {
		return website;
	}
	public void setWebsite(Website website) {
		this.website = website;
	}
	
	
	public Contact build() {
		return new Contact(this.firstName, this.lastName, this.email, this.mobile, this.home, this.work, this.landline,this.dob, this.gender, this.address, this.website);
	}
	
	

}
