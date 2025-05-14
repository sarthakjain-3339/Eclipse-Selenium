package Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Find_largest_smallest_in_array {
	public static void main(String args[]) {
		int[] arr= {12,76,10,56,85,9,9};
		int min=arr[0];
		int max=arr[0];
		for(int a:arr) {
			if(a<min) {
				min=a;
			}
			if(a>max) {
				max=a;
			}
		}
		
		
		System.out.println(min +"sj "+max);

	}

}
