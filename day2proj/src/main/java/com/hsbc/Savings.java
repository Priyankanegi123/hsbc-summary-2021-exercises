package com.hsbc;

public class Savings extends Account {
	private double dailyLimit;

	public Savings() {

	}

	public Savings(String accountNo, double balance, String ifsc, double dailyLimit) {
		super(accountNo, balance, ifsc);
		this.dailyLimit = dailyLimit;
	}

	public double getDailyLimit() {
		return dailyLimit;
	}

	public void setDailyLimit(double dailyLimit) {
		this.dailyLimit = dailyLimit;
	}

	public String display() {
		return "[accountNo=" + getAccountNo() + ", balance=" + getBalance() + ", ifsc=" + getIfsc() + " dailyLimit= "
				+ dailyLimit + "]";
	}

}
