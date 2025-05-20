package Strings_Interview_Questions;

public class Reverse_char_In_Word_UsingForLoop {
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
