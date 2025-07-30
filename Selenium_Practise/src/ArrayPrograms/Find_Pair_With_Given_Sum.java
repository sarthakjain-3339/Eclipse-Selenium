package ArrayPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class Find_Pair_With_Given_Sum {
    public static void main(String[] args) {
        int arr[] ={3,6,90,54,34,21};
        int large=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

                }

            }


        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);

    }
}
