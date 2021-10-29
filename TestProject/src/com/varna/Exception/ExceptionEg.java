package com.varna.Exception;

import java.util.Scanner;

public class ExceptionEg {
	public static void main(String Args[]) {
		System.out.println("Start");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b= sc.nextInt();
		int c=0;
		try {
			c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
				
		System.out.println("Result:"+c);
	}

}
