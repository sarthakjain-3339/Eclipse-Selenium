package Programs;

public class Searching_Element_in_Array {
	public static void main(String agrs[]) {
		int arr[]= {20,40,80,90,70};
		int searchelement=10;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==searchelement) {
				System.out.println("Element found");
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element not found");
		}
	}
}
