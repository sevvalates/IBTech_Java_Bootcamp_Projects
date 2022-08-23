package com.godoro.sales;

public class CustomerTest2 {
	public static void main(String[] args) {
		Customer customer =new Customer(501,"Neset Ertas",4350);
		System.out.println("Musteri ID: "+customer.getCustomerId());
		System.out.println("Musteri Adi: "+customer.getCustomerName());
		System.out.println("Musteri Total Borcu: "+customer.getTotalDebit());
	}
}
