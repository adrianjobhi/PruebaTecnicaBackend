package org.generation.util.extras;

import org.generation.util.Imprimible;

public class TarjetaRegalo implements Imprimible{
	private int accountNumber;
	private double balance;
	private String name;
	
	public TarjetaRegalo(int accountNumber, double balance, String name) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
	}//constructor

	public int getAccountNumber() {
		return accountNumber;
	}//getAccountNumber
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}//setAccountNumber
	public double getBalance() {
		return balance;
	}//getBalance
	public void setBalance(double balance) {
		this.balance = balance;
	}//setBalance
	public String getName() {
		return name;
	}//getName
	public void setName(String name) {
		this.name = name;
	}//setName
	
	public int getNumeroCuenta() {
		return accountNumber;
	}//getNumeroCuenta
	
	public double getSaldo() {
		return balance;
	}//getSaldo

	@Override
	public String toString() {
		return "TarjetaRegalo [accountNumber=" + accountNumber + ", balance=" + balance + ", name=" + name + "]";
	}//toString
	
}//TarjetaRegalo
