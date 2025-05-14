package ArrayPrograms;

public class Find_Missing_Number_In_Array {
	public static void main(String agrs[]) {
		int[] num= {1,3,5,7,4,6};
		int max=6;
		for(int i=1;i<=num.length-1;i++) {
			for(int j=1;j<=max;j++) {
				if(num[i]==j) {
					continue;
				}
				else {
					System.out.println(j);
				}
			}
		}
	}
}
