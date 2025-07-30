package Strings_Interview_Questions;

import java.util.ArrayList;

public class Find_All_Substring {
    public static void main(String[] args) {
        String input = "abba";
        int length = input.length();
        String longest="";
        ArrayList<String> arr=new ArrayList<>();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
              arr.add(input.substring(i, j));
            }
        }
        System.out.println(arr);
        for(String a:arr){
           if(a.length()>longest.length()){
               longest=a;
           }

        }
        System.out.println(longest.length());
        System.out.println(longest);


    }
}
