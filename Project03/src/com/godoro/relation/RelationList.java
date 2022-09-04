package com.godoro.relation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RelationList {
	public static void main(String[] args) throws Exception {
		
		String url="jdbc:postgresql://localhost/dbgodoro";
		String user="postgres";
		String password="12345";
		String driver="org.postgresql.Driver";
		Class.forName(driver);

		Connection connection=DriverManager.getConnection(url,user,password);
			
		String sql="select e.*, departmentname  from employee e\r\n"
				+ "	left join department d on e.departmentid = d.depratmentid ";
		PreparedStatement statement =connection.prepareStatement(sql);
		ResultSet resultSet= statement.executeQuery();

		while(resultSet.next()) {
			long employeeId=resultSet.getLong("employeeId");
			String employeeName=resultSet.getString("employeeName");
			double monthlySalary=resultSet.getDouble("monthlySalary");
			long departmentId=resultSet.getLong("departmentId");
			String departmentName=resultSet.getString("departmentName");

			System.out.println(employeeId+" "+employeeName+" "+monthlySalary
					+" "+departmentId+" "+ departmentName);
		}
		 
		
		connection.close();
		
	}
}
