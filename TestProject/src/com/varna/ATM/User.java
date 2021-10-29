package com.varna.ATM;

import java.util.Scanner;

public class User {
	public static void main(String Args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your pin");
		int pin1=sc.nextInt();
		Bank bank1=new Bank();
		bank1.setPin(pin1);
		bank1.validatePin();
		
	}

}
