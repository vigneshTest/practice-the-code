package com.gowshik.javabasic;

public class OuterClass {
	
	int intanceVariable=10;
	static int classVariable=20;

	public static void main(String[] args) {
		//System.out.println(classVariable);
		test ();
		

	}
	  int test () {
    	System.out.println(classVariable);
		return classVariable;
    }
}