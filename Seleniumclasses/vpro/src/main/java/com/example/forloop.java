package com.example;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String []name = {"a","b","c","d","e","f","g"};
int p = name.length;
System.out.println(p);
for (int i = 0; i < name.length; i++) {
	System.out.println(name[i]);
	if (name[i]=="e") {
		break;
	

	}
}
	}

}
