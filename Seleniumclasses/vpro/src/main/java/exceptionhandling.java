import java.util.Scanner;

public class exceptionhandling {
	 static String k ;

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num =sc.nextInt();
		
	
	
		/*try {
			
			System.out.println(k.length());
			
		} catch (java.lang.NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("ram");
		
*/
		try {
		int p = num/0;
			
		} catch (java.lang.ArithmeticException e) {

System.out.println("done");
}
	}

}
