package Using_this_keyword;

public class This_Keyword_ex {
char x,z;
public This_Keyword_ex(char x,char z) {
this.x=x;
this.z=z;
}
public static void main(String[] args) {
	This_Keyword_ex key = new This_Keyword_ex('K', 'V');
		System.out.println("value of x:" + key.x  +" andvalue of z:" +key.z);
}
}
