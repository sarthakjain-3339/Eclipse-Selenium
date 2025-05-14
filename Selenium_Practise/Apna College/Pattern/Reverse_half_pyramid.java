package Pattern;

public class Reverse_half_pyramid {
	public static void main(String[] args) {

		/* Reverse Half pyramid
		 * Pattern :1
		****
		***
		**
		*
		 */
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
