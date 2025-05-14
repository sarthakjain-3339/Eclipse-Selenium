package Programs;

import java.util.Scanner;

public class Number_prime_or_not {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		if (num <= 1) {
			System.out.println("Number is not prime");
		}
		if (num > 2) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}
			if (count == 2)
				System.out.println(num + "Prime number");
			else
				System.out.println(num + "Number is not prime");

		}

	}
}
