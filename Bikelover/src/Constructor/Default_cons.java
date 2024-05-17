package Constructor;

public class Default_cons {
String n = "surya";
int a = 10;
char b= 'h';
float c= 10.5f;
public static void main(String[] args) {
	Default_cons def = new Default_cons();
	System.out.println("name:" + def.n);
	System.out.println("a=" + def.a);
	System.out.println("b=" + def.b);
	System.out.println("c=" + def.c);
}
}
