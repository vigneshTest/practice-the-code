package com.example;

public class child implements Interfaceparent,parent2 {
	public void username() {
		String a = "Krishna";
		System.out.println(a);
		
	}
	public void password()
	{
		int b = 5678;
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		child pp = new child();
		 
		pp.username();
		pp.password();
	}
	}

