package ArrayPrograms;

import java.util.LinkedHashSet;
import java.util.Set;
// This approach is correct also we can do this with MAP and count tha char if count is greater than 1 then it's duplicate
public class Find_duplicate_In_Array {
    public static void main(String[] args) {
        int[] arr={9,5,6,5,0,9,-7,4,-2};
        Set<Integer> see=new LinkedHashSet<>();
        Set<Integer> duplicate=new LinkedHashSet<>();
        for(int c:arr){
            if(see.contains(c)){
                duplicate.add(c);
            }
            else{
                see.add(c);
            }
        }
        System.out.println(duplicate);
        System.out.println(see);

    }

}
