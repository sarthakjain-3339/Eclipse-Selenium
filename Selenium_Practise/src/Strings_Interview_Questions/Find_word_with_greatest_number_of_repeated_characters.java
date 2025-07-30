package Strings_Interview_Questions;

import java.util.HashMap;
import java.util.Map;

public class Find_word_with_greatest_number_of_repeated_characters{
    public static void main(String[] args) {
        String s="India is greatest World successsfully";
        String[] words=s.trim().toLowerCase().split(" ");

        int max=0;
        String large="";
        for(String word:words){
            Map<Character, Integer> count=new HashMap<>();
            int local=0;
            for(char ch:word.toCharArray()){
                count.put(ch, count.getOrDefault(ch,0)+1);
                if(count.get(ch)>max){
                    local=count.get(ch);
                }
            }
            if(local>max){
                max=local;
                large=word;
            }
            System.out.println(count.entrySet());
        }
        System.out.println(large);
    }
}
