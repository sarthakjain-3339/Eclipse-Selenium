package Programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Verify_Array_Is_Equals {
		public static  void main(String agrs[]) {
//			Approach 1 to verify array is equal or not 
//			int a[]= {1,3,5};
//			int b[]= {1,3,5,7};
//			boolean c=Arrays.equals(a, b);
//			System.out.println(c);
			
			//Aproach 2 to verify array is equal or not : Fisrt we have check the lenght of both the array and then we can check the each element

			int ar1[] = { 5, 6, 7 };
			int ar2[] = { 5, 6, 7,9 };
			int ar1lenght = ar1.length;
			int ar2lenght = ar2.length;
			boolean result = true;
			if (ar1lenght == ar2lenght) {
				for (int i = 0; i < ar1lenght; i++) {
					if (ar1[i] != ar2[i]) {
						result = false;
						break;
					}
				}
			} else {
				result = false;
			}
			System.out.println(result);
		}
}
