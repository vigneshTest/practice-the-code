package Using_this_keyword;

public class This_Method {
char initial;
String name;
int rollno;
float percentage;
public This_Method(float percentage) {
	this(125);
	
	System.out.println("percentage=" + percentage);
}
public This_Method(int rollno) {
	this("vicky");
       	System.out.println("rollno=" + rollno);
}
public This_Method(String name) {
this('p');
	System.out.println("name=" + name);
}
public This_Method(char initial) {
	System.out.println("initial= " +  initial);
}
public This_Method() {
	this(75.5f);
	
}
public static void main(String[] args) {
	This_Method key = new This_Method();
	
}
}
