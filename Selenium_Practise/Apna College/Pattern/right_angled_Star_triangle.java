package Pattern;
/*
 
*****
 ****
  ***
   **
    *
    
   */
public class right_angled_Star_triangle {
	public static void main(String agrs[]) {
		for(int i=1;i<=5;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
