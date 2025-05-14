package Strings_Interview_Questions;

import java.util.LinkedHashMap;
import java.util.Map;

//Note: This code work will fine if we want to print the count of 1 char also
// Input: "aabcccccaaa" → Output: "a2b1c5a3
public class String_Compression_Algorithm {
    public static void main(String[] args) {
    String s="abbbccccd";
    int count=1;
    StringBuilder sb=new StringBuilder();
    for(int i=1;i<s.length();i++){
        if(s.charAt(i)==s.charAt(i-1)){
            count++;
        }
        else{
           sb.append(s.charAt(i-1)).append(count);
           count=1;
        }
    }
    sb.append(s.charAt(s.length()-1)).append(count);
    System.out.print(sb.toString());


    }
}
