package ArrayPrograms;

import java.util.Arrays;

public class Find_Second_Largest_Number_In_Arrays {
    public static void main(String[] args) {
        int[] arr={2,22,218,28};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        if(arr.length<=2){
            System.out.println("Invalid input");
            return;
        }
        for(int num:arr){
            if(num>first){
               second=first;
               first=num;
            } else if (num>second && num!=first) {
                second=num;
            }
        }
        System.out.println(second);
    }
}
