package JavaPractise;

import java.util.ArrayList;

public class Arraylist {
	int a;
	public static void main(String [] args) {
		
        ArrayList<String> ref=new ArrayList<String>();// We can remove the string also 
//        ref.add("Sarthak");
        ref.add("12345");
//        ref.add("Jain");
//        ref.add("Company");
//        ref.add("Sprinklr");
        System.out.println(ref.size());
        for(String s: ref){
        	System.out.println(s);
        }
    //    ref.remove("Company");
       
      System.out.println(ref.size());
       // System.out.println(ref);
       // ref.remove(1);
       // System.out.println(ref);
      
	}

}
