package Strings_Interview_Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class String_Permutation_Palindrome {
	public static void main(String agrs[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		Map<Character, Integer> countchar=new HashMap<>();
		for(char c: s.toLowerCase().toCharArray()) {
			countchar.put(c, countchar.getOrDefault(c, 0)+1);
		}
		int oddcount=0;
		for(int countnum:countchar.values()) {
			if(countnum%2!=0) {
				oddcount++;
			}
		}
		if(oddcount>1) {
			System.out.println("Not Plaindrome");
			return;
		}
		System.out.println("Palindrome");
	}
}
