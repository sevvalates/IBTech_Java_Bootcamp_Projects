package com.godoro.hw0201;

import java.io.IOException;
import java.util.List;


public class TestLoad2 {

	public static void main(String[] args) throws IOException{
		
		String filePath="C:\\Users\\sevva\\Desktop\\github_projeler\\projem\\IBTech_Java_Bootcamp_Projects\\Customer.txt";
		CustomerFiler customerFiler=new CustomerFiler(filePath);
		List<Customer> customerList= customerFiler.load();
		
		for(Customer customer : customerList) {
			System.out.println(customer.getCustomerId()+" "
				+ customer.getCustomerName()+" "
				+ customer.getTotalDebit());
		}
	}
	
}
