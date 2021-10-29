package com.varna.ExampleThrows;

public class ThrowsEg {
     void divisibleBy() {
    	 int a=10/0;
    	 System.out.println("Test");
     }
     public static void main(String Args[])throws Exception {
    	 ThrowsEg obj=new ThrowsEg();
    	 try {
    	 obj.divisibleBy();
    	 }
    	 catch(Exception e) {
    		 System.out.println(e);
    	 }
    	 System.out.println("End");
    	 
     }
}
