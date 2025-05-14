package Strings_Interview_Questions;

import java.util.Arrays;

public class Remove_Duplicate_charcter_Strings {
	// Find a Duplicate inside a strings  using core java
//	public static void main(String[] agrs) {
//		String s = "AppleeAppleer";
//		char[] chars = s.toCharArray();
//		int length = chars.length;
//		Arrays.sort(chars);
//		char Duplicate[] = {};
//		for (int i = 0; i < length - 1; i++) {
//			if (s.indexOf(chars[i])!=-1) {
//				
//			}
//				
//			
//		}
//	}
	

	
	
	
	public static void main(String[] args) {
        String s = "Applen";
        char[] chars = s.toCharArray();
        int length = chars.length;

        // Sort the characters so duplicates are adjacent
        Arrays.sort(chars);

        // Variable to track the last printed character
        char lastprinted = '\0';

        // Iterate until the second-to-last character
        for (int i = 0; i < length; i++) {
            // Check for duplicates and ensure the character has not been printed before
            if ((i==length-1 ||chars[i] == chars[i + 1])&& (chars[i] != lastprinted)) {
                System.out.println(chars[i]);
                lastprinted = chars[i]; // Update last printed character
            }
        }
    }

 }	
