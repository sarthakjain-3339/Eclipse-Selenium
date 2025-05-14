package Programs;

public class Find_largest_number {

	public static void main(String[] args) {
		int a=900;
		int b=200;
		int c=2000;
//		if(a>b &&a>c)
//		{
//			System.out.println("a is greater");
//		}
//		else if(b>c) {
//			System.out.println("b is greater");
//		}
//		else {
//			System.out.println(" c is greater");
//		}
		
		//second way thorugh ternory operator
		int greatest=a>b?a:b;
		int greatest2=c>greatest?c:greatest;
		System.out.println(greatest);
		
	}

}
