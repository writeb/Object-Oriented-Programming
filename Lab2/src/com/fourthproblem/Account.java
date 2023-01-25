package com.fourthproblem;

public class Account {
	private double balance;
	private int accNumber;
	public Account() {}
	public Account(int a) {
		balance=0.0;
		accNumber=a;
	}
	public void deposit(double sum) {
		balance+=sum;
	}
	public void withdraw(double sum) {
		if(balance>sum) {
			balance-=sum;
		}else {
			System.out.println("Error not enaugh balance");			
		}
	}
	public double getBalance() {
		return this.balance;
	}
	public int getAccountNumber() {
		return this.accNumber;
	}
	public void transfer(double amount,Account other){
		this.withdraw(amount);
		other.deposit(amount);
	}
	public String toString() {
		return accNumber+": "+balance+" tenge.";
	}
	public final void print() {
		System.out.println(toString());
	}
}

