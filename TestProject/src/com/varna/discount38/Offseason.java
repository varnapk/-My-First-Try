package com.varna.discount38;

public class Offseason extends Onseason {
	int totalamt;
	float dis;
	
	public Offseason()
	{
		super();
	}
	public void getDiscount(int totalamt) {
		this.totalamt =totalamt;

		dis=(totalamt*15)/100;
		System.out.println("Offseason discount is:"+dis);
		super.getDiscount(1000);
	}
	public static void main(String Args[]) {
		Offseason off1=new Offseason();
		off1.getDiscount(1000);
	}
	

}
