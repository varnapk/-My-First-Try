package com.varna.discountt38;

public class Offseason extends Onseason{
	public void getDiscount() {
		System.out.println("Offseason discount is 15%");
		super.getDiscount();
	}
	public static void main(String Args[]) {
		Onseason obj1=new Offseason();
		obj1.getDiscount();
	}

}
