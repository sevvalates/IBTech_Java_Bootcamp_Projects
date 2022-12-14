package com.godoro.inheritance;

public class Supplier extends Person {
	
	private long supplierId;
	
	private double totalCrebit;

	public Supplier(long supplierId, String firstName, String lastName, double totalCrebit) {
		super(firstName, lastName);
		this.supplierId = supplierId;
		this.totalCrebit = totalCrebit;
	}

	public long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public double getTotalCrebit() {
		return totalCrebit;
	}

	public void setTotalCrebit(double totalCrebit) {
		this.totalCrebit = totalCrebit;
	}
	@Override
	public String getGreetings() {
		return "Selam";
	}
	
}
