package com.godoro.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	
	public static void main(String[] args) throws Exception {
		
		String url="jdbc:postgresql://localhost/dbgodoro";
		String user="postgres";
		String password="12345";
		
		//bazen(console da çaılışrken webde çalışmaması) driver ı yükleyemeyebiliyo
		//zorla yüklettiriyoruz o yüzden:
		String driver="org.postgresql.Driver";
		Class.forName(driver);
		//Class.forName(driver).newInstance();


		//normalde try catch ypman lazım biz simdilik throw
		Connection connection=DriverManager.getConnection(url,user,password);
		
		//veritabanına bağlanıp sen kimsin demek
		//metadata genel bilgi ver demek
		System.out.println(connection.getMetaData().getDatabaseProductName());
		
		connection.close();
	}

}
