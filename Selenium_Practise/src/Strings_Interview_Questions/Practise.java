package Strings_Interview_Questions;

import java.util.HashSet;

public class Practise {
	public static void main(String agrs[]) {
		String s = "My name is Sarthak jain";
		// StringBuilder reverse=new StringBuilder(s);
		// reverse.replace(" ", " 0");
//		String ne = s.replace(" ", "0");
//		System.out.println(ne);

		HashSet<String> see = new HashSet<>();
		HashSet<String> duplicate = new HashSet<>();
		for (char c : s.toCharArray()) {
			if (!see.contains(s.valueOf(c))) {
				see.add(s.valueOf(c));
			} else {
				duplicate.add(s.valueOf(c));
			}
		}
		System.out.println(duplicate);

	}
}
