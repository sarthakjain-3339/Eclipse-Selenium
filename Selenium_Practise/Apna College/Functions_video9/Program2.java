package Functions_video9;

import java.util.Scanner;

//Note: Write a function to print the sum of all odd numbers from 1 to n.
public class Program2 {
	public void sumodd() {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}

		}

		System.out.println(sum);
	}

	public static void main(String args[]) {
		Program2 p1 = new Program2();
		p1.sumodd();

	}
}
