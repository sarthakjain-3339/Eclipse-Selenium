package Pattern;

public class hollow_Rectangle {
	public static void main(String[] args) {

		/*
		 * hollow rectangle 5 column and 4 rows Pattern :1
		*****
		*   *
		*   *
		*****
		 */
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 4 || j == 1 || j == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}
}
