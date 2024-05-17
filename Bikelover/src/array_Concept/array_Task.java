package array_Concept;

import java.util.Arrays;

public class array_Task {
public static void main(String[] args) {
	int[] no = {100,254,25,540,325};
	int length = no.length;
	System.out.println("length="+length);
	Arrays.sort(no);
	for (int i = 0; i < no.length; i++) {
		System.out.println(no[i]);
	} 
		
	
	System.out.println("largest no="+no[length-1]);
	System.out.println("secnd largest no="+no[length-2]);
	System.out.println("smlest no=" +no[0]);
	
} 
}