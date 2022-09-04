package com.godoro.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestInsert {
	public static void main(String[] args) throws Exception {
		
		String url="jdbc:postgresql://localhost/dbgodoro";
		String user="postgres";
		String password="12345";
		String driver="org.postgresql.Driver";
		Class.forName(driver);

		Connection connection=DriverManager.getConnection(url,user,password);
			
		String sql="insert into Product(productName,salesPrice) values(?,?)";
		PreparedStatement statement =connection.prepareStatement(sql);
		statement.setString(1, "Cep Telefonu");
		statement.setDouble(2, 5465);
		//1 ve 2 soru işaretlerinin sayı parametresi
		int affected=statement.executeUpdate(); //Etkilenmiş satir sayisi
		
		//connection.create i kullanma
		
		connection.close();
		
		System.out.println("Etkilenmiş "+affected);
	}
}
