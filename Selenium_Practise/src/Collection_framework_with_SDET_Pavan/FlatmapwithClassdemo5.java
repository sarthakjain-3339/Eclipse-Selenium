package Collection_framework_with_SDET_Pavan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee2 {
	int salary;
	String name;

	Employee2(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}

}

//class EmployeeCars {
//	int salary;
//	String Carname;
//
//	EmployeeCars(int salary, String Carname) {
//		this.salary = salary;
//		this.Carname = Carname;
//	}
//
//}


public class FlatmapwithClassdemo5 {
	public static void main(String agrs[]) {
     Employee2 emp1= new Employee2(20000, "Harshit");
     Employee2 emp2= new Employee2(60000, "Rajna");
     Employee2 emp3= new Employee2(90000, "Rajneesh");
     Employee2 emp4= new Employee2(90000, "kartik");
     Employee2 emp5= new Employee2(10000, "harsh");
   //  EmployeeCars emp6= new EmployeeCars(20000, "Hondacity");
     List<Employee2> employeeList = new ArrayList<>();
     employeeList.add(emp1);
     employeeList.add(emp2);
     employeeList.add(emp3);
     employeeList.add(emp4);
     employeeList.add(emp5);
     employeeList.stream().filter(i->i.salary>300).map(i->i.name).forEach(System.out::println);
//      List<List<Employee2>>  allobjects= new ArrayList<List<Employee2>>();
//      allobjects.add();
//      allobjects.stream().flatMap(i->i.stream()).filter(i->i.salary>300).map(i->i.name).forEach(System.out::println);
      
   }
}
