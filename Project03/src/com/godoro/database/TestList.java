package com.godoro.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestList {
	public static void main(String[] args) throws Exception {
		
		String url="jdbc:postgresql://localhost/dbgodoro";
		String user="postgres";
		String password="12345";
		String driver="org.postgresql.Driver";
		Class.forName(driver);

		Connection connection=DriverManager.getConnection(url,user,password);
			
		String sql="select * from Product";
		PreparedStatement statement =connection.prepareStatement(sql);
		ResultSet resultSet= statement.executeQuery();
		//resultset bi tane cursor ,
		//önce null gösteriyo (o yuzden en az 1 kez next demek lazım)
		//next dersen ilk elemanı gösteriyo, ...
		//"next" hem sıradaki kayda geçiyor 
		//hem de başka kayıt var mı diye dönüyor
		while(resultSet.next()) {
			long productId=resultSet.getLong("productId");
			String productName=resultSet.getString("productName");
			double salesPrice=resultSet.getDouble("salesPrice");
			System.out.println(productId+" "+productName+" "+salesPrice);
		}
		 
		
		connection.close();
		
	}
}
