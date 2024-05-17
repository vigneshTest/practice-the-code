package com.Methodover_overloading.org;

public class Overloading {
 void features (String emission) {
	System.out.println("emission-" + emission);
}
private void features(long cc) {
	// TODO Auto-generated method stub
System.out.println("cc-" + cc);
}
private void features(float RPM) {
	// TODO Auto-generated method stub
System.out.println("RPM-" + RPM);
}
public static void main(String[] args) {
	Overloading himalayan = new Overloading();
	himalayan.features("bs");
	himalayan.features(42.05f);
	himalayan.features(411);
}
}
