package com.godoro.hw0301;

public class TestFind {
	public static void main(String[] args) {

		try {
			CustomerManager customerManager=new CustomerManager();
			long customerId=1;
			Customer customer =customerManager.find(customerId);
			
			if(customer!=null) {
				System.out.println(customer.getCustomerId()+" "
						+customer.getCustomerName()+" "
						+customer.getTotalDebit());
			}else {
				System.out.print("Bulunamadi!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
