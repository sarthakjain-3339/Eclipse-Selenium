package ArrayPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Print_countOfPossible_Anagram {
    public static void main(String[] args) {
        String s="aa aa odg dog dog gdo";

        String[] words = s.split(" ");
        int countofAnagram=0;
       Map<String, Integer> anagram=new HashMap<>();
       for(String word:words){
           char[] c=word.toCharArray();
           Arrays.sort(c);
           String sortedstring=new String(c);
           anagram.put(sortedstring, anagram.getOrDefault(sortedstring,0)+1);
       }

       for(int count:anagram.values()){
           if(count>1){
               countofAnagram +=(count-1);
           }
       }
        System.out.println(countofAnagram);










//        aproach 1 normal approach
//        String[] s2=s.toLowerCase().split(" ");
//        int count=0;
//        for(int i=0;i<s2.length;i++){
//            char[] arr=s2[i].toCharArray();
//            Arrays.sort(arr);
//            for(int j=i+1;j<s2.length;j++){
//                char[] arr2=s2[j].toCharArray();
//                Arrays.sort(arr2);
//                if(Arrays.equals(arr,arr2)){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//      Appraoch 1 end here
    }
}
