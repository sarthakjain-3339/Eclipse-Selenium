package Collection_framework_with_SDET_Pavan;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<Integer> ar= new ArrayList();
		ar.add(23);
		ar.add(26);
		ar.add(85);
		ar.add(96);
		ar.add(22);
		ar.add(16);
       Predicate<Integer> ir=i->i>20;
       Predicate<Integer> ir2=i->i%2==0;
       for(int i:ar) {
    	   if(ir.and(ir2).test(i)) {
    		   System.out.println(i);
    	   }
       }
       
	}

}
