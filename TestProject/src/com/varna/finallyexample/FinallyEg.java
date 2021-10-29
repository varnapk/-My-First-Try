package com.varna.finallyexample;

import java.util.Scanner;

public class FinallyEg {
	public static void main(String Args[]) {
		System.out.println("Start");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the numbers");
		int a=sc.nextInt();
		int b= sc.nextInt();
		int arr[]=new int[5];
		int c=0;
		try {
			arr[1]=a/b;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("End of Program");
		}
				
		System.out.println("Result:"+c);
	}

}
