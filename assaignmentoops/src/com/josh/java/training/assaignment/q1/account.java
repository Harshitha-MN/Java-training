package com.josh.java.training.assaignment.q1;

public class account {
	String id;
	String name;
	int balance;

	public account(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	int credit(int amount) {
		this.balance += amount;
		System.out.println(amount + "creditedamount");
		System.out.println("current balance" + balance);
		return this.balance;
	}

	int debit(int amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
			System.out.println(amount + "amount debited");
			return this.balance;
		} else {
			System.out.println("amount exceeded balance");
			return this.balance;
		}
	}

	int transfer(account another, int amount) {
		if (amount <= balance) {
			another.balance += balance;
			System.out.println("current balance amount transfered to anotheraccount");
			return this.balance;
		} else {
			System.out.println("amount exceeded balance");
			return this.balance;
		}
	}

	@Override
	public String toString() {
		return "Account[id=this.id,name=this.name,balance=this.balance]";
	}

	public static void main(String[] args) {
		account a1 = new account("31", "harshi");
		a1.credit(41000);
		a1.debit(5500);
		System.out.println("a1.toString()");
		System.out.println("checkbal a1=" + a1.getBalance());

		account a2 = new account("13", "Ashu");
		a2.credit(33000);
		a2.debit(6000);
		System.out.println("a2.toString()");
		System.out.println("checkbal a2=" + a2.getBalance());
	}
}
