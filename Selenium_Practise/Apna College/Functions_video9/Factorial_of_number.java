package Functions_video9;

import java.util.Scanner;

public class Factorial_of_number {
//	public static int arg;
	public void NumberFactorioal(int arg) {
		int fac=1;
		for(int i=1;i<=arg;i++) {
			
          fac=fac *i;
			System.out.print(fac+" ");
		}
		System.out.println(fac);
		
	}
	public static void main(String args[]) {
		Factorial_of_number n=new Factorial_of_number();
		Scanner sc=new Scanner(System.in);
//		int arg;
	   int arg=sc.nextInt();
		n.NumberFactorioal(arg);
	}
}
//1 2 6 24 24
//1 2 6 24 2410