package com.godoro.hw0301;

public class TestDelete {
	public static void main(String[] args) {

		try {
			CustomerManager customerManager=new CustomerManager();
			long customerId=4;
			boolean deleted=customerManager.delete(customerId);
			
			if(deleted) {
				System.out.print("Musteri silindi.");
			}else {
				System.out.print("Silinemedi!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
