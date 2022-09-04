package com.godoro.hw0301;

import java.util.List;

public class TestFilter {
	public static void main(String[] args) {

		try {
			CustomerManager customerManager=new CustomerManager();
			
			String customerNamePattern="ey";
			List<Customer> customerList=customerManager.listByCustomerNameLike(customerNamePattern);
			
			for (Customer customer : customerList) {
				System.out.println(customer.getCustomerId()+" "
						+customer.getCustomerName()+" "
						+customer.getTotalDebit());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
