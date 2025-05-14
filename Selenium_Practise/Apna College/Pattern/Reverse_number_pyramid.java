package Pattern;

public class Reverse_number_pyramid {
	/*654321
	 *54321
	 *4321
	 *321
	 *21
	 *1
	 */
	
    public static void main(String agrs[]) {
    	for(int i=6;i>0;i--) {
    		for(int j=i;j>0;j--) {
    			System.out.print(j +" ");
    		}
    		System.out.println("");
    	}
    }
}
