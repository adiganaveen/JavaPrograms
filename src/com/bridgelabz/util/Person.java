package com.bridgelabz.util;

public class Person {
	private String fName;
	private String lName;
	private long phNumber;
	private Address address = new Address();

	public Person() {
		fName = null;
		lName = null;
		phNumber = 0;
		address = null;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(long phNumber) {
		this.phNumber = phNumber;
	}

}
