package Strings_Interview_Questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Print_first_non_repeating_char {
	public static void main(String agrs[]) {
		String s="This is Sarthak jain Channel";
		String mains=s.trim().toLowerCase();
		
		Map<Character, Integer> count=new LinkedHashMap<>();
		for(char c: mains.toCharArray()) {
			count.put(c, count.getOrDefault(c, 0)+1);
		}
		for(char c:count.keySet()) {
			System.out.print(c);
//			if(count.get(c)==1) {
//				System.out.println(c);
//				return;
//			}
		}
//		System.out.println(mains);
//		Set<Character> firstnonrepc=new HashSet<>();
//		Set<Character> see=new HashSet<>();
//		
//		for(char c:mains.toCharArray()) {
//			if(see.contains(c)) {
//				firstnonrepc.add(c);
//			}
//			else {
//				see.add(c);
//			}
//		}
////		System.out.println(see);
//		for(char c:see) {
//			if(see.contains(c)!=firstnonrepc.containsAll()) {
//				System.out.println(c);
//			}
//		}
	}
}
