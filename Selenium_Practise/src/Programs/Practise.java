package Programs;

public class Practise {
	public static void main(String agrs[]) {
		String s="Tom and jerry is not a good friend";
		String s2="jerry";
		
		StringBuilder str=new StringBuilder(s2);
		String reverse=str.reverse().toString();
		String output=s.replace(s2,reverse);
		
		System.out.println(output);
		
	}
}
