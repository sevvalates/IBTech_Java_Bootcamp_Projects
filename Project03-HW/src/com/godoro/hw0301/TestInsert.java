package com.godoro.hw0301;

public class TestInsert {
	public static void main(String[] args) {

		try {
			CustomerManager customerManager=new CustomerManager();
			Customer customer=new Customer(0,"Memati Bas",4350);
			boolean inserted=customerManager.insert(customer);
			
			if(inserted) {
				System.out.print("Musteri sokuldu.");
			}else {
				System.out.print("Sokulamadi.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
