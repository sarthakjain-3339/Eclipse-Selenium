package Strings_Interview_Questions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Remove_char_space_duplicated_and_Numbersum {
	public static void main(String args[]) {
		String s="This@  $7d7494@";
//		Scanner sc=new Scanner(System.in);
//		String s=sc.next();
//		String s="24^%$1!8897(0 \"\"76452";
		int sumall=0;
		Set<Integer> sum=new HashSet<>();   //we can't use set here because it does not allow duplicates
		
		for(char c:s.toCharArray()) {
			if(Character.isDigit(c)) {
				sum.add(Character.getNumericValue(c));
			}
		}
		System.out.println(sum);
		for(int sm: sum) {
			sumall+=sm;
		}
		System.out.println(sumall);
	}
}
