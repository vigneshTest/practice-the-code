package Looping_Methods;

public class Nested_For_Loop {
	public static void main(String[] args) {
		int year =2;
		int mnths =12;
		int week = 4;
		for(int i=1;i<=year;i++)
		{System.out.println("a year=" + i);
		for(int j=1;j<=mnths;j++)
		{System.out.println("mnths="+j);
		for(int k=1;k<=week;k++)
		{System.out.println("week="+k);
		}
		}
		}
	
	}

}
