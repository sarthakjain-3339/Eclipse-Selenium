package Pattern;

public class Half_pyramid {

	public static void main(String[] args) {

		/* Half pyramid
		 * Pattern :1
		*
		**
		***
		****
		 */
		for (int i =1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
