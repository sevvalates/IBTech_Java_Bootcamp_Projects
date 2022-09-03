package com.godoro.hw0201;

import java.util.ArrayList;
import java.util.List;

public class TestStore2 {
	public static void main(String[] args) {
		
		try {
			List<Customer> customerList=new ArrayList<>();
			customerList.add(new Customer(601,"Cem Karaca",6540));
			customerList.add(new Customer(602,"Baris Manco",7645));
			customerList.add(new Customer(603,"Fikret Kizilok",3450));
			
			String filePath="C:\\Users\\sevva\\Desktop\\github_projeler\\projem\\IBTech_Java_Bootcamp_Projects\\Customer.txt";
			CustomerFiler customerFiler=new CustomerFiler(filePath);
			customerFiler.store(customerList);
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	
}
