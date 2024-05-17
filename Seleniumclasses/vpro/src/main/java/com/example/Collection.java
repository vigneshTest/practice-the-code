package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Collection {
public static void main(String[] args) {

	List<String> arraylist = new ArrayList<String>();
	arraylist.add("k");
	arraylist.add("tt");
	//System.out.println(arraylist);
	arraylist.get(1);
	//System.out.println(arraylist.get(1));
	arraylist.indexOf(0);
	//System.out.println(arraylist.indexOf("k"));
	List<String>anotherking=new ArrayList<String>();
	anotherking.addAll(arraylist);
	//System.out.println(anotherking);
	//anotherking.remove(0);
	//System.out.println(anotherking);
	ListIterator<String>kk=arraylist.listIterator();
	
	for (int i = 0; i < arraylist.size(); i++) {
		int k=i+1;
		System.out.println(arraylist.get(arraylist.size()-k));
	}
	//System.out.println(arraylist);
	
}
}
