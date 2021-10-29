package com.varna.ATM;

public class Bank {
	private int pin;
	public void setPin(int pin) {
		this.pin=pin;
	}
	public void validatePin() {
		if(pin==1001||pin==1234||pin==1212) {
			System.out.println("Pin is valid");
		}
		else {
			System.out.println("Pin is not valid");
		}
	}

}
