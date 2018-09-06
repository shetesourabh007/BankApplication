package com.demo.impl;

public class AccountImpl {
	private String name;
	int age;
	double balance;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void deposite(double amount) {
		balance += amount;
	}

	public String displayInfo() {
		return "The Balance " + name + "is" + balance;
	}

}
