package com.godoro.pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductManager {
	
	private String url="jdbc:postgresql://localhost/dbgodoro";
	private String user="postgres";
	private String password="12345";
	private String driver="org.postgresql.Driver";
	
	public ProductManager() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean insert(Product product) throws Exception {
		
		Connection connection=DriverManager.getConnection(url,user,password);
			
		String sql="insert into Product(productName,salesPrice) values(?,?)";
		PreparedStatement statement =connection.prepareStatement(sql);
		statement.setString(1, product.getProductName());
		statement.setDouble(2, product.getSalesPrice());
		int affected=statement.executeUpdate(); 
				
		connection.close();
		
		System.out.println("Etkilenmiş "+affected);
		
		return affected>0;
	}
}
