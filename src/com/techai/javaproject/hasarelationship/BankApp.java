package com.techai.javaproject.hasarelationship;

public class BankApp {

	public static void main(String[] args) {
		Bank bank = new Bank("Kotak","Jayanagar",990033113);
		System.out.println(bank);
		bank.createAccount();
		bank.acc.withdraw();
		System.out.println(bank.acc.getAccNo()); 
		System.out.println(bank.bankPhNum);
	}

}
