package Programs;

import java.util.Scanner;

public class Count_Digit_In_number {


	public static void main(String aggs[]) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
         count = count+1;
		}
		System.out.println(count);
	}
	
	
	
	
	
	
	
}
