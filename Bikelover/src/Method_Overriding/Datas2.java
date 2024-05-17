package Method_Overriding;

public class Datas2 extends Datas{
@Override
public void type() {
	System.out.println("error");
	super.type();
}
@Override
	public void type1() {
	System.out.println("error");
		super.type1();
	}
private void type3() {
System.out.println("syntax");
}
public static void main(String[] args) {
	Datas2 list = new Datas2();
	list.type();
	list.type1();
	list.type3();
}
}
