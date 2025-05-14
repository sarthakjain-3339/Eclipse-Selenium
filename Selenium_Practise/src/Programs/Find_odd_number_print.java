package Programs;

import java.util.Scanner;

public class Find_odd_number_print {
	public static void main(String agrs[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num= sc.nextInt();
		int sum=0;
		for(int i=1; i<=num;i++) {
			if(i%2!=0) {
				System.out.println(i);
				sum=sum+i;
			}
			
		}
		System.out.println(sum);
	}
}
