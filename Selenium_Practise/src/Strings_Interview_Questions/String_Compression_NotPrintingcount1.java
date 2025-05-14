package Strings_Interview_Questions;

public class String_Compression_NotPrintingcount1 {

    public static void main(String[] args) {
            String s="abbbccccd";
            int count=1;
            StringBuilder sb=new StringBuilder();
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    count++;
                }
                else{
                    appendchar(sb,s.charAt(i-1),count);
                    count=1;
                }
            }
        appendchar(sb,s.charAt(s.length()-1),count);
            System.out.print(sb.toString());

    }
    private static void appendchar(StringBuilder sb,char ch,int count){
        if(count==1){
            sb.append(ch);
        }
        else{
            sb.append(ch).append(count);
        }

    }
}
