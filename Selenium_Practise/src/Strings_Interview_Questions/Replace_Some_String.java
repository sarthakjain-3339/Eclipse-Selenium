package Strings_Interview_Questions;

public class Replace_Some_String {
	public static void main(String agrs[]) {
		String s="\"I\" \"Love\" \"My\" \"India\"";
//		s=s.replace("\\", "");
		s=s.replace("\"", " ");
		s=s.trim();
		System.out.println(s);
//		StringBuilder sb=new StringBuilder(s);
//		StringBuilder reverse=sb.reverse();
//		System.out.println(reverse);
//		String reverse="";
//		int l=s.length();
//		for(int i=0;i<s.length();i++) {
//			char ch=s.charAt(i);
//			if(ch=='M' ||ch=='y') {
//				reverse +=s.charAt(i);
//			}
//			else {
//				reverse+=s.charAt(l-1);
//				
//			}
//			l--;
//		}
//		System.out.println(reverse);
	}
}
