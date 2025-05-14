package Collection_framework_with_SDET_Pavan;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1_Java_Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(10,15,29,26,30);
		List<Integer> evennum=Arrays.asList();
		
		//evennum=numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
		numbers.stream().filter(i->i%2==0).forEach(n->System.out.println(n)); // print the value in the same line not storing in other list
		System.out.println(evennum);
		
		
	}

}
