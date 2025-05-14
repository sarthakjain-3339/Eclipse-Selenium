package ArrayPrograms;

import java.util.Arrays;

public class Check_Array_is_EqualOrNot {
    public static void main(String[] args) {
        int[] arr1={2,4,6,7};
        int[] arr2={2,4,6,7};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(!(arr1.length==arr2.length)){
            System.out.println("Not Equal");
        }


    }
}
