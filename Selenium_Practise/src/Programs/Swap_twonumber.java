package Programs;

public class Swap_twonumber {

//	public static void main(String agrs[]) {
//		// swapping values wth third variable
//		int a = 10;
//		int b = 20;
//		int c;
//		c = b;
//		b = a;
//		a = c;
//		System.out.println(a + "values  of b" + b);
//	}
	
//	public static void main(String agrs[]) {
	//swap using + and - operator without using third variable
//		int a=40;
//		int b=20;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a +"and" + b);
//		
//	}
	
//	public static void main(String agrs[]) {
//	//swap using * and / operator without using third variable in this case value should not be 0
//		int a=63;
//		int b=89;
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		System.out.println(a +"and" + b);
//		
//	

	public static void main(String agrs[]) {
		//swap  without using third variable
			int a=63;
			int b=89;
			b=a+b-(a=b);
			System.out.println(a + "and" +b);
			
		}
}
