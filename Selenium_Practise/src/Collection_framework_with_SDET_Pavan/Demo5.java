package Collection_framework_with_SDET_Pavan;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String employeename;
	int salary;
	String gender;

	Employee(String empname, int salary, String gender) {
		employeename = empname;
		this.salary = salary;
		this.gender = gender;
	}
}

public class Demo5 {
	public static void main(String[] agrs) {
		ArrayList<Employee> ar = new ArrayList<Employee>();
		ar.add(new Employee("Rahul", 60000, "Male"));
		ar.add(new Employee("Kartik", 40000, "Male"));
		ar.add(new Employee("Kajal", 30000, "Female"));
		Function<Employee, Integer> bonus=b->(b.salary*10)/100;
		Predicate<Integer> sl =b->b>3500;
		Consumer<Employee> emp=e-> 
			System.out.println(e.employeename+ e.salary+ e.gender);
	

		for(Employee ep:ar) {
			int bon=bonus.apply(ep);
			if(sl.test(bon)) {
				emp.accept(ep);
			};
			

		}


	}
}

