package com.varna.studentdetails37;

public class Address {
	String hname;
	String city;
	String district;
	String name;
	int roll;
	String address;
	Address(String hname,String city, String district) {
		this.hname=hname;
		this.city=city;
		this.district=district;
		address=this.hname+" "+this.city+" "+this.district;
	 }
	public String getAddress() {
		return address;
	}
	
	
	
}