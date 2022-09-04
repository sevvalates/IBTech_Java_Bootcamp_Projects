package com.godoro.hw0301;

public class TestUpdate {
	public static void main(String[] args) {

		try {
			CustomerManager customerManager=new CustomerManager();
			Customer customer=new Customer(5,"Selvi Cakir",4800);
			boolean updated=customerManager.update(customer);
			
			if(updated) {
				System.out.print("Musteri guncellendi.");
			}else {
				System.out.print("Guncellenemedi!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
