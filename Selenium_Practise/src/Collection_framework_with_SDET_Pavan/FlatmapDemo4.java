package Collection_framework_with_SDET_Pavan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapDemo4 {
	public static void main(String args[]) {
		List<String> vichle=Arrays.asList("bus", "car", "flight", "train","cycle");
		List<String> owner=Arrays.asList("Sarthak", "Raj", "SHam", "gagan","mohan");
		List<String> company=Arrays.asList("mg", "tata", "kia", "honda","hinda");
		//List<List<String>> mergelist= Arrays.asList(vichle, owner, company);
		List<List<String>> mergelist= new ArrayList<List<String>>(); 
		mergelist.add(vichle);
		mergelist.add(owner);
		mergelist.add(company);
		
		mergelist.stream().flatMap(i->i.stream()).filter(i->i.length()>3).map(i->i.toUpperCase()).forEach(System.out::println);
		

		
		
		
		
		
		
		
		
	}	
}
