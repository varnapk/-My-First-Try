package com.varna.abstra;

public class MainAbstractEg extends BaseAbstractEg {
	
	@Override
	public void display() {
		System.out.println("Abstract class defined");
	}

	public static void main(String[] args) {
		BaseAbstractEg obj1=new MainAbstractEg();
		obj1.display();
		obj1.getPrint();
	

	}

}
