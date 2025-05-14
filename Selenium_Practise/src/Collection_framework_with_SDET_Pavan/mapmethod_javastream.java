package Collection_framework_with_SDET_Pavan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapmethod_javastream {
	public static void main(String[] args) {
		List<String> vichle=Arrays.asList("bus", "aar", "flight", "train" ,"sugar");
		
		
		List<Integer> vichlesuppercase=Arrays.asList();;;;;;;;;;;;;;;;
//		vichlesuppercase=vichle.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
//		System.out.println(vichlesuppercase);
		
		//Find the lenght of every string in the list
		
		/*for(String s:vichle) {
			System.out.println(s.length());;
		}*/
//		noe do the same thing with java streams
	
		vichlesuppercase=vichle.stream().map(a->a.length()).collect(Collectors.toList());
		System.out.println(vichlesuppercase);
	}
	
}
