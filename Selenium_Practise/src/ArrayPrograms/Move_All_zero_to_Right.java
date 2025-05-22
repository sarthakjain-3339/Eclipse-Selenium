package ArrayPrograms;

import java.util.Arrays;

public class Move_All_zero_to_Right {
    public static void main(String[] args) {
        int[] arr = {2, 0, 9, 7, 6, 0, 9, 0};
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];   // we can add ++ here also like this arr[index++]=arr[i]
                index++;
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;         // we can add ++ here also like this arr[index++]=0
//                index++;
        }
        System.out.println(Arrays.toString(arr));  // we can use for each loop to iterate the array
    }
}
