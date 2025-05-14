package Programs;

public class Fibonacci_series {

	public static void main(String agrs[]) {
		int num = 20;
		int fnum = 0;
		int snum = 1;
		for (int i = 0; i < num; i++) {
			System.out.print(fnum + ",");
			int sum = fnum + snum;
			fnum = snum;
			snum = sum;

		}

	}
}	
