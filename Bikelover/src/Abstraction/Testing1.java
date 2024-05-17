package Abstraction;

public class Testing1 extends Testing {
private void project1() {
System.out.println("automation_testing");
}
@Override
	public void project() {
	System.out.println("test");
		// TODO Auto-generated method stub
		super.project();
	}
@Override
	void cases() {
System.out.println("error");		
	}

public static void main(String[] args) {
	Testing1 pro = new Testing1();
pro.project();
	pro.project1();
	pro.cases();
	
}
}
