package Programs;

import java.util.Scanner;

public class Palindrome_Number_program {
   
	public static void main(String agrs[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int originalnum=num;
		int rev=0;
		while(num!=0) {
			int temp= num%10;
			rev=rev*10 +temp;
			num=num/10;	
		}
		
		if (originalnum==rev) {
			System.out.println("Number is palindrome ");
		}
		else {
			System.out.println("Number is not plaidrome");
		}
	}
}
