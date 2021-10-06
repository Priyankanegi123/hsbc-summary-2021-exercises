package com.hsbc;

public class Account {
	private String accountNo;
	private double balance;
	String ifsc;

	public Account() {

	}

	public Account(String accountNo, double balance, String ifsc) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.ifsc = ifsc;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String display() {
		return "Account [accountNo=" + accountNo + ", balance=" + balance + ", ifsc=" + ifsc + "]";
	}

}
