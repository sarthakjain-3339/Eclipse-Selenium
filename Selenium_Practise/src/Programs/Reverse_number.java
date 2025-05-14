package Programs;


import java.util.Scanner;

public class Reverse_number {

//	public static void main(String agrs[]) {
	//Logic 1 to Reverse a String
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int num=sc.nextInt();
//		System.out.println(num);
//		int rev=0;
//		
//		while(num!=0) {
//			rev=rev*10 + num%10;
//			num=num/10;
//		}
//		System.out.println(rev);
//		
//		
//	}
	
//	public static void main(String agrs[]) {
////	Logic 2 to Reverse a String USing StringBuffer class
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int num=sc.nextInt();
//		System.out.println(num);
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
//		System.out.println(sb.reverse());
//		
//		
//	}
	
	public static void main(String agrs[]) {
//		Logic 2 to Reverse a String USing StringBuilder class
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int num=sc.nextInt();
			System.out.println(num);
//			StringBuilder sb=new StringBuilder(String.valueOf(num));
//			System.out.println(sb.reverse());
			
			StringBuilder sb=new StringBuilder();
			sb.append(num);
			StringBuilder sb2=sb.reverse();
			System.out.println(sb2);
			
			
			
		}
}
