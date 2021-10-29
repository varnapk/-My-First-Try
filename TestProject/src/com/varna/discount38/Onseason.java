package com.varna.discount38;

public class Onseason {
	int totalamount;
	float discount;
	
	public void getDiscount(int totalamount) {
		this.totalamount=totalamount;
		discount=(totalamount*40)/100;
        System.out.println("Onseason discount is:"+discount);	
	}

}
