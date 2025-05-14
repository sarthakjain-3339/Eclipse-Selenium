package Programs;

import java.util.Scanner;

public class Find_even_odd_count_In_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = 0;
		int evencount = 0;
		int oddcount = 0;
		int zero = 0;
		while(num>0){
			temp = num % 10;
			num = num / 10;
			if (temp == 0) {
				zero++;

			} else if (temp % 2 == 0) {
				evencount++;
			}

			else {
				oddcount++;
			}
		}
		System.out.println(evencount + "and" + oddcount + "and" + zero);
	}
}
