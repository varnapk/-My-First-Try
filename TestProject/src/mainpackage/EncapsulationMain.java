package mainpackage;

import subpackage.Encapsulation;

public class EncapsulationMain {

	public static void main(String[] args) {
		Encapsulation en1=new Encapsulation();
		en1.setA(10);
		en1.setB(100);
		System.out.println(en1.getA());
		System.out.println(en1.getB());

	}

}
