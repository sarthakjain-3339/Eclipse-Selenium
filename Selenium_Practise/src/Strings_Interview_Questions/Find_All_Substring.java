package Strings_Interview_Questions;

public class Find_All_Substring {
    public static void main(String[] args) {
        String input = "abc";
        int length = input.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
               System.out.println(input.substring(i, j));

            }
        }


    }
}
