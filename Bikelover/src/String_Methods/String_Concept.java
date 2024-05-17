package String_Methods;

public class String_Concept {
public static void main(String[] args) {
	String name = "manual and automation testing classes 2022    ";
	System.out.println(name);
	//length
	int length = name.length();
	System.out.println("string length="+length);
	
	String name1="TESTER";
	String name2="tester";
	String name3="developer";
	
//equals
	boolean equals = name1.equals(name2);
	System.out.println(equals);
	
	//equals ignore cases
	boolean equalsIgnoreCase = name1.equalsIgnoreCase(name2);
	System.out.println(equalsIgnoreCase);
	
	//to upper cases
	String upperCase = name2.toUpperCase();
	System.out.println(upperCase);
	
	//to lower case
	String lowerCase = name1.toLowerCase();
	System.out.println(lowerCase);
	
	// to starts with 
	boolean startsWith = name.startsWith(name);
	System.out.println(startsWith);
	
	//to ends with
	boolean endsWith = name.endsWith(name);
	System.out.println(endsWith);
	
	// concat
	String concat = name1.concat(name3);
	System.out.println(concat);
	
	//contains
	boolean contains = name.contains("a");
	System.out.println(contains);
	
	//index of
	int indexOf = name.indexOf("o");
	System.out.println(indexOf);
	
	//last index of
	int lastIndexOf = name.lastIndexOf("a");
	System.out.println(lastIndexOf);
	
	//charAt
	char charAt = name.charAt(5);
	System.out.println(charAt);
	
	//substring
	String substring = name.substring(9);
	System.out.println(substring);
	
	//empty
	boolean empty = name.isEmpty();
	System.out.println(empty);
	
	//split
	String[] split = name.split(" ");
	for (String string : split) {
		System.out.println(string);
	}
	
	//trim
	String trim = name.trim();
	System.out.println(trim);
	
	// char array
	char[] charArray = name.toCharArray();
	System.out.println(charArray);
	
	// replace
	String replace = name.replace("a", "e");
	System.out.println(replace);
	
	String replaceAll = name.replaceAll("[\\D]", "");
	System.out.println(replaceAll);
	
	String replaceAll2 = name.replaceAll("[\\d]", "");
	System.out.println(replaceAll2);
	
	String replace2 = name.replace(" ", "");
	System.out.println(replace2);
	
}
}
