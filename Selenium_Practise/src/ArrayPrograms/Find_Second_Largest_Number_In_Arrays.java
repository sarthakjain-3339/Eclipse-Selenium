package ArrayPrograms;

import java.util.Arrays;

public class Find_Second_Largest_Number_In_Arrays {
    public static void main(String[] args) {
        int[] arr1={2,48,69,7,23,41,64,77};
        Arrays.sort(arr1);
        System.out.println(arr1[arr1.length-2]);
    }
}
