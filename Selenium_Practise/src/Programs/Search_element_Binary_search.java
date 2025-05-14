package Programs;

public class Search_element_Binary_search {
	public static void main(String agrs[]) {
		int arr[]= {10,40,50,60,80,90,100};
		int searchelement=60;
//		System.out.println(arr.length);
		int midnum=(0+arr.length)/2;
		if(searchelement>=arr[midnum]) {
			for(int i=midnum;i<arr.length;i++) {
				if(arr[i]==searchelement) {
					System.out.println("Element found in first loop");
					break;
				}
			}
		}
		else {
			for(int i=0;i<midnum-1;i++) {
				if(arr[i]==searchelement) {
					System.out.println("Element found in second loop");
					break;
				}
			}
		}



	}
}