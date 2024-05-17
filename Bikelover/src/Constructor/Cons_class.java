package Constructor;

public class Cons_class {
	double n;
	Cons_class()
	{
		n=65.258456d;
		System.out.println("value=" + n);
	}public static void main(String[] args) {
		Cons_class co = new Cons_class();
		System.out.println("nill=" + co.n);
	}
}
