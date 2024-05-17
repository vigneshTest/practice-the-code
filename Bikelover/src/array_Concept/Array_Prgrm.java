package array_Concept;

public class Array_Prgrm {
	public static void main(String[] args) {
		int[] num = {5,8,3,5,7,-65};
		int sum=0;
		double avg;
		for(int numb:num) {
			sum=sum+numb;
		
	}
	int length = num.length;
	System.out.println("lenght="+length);
	System.out.println(sum);
	avg=(float)sum/(float)length;
	System.out.println("avg="+avg);

	}	
}
