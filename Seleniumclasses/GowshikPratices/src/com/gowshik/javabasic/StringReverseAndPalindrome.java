package com.gowshik.javabasic;

public class StringReverseAndPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String S = "gowshik";
String S1 = "";
for(int i = S.length()-1; i>=1; i--){
S1=S1 + S.charAt(i);}
System.out.println(S1);
	

	if(S1.equals(S))
		System.out.println("Pallindrome");
		else System.out.println("Not Pallindeome");

}
}