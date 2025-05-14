package Programs;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class Ramdon_Number_Strings {
		public static void main(String agrs[]) {
			
			//Approach 1 -Apache Commons -lang api
//			String rannum=RandomStringUtils.randomNumeric(10);
//			System.out.println(rannum);
//			
//			String ranstr=RandomStringUtils.randomAlphabetic(9);
//			System.out.println(ranstr);
			
			//Aproach 2
			
			Random ran=new Random();
//			int num=ran.nextInt(9999);
//			System.out.println(num);
			//Decimal value
			double num2=ran.nextDouble();
			System.out.println(num2);
			
			//Approach 3
			System.out.println(Math.random());
		}
}
