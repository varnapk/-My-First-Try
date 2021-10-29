package pack1.test;

public class Rectangle extends Shape {

	public static void main(String[] args) {
		Rectangle obj1= new Rectangle();
		obj1.area(1);
		

	}
	
	void area() {
		int length=50;
		int width=60;
		System.out.println("Area of rectangle:"+ (length*width));
	}
	
	void display() {
		System.out.println("Hello World");
		
	}

}
