package Strings_Interview_Questions;

import java.util.HashMap;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Find_String_is_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Aant";
		String s2="Anpt";
		if(s1.length()!=s2.length())
			System.out.println("Not Anagram");
		HashMap<Character, Integer> countchar=new HashMap<>(); 
		for(char c:s1.toLowerCase().toCharArray()) {
			countchar.put(c, countchar.getOrDefault(c, 0)+1);
		}
		//		System.out.println(countchar.values());
		//		System.out.println(countchar.entrySet());
		for(char c:s2.toLowerCase().toCharArray()) {
			if(!countchar.containsKey(c)|| countchar.get(c)==0) {
				System.out.println("Not Anagram");
				return;
			}
			countchar.put(c, countchar.get(c)-1);
		}
		
		for(int s:countchar.values()) {
			if(s!=0) {
				System.out.println("not anagram");
				return;
			}
			
		}
		System.out.println("Anagram");


	}

}
