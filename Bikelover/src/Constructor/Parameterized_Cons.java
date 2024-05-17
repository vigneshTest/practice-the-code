package Constructor;

public class Parameterized_Cons {

Parameterized_Cons(int a, int b) {

	System.out.println(a);
	System.out.println(b);
}
	Parameterized_Cons(String n){
		System.out.println(n);
}
public static void main(String[] args) {
	Parameterized_Cons obj = new Parameterized_Cons(10, 20);
	Parameterized_Cons ob = new  Parameterized_Cons("surya");
}
}
