package com.varna.divisibleby10;

public class DivisibleBy10 extends Addition {
	public void getDivisible() {
		int d= super.calculateAdditionResult(10,25);
		
		if(d%10==0) {
			System.out.println("Addition Result "+d+" is divisible by 10");
		}
		else {
			System.out.println("Addition Result "+d+" is not divisible by 10");
			
		}
			
			
	}

	public static void main(String[] args) {
	DivisibleBy10 obj1=new DivisibleBy10();
	obj1.getDivisible();
		

	}

}
