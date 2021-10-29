package com.varna.studentdetails37;

public class StudentDetails37 {
	String name;
	int roll;
	String address;
	String studentdetails;
	public void setStudentDetails(String nam1,int rolno,String address) {
		
	name=nam1;
	roll=rolno;
	this.address=address;
	studentdetails="NAME:"+nam1+","+"ROLL NO:"+rolno+","+"ADDRESS:"+address;
	}
	public void getStudentDetails() {
		
		System.out.println("Student details are:"+studentdetails);
		
	}
	public static void main(String Args[]) {
		
		StudentDetails37 student1=new StudentDetails37();
		StudentDetails37 student2=new StudentDetails37();
		Address address1=new Address("house1","Kannur","Kannur");
		Address address2=new Address("House2","Iringal","Iringal");
		student1.setStudentDetails("name1",1, address1.getAddress());
		student2.setStudentDetails("name2",2,address2.getAddress());
		student1.getStudentDetails();
		student2.getStudentDetails();
	}
	
}
