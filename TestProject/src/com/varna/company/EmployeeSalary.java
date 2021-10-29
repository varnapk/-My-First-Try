package com.varna.company;

public class EmployeeSalary {
	float totalSalary = 0;

	float getTotalSalary() {
		float basicPay=1000f;
		EmployeePay ep=new EmployeePay(basicPay,50,100);
		EmployeePerks ep1=new EmployeePerks(basicPay);
		this.totalSalary=ep.getSum()+ep1.getSum();
		return this.totalSalary;
	}
	public static void main(String[] args) {
		EmployeeSalary es=new EmployeeSalary();
		System.out.println("Total Salary : "+ es.getTotalSalary());
		
		
	}

}
