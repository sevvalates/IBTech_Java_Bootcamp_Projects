package com.godoro.composition.test;
//hw03-02

import java.util.List;

import com.godoro.composition.entity.Employee;
import com.godoro.composition.manager.EmployeeManager;

public class TestListEmployee {
	public static void main(String[] args) {

		try {
			EmployeeManager employeeManager=new EmployeeManager();
			List<Employee> employeeList=employeeManager.list();
			
			for (Employee employee : employeeList) {
				System.out.println(employee.getEmployeeId()+" "
						+employee.getEmployeeName()+" "
						+employee.getMonthlySalary());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
