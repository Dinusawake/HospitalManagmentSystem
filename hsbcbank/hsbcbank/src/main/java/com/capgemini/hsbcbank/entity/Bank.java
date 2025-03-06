package com.capgemini.hsbcbank.entity;

//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;

//@Entity
//@Table(name = "bankaccount")
public class Bank {

	private Long id;
	private String accountHolderName;
	private double balance;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Bank(Long id, String accountHolderName, double balance) {
		super();
		this.id = id;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", accountHolderName=" + accountHolderName + ", balance=" + balance + "]";
	}

}
