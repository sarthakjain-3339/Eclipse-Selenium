package Collection_framework_with_SDET_Pavan;

import java.util.ArrayList;

interface Cab {
	void travel();
}

//normal implementation with class
//class Uber implements Cab{
//	public void travel() {
//		System.out.println("Going for a travel");
//	}
//}
//()->System.out.println("Going for a travel");
public class Demo1 {
	/*
	 * @FunctionalInterface interface sub1 { void sum1();
	 * 
	 * }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// normal implementation with class
		// Cab tr=new Uber();
		// tr.travel();
		Cab tr = () -> System.out.println("Going for a travel");
		tr.travel();

	}

}
