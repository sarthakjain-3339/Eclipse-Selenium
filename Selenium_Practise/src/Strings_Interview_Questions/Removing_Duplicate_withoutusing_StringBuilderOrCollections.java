package Strings_Interview_Questions;

public class Removing_Duplicate_withoutusing_StringBuilderOrCollections {
    public static void main(String agrs[]) {
        //Removing duplicates in string without using string builder or collections
        String s="This is practise";
        s=s.toLowerCase().replaceAll("\\s+", "");
        String unique="";
        String duplicate="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(unique.indexOf(ch)==-1){
                unique +=ch;
            }
            else{                          //if we want to print the duplicate char only once use this else if (dup.indexOf(ch) == -1) {
                duplicate +=ch;
            }
        }
        System.out.println(duplicate);
        System.out.println(unique);

    }
}
