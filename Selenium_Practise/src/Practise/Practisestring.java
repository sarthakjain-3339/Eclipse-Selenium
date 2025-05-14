package Practise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Practisestring {
	public static char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a frequency of 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
            
        }
        return '_';
	}


	public static void main(String agrs[]) {

		String s="aaff";
		char rev=findFirstNonRepeatingChar(s);
		System.out.println(rev);










		//        HashSet<Character> see=new HashSet<>();
		//        HashSet<Character> duplicate=new HashSet<>();
		//        for(char se:s.toCharArray()) {
		//        	if(!see.contains(se)) {
		//        		see.add(se);
		//        	}
		//        	else {
		//        		duplicate.add(se);
		//        	}
		//        	
		//        }
		//        System.out.println(duplicate);
		//		






		//		System.out.println(s.length());
		//		String newreverse="";
		//		for(int i=s.length()-1;i>=0;i--) {     
		//			newreverse+=s.charAt(i);
		//			
		//		}
		//		System.out.println(newreverse);





		//		String[]sarr=s.split(" ");
		//		StringBuilder sb=new StringBuilder();
		//		for(String sr:sarr) {
		//			if(!sr.equals("good")) {
		//			sb.append(new StringBuilder(sr).reverse()).toString();
		//			sb.append(" ");
		//			}
		//			else
		//			{
		//				sb.append(sr);
		//				sb.append(" ");
		//			}
		//			
		//		}
		//		System.out.println(sb);
	}
}
