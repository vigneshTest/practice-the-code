package Varibales;

public class Local_Global_Static{
	private void local_vari() {
		// TODO Auto-generated method stub
String name = "surya";
System.out.println("name:" + name);
	}
	float num;
	private void global_vari() {
		// TODO Auto-generated method stub
		num=99.9f;
System.out.println("value:" + num);
	}
	static char n = 'k';
	//static block
	static {
		System.out.println("list");
	}
	public static void main(String[] args) {
		Local_Global_Static variables = new Local_Global_Static();
		Local_Global_Static vari = new Local_Global_Static();
		variables.local_vari();
		vari.global_vari();
		System.out.println(n);
	}
}
