package com.hsbc;

public class Current extends Account {

	String nomineeName;

	public Current() {

	}

	public Current(String accountNo, double balance, String ifsc, String nomineeName) {
		super(accountNo, balance, ifsc);
		this.nomineeName = nomineeName;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public String display() {
		return "[accountNo=" + getAccountNo() + ", balance=" + getBalance() + ", ifsc=" + getIfsc() + " nomineeName= "
				+ nomineeName + "]";

	}

}
