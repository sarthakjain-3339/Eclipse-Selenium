package interview;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//Find subarray with sum 0
//[3,9,3,4,-7,6,3,2]
public class Test1 {
    public static void main(String[] args) throws java.lang.Exception {
        String s = "java test";
        String[] s2 = s.split(" ");
        int l = s2.length;
        String reverse = "";
        System.out.println(l);
        for (int i = 0; i < l; i++) {
            String word = s2[i];
            for (int j = word.length() - 1; j >= 0; j--) {
                reverse += word.charAt(j);
            }
            reverse = reverse + " ";
        }
        System.out.print(reverse);


    }
}
