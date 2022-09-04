package com.godoro.hw0301;

import java.util.List;

public class TestList {
	public static void main(String[] args) {

		try {
			CustomerManager customerManager=new CustomerManager();
			List<Customer> customerList=customerManager.list();
			
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
