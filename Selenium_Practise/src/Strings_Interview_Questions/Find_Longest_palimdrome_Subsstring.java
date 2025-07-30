package Strings_Interview_Questions;

public class Find_Longest_palimdrome_Subsstring {
    public static void main(String[] args) {
        String s = "babad";
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindrome
            int left1 = i, right1 = i;
            while (left1 >= 0 && right1 < s.length() && s.charAt(left1) == s.charAt(right1)) {
                left1--;
                right1++;
            }
            String odd = s.substring(left1 + 1, right1);

            if (odd.length() > longest.length()) {
                longest = odd;
            }

            // Even-length palindrome
            int left2 = i, right2 = i + 1;  //abba
            while (left2 >= 0 && right2 < s.length() && s.charAt(left2) == s.charAt(right2)) {
                left2--;
                right2++;
            }
            String even = s.substring(left2 + 1, right2);

            if (even.length() > longest.length()) {
                longest = even;
            }
        }

        System.out.println("Longest Palindromic Substring: " + longest);
        //https://www.youtube.com/watch?v=pVs1RjhmHwU&t=22s
        //https://www.youtube.com/watch?v=QfZvw8_jz1w&t=318s
        // https://www.youtube.com/watch?v=UflHuQj6MVA



    }
}
