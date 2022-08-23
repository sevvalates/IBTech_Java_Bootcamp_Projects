package com.godoro.inventory;

public class ProductTest2 {
	public static void main(String[] args) {
		Product product = new Product(501,"Cep Telefonu",1300);
		System.out.println("Urun Ozdesligi: "+product.getProductId());
		System.out.println("Urun Adi: "+product.getProductName());
		System.out.println("Satis Ederi: "+product.getSalesPrice());
	}

}
