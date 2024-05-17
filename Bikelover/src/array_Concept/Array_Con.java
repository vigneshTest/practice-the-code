package array_Concept;

import java.util.Arrays;

public class Array_Con {
public static void main(String[] args) {
	int[] numb= {30,85,65,45,35};
	int length = numb.length;
	System.out.println("length="+length);
	System.out.println("values");
	for (int i = 0; i < numb.length; i++) {
		System.out.println(numb[i]);
	
}
	System.out.println("list");//ascending
	Arrays.sort(numb);
	for (int i = 0; i < numb.length; i++) {
		System.out.println(numb[i]);
		
	}
	System.out.println("list2");//descending
	for (int i =numb.length-1;i>=0; i--) {
		System.out.println(numb[i]);
	}
}
}
