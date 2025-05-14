package Programs;
//
//import Programs.Count_Digit_In_number.Base;
//import Programs.Count_Digit_In_number.DeriDerived;
//import Programs.Count_Digit_In_number.Derived;

/*
 * Half pyramid Pattern :1
    *
   **
  ***
 ****
 */
public class Base {
	public static void main(String[] args) {
		for(int i=5;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}
}


	

