package Pattern;

public class Reverse_half_pyramid_number {
	public static void main(String[] args) {

		/* Inverted Half pyramid with number
		 * Pattern :1
		12345
		1234
		123
		12
		1
		 */
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
