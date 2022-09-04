package com.godoro.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestFilter {
	public static void main(String[] args) throws Exception {
			
			String url="jdbc:postgresql://localhost/dbgodoro";
			String user="postgres";
			String password="12345";
			String driver="org.postgresql.Driver";
			Class.forName(driver);
	
			Connection connection=DriverManager.getConnection(url,user,password);
				
			//String sql="select * from Product where salesPrice>?";
			String sql="select * from Product where productName like ?";

			PreparedStatement statement =connection.prepareStatement(sql);
			
			//statement.setLong(1, 1000);
			statement.setString(1, "%ep Te%");

			ResultSet resultSet= statement.executeQuery();
			while(resultSet.next()) {
				long productId=resultSet.getLong("productId");
				String productName=resultSet.getString("productName");
				double salesPrice=resultSet.getDouble("salesPrice");
				System.out.println(productId+" "+productName+" "+salesPrice);
			}
			 
			connection.close();
	}

}
