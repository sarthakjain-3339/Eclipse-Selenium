package Strings_Interview_Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Find_Each_character_Count {
	public static void main(String agrs[]) {
		String s="This is sarthak jain testing";
		Map<Character, Integer> counteachchar=new HashMap<>();
		for(char c:s.toCharArray()) {
			counteachchar.put(c, counteachchar.getOrDefault(c, 0)+1);
		}
			System.out.println(counteachchar.entrySet());
		for(Map.Entry<Character, Integer> c:counteachchar.entrySet() ) {
			if(c.getValue().equals(2)) {
				System.out.println();
			}
		}
//		System.out.println(counteachchar.entrySet());;
//		System.out.println(counteachchar.get("T"));;
//		System.out.println(counteachchar.entrySet());;
//		System.out.println(counteachchar.entrySet());;
//		System.out.println(counteachchar.entrySet());;
//		System.out.println(counteachchar.entrySet());;
//		System.out.println(counteachchar.entrySet());;
		
	}
}
