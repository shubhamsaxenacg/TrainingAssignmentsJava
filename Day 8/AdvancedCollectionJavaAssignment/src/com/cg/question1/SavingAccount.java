package com.cg.question1;

public class SavingAccount {
	
	private int acc_balance;
	private int acc_id;
	private String accountHolderName;
	private String isSalaryAccount;
	
	@Override
	public String toString() {
		return "SavingAccount [acc_balance=" + acc_balance + ", acc_id=" + acc_id + ", accountHolderName="
				+ accountHolderName + ", isSalaryAccount=" + isSalaryAccount + "]";
	}


	public int getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(String isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	public int withdraw(int amount) {
		if(amount<acc_balance)
			acc_balance = acc_balance - amount;
		return acc_balance;
	}
	
	public int deposit(int amount) {
		acc_balance = acc_balance + amount;
		return acc_balance;
	}
	
}
