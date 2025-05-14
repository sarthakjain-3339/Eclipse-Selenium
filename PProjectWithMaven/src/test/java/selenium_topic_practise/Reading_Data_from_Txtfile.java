 package selenium_topic_practise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Reading_Data_from_Txtfile {
	public static void main(String agrs[]) throws FileNotFoundException {
		String s="C:\\Users\\ADMIN\\eclipse-selenium\\PProjectWithMaven\\Files\\Test.txt";
		FileReader f=new FileReader(s);
		Scanner sc=new Scanner(f);
		sc.useDelimiter(",");
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		
		
		
		
		
	}
}
