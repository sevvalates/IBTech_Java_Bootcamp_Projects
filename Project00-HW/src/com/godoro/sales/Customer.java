package com.godoro.sales;
//hw00-02

public class Customer {

	private int customerId;
	private String customerName;
	private int totalDebit;
	
	public Customer(int customerId, String customerName, int totalDebit) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.totalDebit = totalDebit;
	}

	public Customer() {
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getTotalDebit() {
		return totalDebit;
	}

	public void setTotalDebit(int totalDebit) {
		this.totalDebit = totalDebit;
	}
	
	
}
