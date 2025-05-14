package Collection_framework_with_SDET_Pavan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 {
	int salary;
	String name;

	Employee1(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}

}

public class filterandmap_demo3 {
	public static void main(String args[]) {
		List<Employee1> emp = Arrays.asList(new Employee1(5000, "Sarthak"), new Employee1(5000, "arthak"),
				new Employee1(5000, "Sathak"), new Employee1(5000, "Sarhak"), new Employee1(5000, "Sartak"),
				new Employee1(5000, "Sarthk"));
		List<Integer> cemp = new ArrayList();

		cemp = emp.stream().filter(e -> e.salary > 2000).map(e -> e.salary).collect(Collectors.toList());
		System.out.println(cemp);
	}
}

