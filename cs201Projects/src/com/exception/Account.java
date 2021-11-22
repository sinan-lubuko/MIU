package com.exception;

class Account {

	private String ownerName;
	private double balance;

	public Account() {
		ownerName = "Unassigned";
		balance = 0.0;
	}
	//amt cannot be 0 or negative
	public void add(double amt) throws Exception {
		if(amt <= 0){
			throw new Exception("Amount can not be zero or negative");
		}
		balance = balance + amt;
	}

	//amt cannot be 0 or negative
	//amt cannot be bigger than balance
	public void deduct(double amt) throws Exception {
		if(amt <= 0){
			throw new Exception("Amount can not be zero or negative");
		}
		if(amt > balance){
			throw new Exception("Amount can not be greater than balance");
		}
		balance = balance - amt;
	}

	public double getBalance() {
		return balance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	//bal cannot be negative
	public void setBalance(double bal) throws Exception {
		if(bal < 0){
			throw new Exception("Balance can not be negative");
		}
		balance = bal;
	}

	public void setOwnerName(String name) {
		ownerName = name;
	}
	
	public static void main(String[] args){
		Account a = new Account();
		try {
			a.setBalance(100);
			a.add(100);
			a.deduct(200);
		} catch(Exception e){
			System.out.println("Error: "+ e.getMessage());
		}
	}
}
