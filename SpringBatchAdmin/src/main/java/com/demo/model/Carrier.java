package com.demo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "carrier")
public class Carrier {
	
	public String getDocket() {
		return docket;
	}
	public void setDocket(String docket) {
		this.docket = docket;
	}
	public String getUsdot() {
		return usdot;
	}
	public void setUsdot(String usdot) {
		this.usdot = usdot;
	}
	public String getLegalname() {
		return legalname;
	}
	public void setLegalname(String legalname) {
		this.legalname = legalname;
	}
	public String getDbaname() {
		return dbaname;
	}
	public void setDbaname(String dbaname) {
		this.dbaname = dbaname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String docket;
	private String usdot;
	private String legalname;
	private String dbaname;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String email;
	

}
