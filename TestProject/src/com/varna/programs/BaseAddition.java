package com.varna.programs;

public class BaseAddition {
	public static void main(String Args[]) {
		Vehicle v1=new Vehicle();
		v1.setProperty("Red", "12345");
		v1.printColor();
	
		
	}
 
	

}

class Vehicle{
	String color;
	String number;
	public void setProperty(String c,String c1 ){
		this.color=c;
		this.number=c1;
		
	}
	public String getColor() {
		return this.color;
		
	}
	public void printColor() {
		String a=this.getColor();
		System.out.println("My color is "+a);
	}
	
}
