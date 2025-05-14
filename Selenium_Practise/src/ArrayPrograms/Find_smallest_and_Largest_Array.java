package ArrayPrograms;

public class Find_smallest_and_Largest_Array {
    public static void main(String[] args) {
        int[] arr = {98,101,98,76,12,30};
        int smallnum=arr[0];
        int largestnum=arr[0];
        for(int c:arr){
            if(smallnum>c){
                smallnum=c;
            } if (largestnum<c) {
                largestnum=c;
            }
        }
        System.out.println("smallest:"+smallnum +" "+ "largest:"+ largestnum);

    }
}
