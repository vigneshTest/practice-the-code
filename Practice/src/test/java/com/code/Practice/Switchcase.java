package com.code.Practice;

public class Switchcase {

	public static void main(String[] args) {

		
		
		int day =12;
		switch (day) {
		case 1:
		    System.out.println("yes0");
		case 2:
			System.out.println("today");
		case 3:
		System.out.println("tomo");
		break;
		default:
			System.out.println("exit form the case");
		
			
			/*
			 * switch case using string
			 */

			String day1 ="tomo";
			switch (day1) {
			case "tomo":
			    System.out.println("yes");
			    break;
			case "tody":
				System.out.println("no");
			case "after day":
			System.out.println("tomo");
			break;
			default:
				System.out.println("exit form the case");
			}
				
			
			
		}
		
	}

}
