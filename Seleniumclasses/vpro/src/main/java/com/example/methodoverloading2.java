package com.example;

public class methodoverloading2 extends methodoverriding {
	@Override
	public void addition(int a, int b) {
int c = a*b;
System.out.println(c);
super.addition(a, b);
	}


	public static void main(String[] args) {
methodoverloading2 tt = new methodoverloading2();
tt.addition(8,8);
	}

}
