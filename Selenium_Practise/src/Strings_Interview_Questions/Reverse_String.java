package Strings_Interview_Questions;

import java.util.Arrays;

public class Reverse_String {
	
	/*//Reverse the string basic program
	public static void main(String agrs[]) {
		String s="Sprinklr";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse +=s.charAt(i);
			
		}
		System.out.println(reverse);
	}*/
	
	
	//Reverse the String using array
//	public static void main(String agrs[]) {
//		String s="Sprinklr";
//		char[] chars=s.toCharArray();
//		int lng=chars.length;
//		char[]reverse=new char[chars.length];
//		for(int i=0;i<=lng-1;i++) {
//			reverse[i]=chars[chars.length-1-i];
//			
//		}
//		System.out.println(reverse);
//	}
	//Reverse the String using array with simple method
//	public static void main(String agrs[]) {
//		String s="Sprinklr";
//		char[] chars=s.toCharArray();
//		int lng=chars.length;
//		
//		String reverse="";
//		for(int i=lng-1;i>=0;i--) {
//			reverse=reverse+chars[i];
//			
//		}
//		System.out.println(reverse);
//	}
	
	public static void main(String agrs[]) {
		String s="Sprinklr";
		StringBuffer sb= new StringBuffer(s);
		System.out.println(sb.reverse());
	}
}
