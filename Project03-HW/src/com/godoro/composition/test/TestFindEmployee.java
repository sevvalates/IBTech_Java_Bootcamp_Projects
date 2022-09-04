package com.godoro.composition.test;

import com.godoro.composition.entity.Employee;
import com.godoro.composition.manager.EmployeeManager;

public class TestFindEmployee {
	public static void main(String[] args) {

		try {
			EmployeeManager employeeManager=new EmployeeManager();
			long employeeId=4;
			Employee employee =employeeManager.find(employeeId);
			
			if(employee!=null) {
				System.out.println(employee.getEmployeeId()+" "
						+employee.getEmployeeName()+" "
						+employee.getMonthlySalary());
			}else {
				System.out.print("Bulunamadi!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
