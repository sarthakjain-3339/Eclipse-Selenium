package Practise;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Find_occurance {

	public static void main(String agrs[]) {

		String str="This is sarthak jain blog";
		Map<Character, Integer> charCountMap = new LinkedHashMap<>();
		// Count the frequency of each character
		for (char c : str.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}

		// Find the first character with a frequency of 1
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
//			if (entry.getValue() == 2) {
				System.out.println("character" +entry.getKey() + "count" +entry.getValue()); 
//			}

		}

	}
}



