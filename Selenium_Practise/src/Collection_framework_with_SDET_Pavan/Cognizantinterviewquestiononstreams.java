package Collection_framework_with_SDET_Pavan;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
class EmployeeTest {
	String employeename;
	int age;
	String gender;
	String department;

	EmployeeTest(String employeename, int age, String gender, String department) {
		this.employeename = employeename;
		this.age = age;
		this.gender = gender;
		this.department=department;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}

public class Cognizantinterviewquestiononstreams {
	public static void main(String agrs[]) {
		
	    List<EmployeeTest> emplist=new ArrayList<EmployeeTest>();
		emplist.add(new EmployeeTest("Sarthak",30,"Male","HR"));
		emplist.add(new EmployeeTest("Mohan",29,"Male","IT"));
		emplist.add(new EmployeeTest("kunj",31,"Female","HR"));
		emplist.add(new EmployeeTest("Sagar",24,"Female","IT"));
		
		//find the department ->distinct department->print
//		long distemp=emplist.stream().map(EmployeeTest::getDepartment).distinct().count();
//		System.out.println(distemp);
		//find the departments and their count 
//		Map<String,Long> counttotal=emplist.stream().collect(Collectors.groupingBy(i->i.department,Collectors.counting()));
//		System.out.println(counttotal);
		
		Map<String, Integer> tb=emplist.stream().collect(Collectors.groupingBy(i->i.gender ,Collectors.summingInt(s->s.age)));
		System.out.println(tb);
	
		
	}
}
