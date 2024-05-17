package Interface;

public class Imp_Superclass implements Imp_Class,Imp_subclass {
@Override
public void trainer() {
	// TODO Auto-generated method stub
	String name = "nisha";
System.out.println("trainer:" + name);	
}
@Override 
	public void batchmates() {
		// TODO Auto-generated method stub
	int n = 3;
	System.out.println("batchmates:" + n);	
	}
public static void main(String[] args) {
	Imp_Superclass stud = new Imp_Superclass();
	stud.batchmates();
	stud.trainer();
}
}
