package com.varna.company;

public class EmployeePerks {
	float hra;
	float pf;
	float sum1;
	EmployeePerks(float basicPay){
		//5% of basic pay
	hra=0.05f*basicPay;
	//20% of basic pay
	pf=0.2f*basicPay;
	}
	float getSum() {
		this.sum1=this.hra-this.pf;
		return this.sum1;
		
	}

}
