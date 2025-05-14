package Programs;

import java.util.Scanner;

public class Print_Sum_of_N_Numbers {

	public static void main(String agrs[]) {
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		int sum=0;
		for(int i=1; i<=num;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
