package com.varna.company;


public class EmployeePay {
	float basicPay;
	float deduction;
	float bonus;
	float sum;
	 EmployeePay(float b, float d, float bo){
		 basicPay=b;
		 deduction=d;
		 bonus=bo;
		 
		 }
	public float getSum() {
		 sum=this.basicPay-this.deduction+this.bonus;
		 return this.sum;
	 }

}
