package Strings_Interview_Questions;

import java.util.HashMap;
import java.util.HashSet;

public class Reverse_word_String {
	public static void main(String agrs[]) {
      String s="Ihave Love My India";
      String[] word=s.split(" ");
//      HashMap<String, Integer> duplicate=new HashMap<String, Integer>();
      StringBuilder reverse=new StringBuilder();
      for(String words: word) {
    	  reverse.append(new StringBuilder(words).reverse());
    	  reverse.append(" ");
      }
      System.out.println(reverse);
	}
}

//evahIevoLyMaidnI