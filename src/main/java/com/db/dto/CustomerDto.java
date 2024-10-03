package com.db.dto;

public class CustomerDto {
private long id;
private String customerName;
private long mobileNumber;
private String location;
public CustomerDto() {
	super();
	// TODO Auto-generated constructor stub
}
public CustomerDto(long id, String customerName, long mobileNumber, String location) {
	super();
	this.id = id;
	this.customerName = customerName;
	this.mobileNumber = mobileNumber;
	this.location = location;
}
public long getid() {
	return id;
}
public void setid(long id) {
	this.id = id;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

}
