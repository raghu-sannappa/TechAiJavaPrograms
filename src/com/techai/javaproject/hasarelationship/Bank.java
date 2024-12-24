package com.techai.javaproject.hasarelationship;

public class Bank {

	String bankName;
	String branch;
	long bankPhNum;
	
	Account acc = new Account(101,"Raghu",805073152);
	
	public Bank(String bankName,String branch,long bankPhNum) {
		this.bankName=bankName;
		this.branch=branch;
		this.bankPhNum=bankPhNum;
	}
	
	public void createAccount() {
		System.out.println("Customer Account Created..");
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", branch=" + branch + ", bankPhNum=" + bankPhNum + ", acc=" + acc + "]";
	}
	
	
}
