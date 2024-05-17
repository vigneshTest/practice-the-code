package com.example;

public class methodoverloading {
	private void addition(int a,int b) {
		int c = a+b;
		System.out.println(c);

	}

	public static void main(String[] args) {
methodoverloading uu = new methodoverloading();
uu.addition(7, 8);
uu.addition(9,9);
	}

}
