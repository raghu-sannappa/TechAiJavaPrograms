package com.techai.javaproject.hasarelationship;

public class Account {
	private int accNo;
	private String customerName;
	private long phNo;
	
	
	public Account(int accNo, String customerName, long phNo) {
		super();
		this.accNo = accNo;
		this.customerName = customerName;
		this.phNo = phNo;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public void withdraw() {
		System.out.println("Amount Deposited");
	}

}
