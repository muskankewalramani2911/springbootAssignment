package com.Account2;

public class Acc{
	String name;
	 static double amountBalance;
	double withdrawAmount;
	double depositAmount;

	static {
		System.out.println("Welcome CITI Account");
	}
	public Acc() {
		//System.out.println("Create CITI Account");
	}

	public Acc(String name, double amountBalance) {
		this.name = name;
		this.amountBalance = amountBalance;
		System.out.println("welcome  "+name);
		System.out.println("-----------------------------------------------------");
		
	}

	public double balance() {

		System.out.println("Balance is " + amountBalance + " INR");
		return amountBalance;
	}

	public void deposit(double depositAmount) throws AmountException {
		if (depositAmount < 0) {
			throw new AmountException("Invalid amount");
		} else {
			amountBalance += depositAmount;
			System.out.println("Total balance Amount " + amountBalance + " after depositing " + depositAmount + " INR");
		}
	}
	public void withdraw(double withdrawAmount) throws AmountException, BalanceException {
		if (withdrawAmount < 0) {
			throw new AmountException("Invalid amount");
		} else if (withdrawAmount > amountBalance) {
			throw new BalanceException("Insuffcient");
		} else {
			amountBalance -= withdrawAmount;
			System.out.println("Balance remaining " + amountBalance + " after withdrawing " + withdrawAmount + " INR");
		}

	}
	
}
