package Programs;

import java.util.Scanner;

//Take an array as input from a user. Search for a given number x and print the index at which occurs
public class Array_print_number_location {
	public static void main(String args[]) {
     
		Scanner inpt=new Scanner(System.in);
		int arraysize=inpt.nextInt();
		int[] num=new int[arraysize];
		for(int i=0;i<arraysize;i++) {
			num[i]=inpt.nextInt();
		}
		int x=3;
		System.out.println(num.length);
		for(int i=0;i<=num.length;i++) {

			if(num[i]==x) {
				System.out.println(i);
				break;
			}
			
		}


	}
}
