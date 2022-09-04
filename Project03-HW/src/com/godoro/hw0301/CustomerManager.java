package com.godoro.hw0301;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
	
	private String url="jdbc:postgresql://localhost/dbgodoro";
	private String user="postgres";
	private String password="12345";
	private String driver="org.postgresql.Driver";
	
	public CustomerManager() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private List<Customer> parseList(ResultSet resultSet) throws Exception {
		List<Customer> customerList=new ArrayList<>();

		while(resultSet.next()) {
			Customer customer=parse(resultSet);
			customerList.add(customer);
		}
		return customerList;

	}
	
	private Customer parse(ResultSet resultSet) throws SQLException {
		long customerId=resultSet.getLong("customerId");
		String customerName=resultSet.getString("customerName");
		double totalDebit=resultSet.getDouble("totalDebit");
		Customer customer=new Customer(customerId,customerName,totalDebit);
		return customer;
	}
	
	public List<Customer> listByCustomerNameLike(String customerNamePattern) throws Exception {

		Connection connection=DriverManager.getConnection(url,user,password);
		
		String sql="select * from Customer where customerName like ?";

		PreparedStatement statement =connection.prepareStatement(sql);
		
		statement.setString(1,"%"+customerNamePattern+"%");

		ResultSet resultSet= statement.executeQuery();
		List<Customer> customerList=parseList(resultSet);
		 
		connection.close();
		
		return customerList;
	}
	
	public List<Customer> listByTotalDebitGreater(double totalDebitMin) throws Exception {

		Connection connection=DriverManager.getConnection(url,user,password);
		
		String sql="select * from Customer where totalDebit >= ?";

		PreparedStatement statement =connection.prepareStatement(sql);
		
		statement.setDouble(1, totalDebitMin);

		ResultSet resultSet= statement.executeQuery();
		List<Customer> customerList=parseList(resultSet);
		 
		connection.close();
		
		return customerList;
	}
	
	public Customer find(long customerId) throws Exception {
		
		Customer customer=null;
		Connection connection=DriverManager.getConnection(url,user,password);
				
		String sql="select * from Customer where customerId = ?";
		PreparedStatement statement =connection.prepareStatement(sql);
		statement.setLong(1, customerId);
		ResultSet resultSet= statement.executeQuery();

		if(resultSet.next()) {
			customer=parse(resultSet);
		}
		 
		connection.close();
		
		return customer;
	}
	
	public List<Customer> list() throws Exception {
		
		Connection connection=DriverManager.getConnection(url,user,password);

		String sql="select * from Customer";
		PreparedStatement statement =connection.prepareStatement(sql);
		ResultSet resultSet= statement.executeQuery();

		List<Customer> customerList=parseList(resultSet);
		
		return customerList;
		 
	}

	public boolean delete(long customerId) throws Exception {
		
		Connection connection=DriverManager.getConnection(url,user,password);
		
		String sql="delete from Customer where customerId = ?";
		PreparedStatement statement =connection.prepareStatement(sql);
		statement.setLong(1, customerId);
		int affected=statement.executeUpdate(); 
		
		connection.close();
				
		return affected>0;
	}	
	
	public boolean update(Customer customer) throws Exception {
		
		Connection connection=DriverManager.getConnection(url,user,password);
		
		String sql="update Customer set customerName=?, totalDebit=? where customerId = ?";
		PreparedStatement statement =connection.prepareStatement(sql);
		statement.setString(1, customer.getCustomerName());
		statement.setDouble(2, customer.getTotalDebit());
		statement.setLong(3, customer.getCustomerId());
		
		int affected=statement.executeUpdate(); 
		
		connection.close();
				
		return affected>0;
	}	
	
	public boolean insert(Customer customer) throws Exception {
		
		Connection connection=DriverManager.getConnection(url,user,password);
			
		String sql="insert into Customer(customerName,totalDebit) values(?,?)";
		PreparedStatement statement =connection.prepareStatement(sql);
		statement.setString(1, customer.getCustomerName());
		statement.setDouble(2, customer.getTotalDebit());
		int affected=statement.executeUpdate(); 
				
		connection.close();
				
		return affected>0;
	}
		
}
