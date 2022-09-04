package com.godoro.pattern;

public class TestFind {
	public static void main(String[] args) {

		try {
			ProductManager productManager=new ProductManager();
			long productId=11;
			Product product =productManager.find(productId);
			
			if(product!=null) {
				System.out.println(product.getProductId()+" "
						+product.getProductName()+" "
						+product.getSalesPrice());
			}else {
				System.out.print("Bulunamadi!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
