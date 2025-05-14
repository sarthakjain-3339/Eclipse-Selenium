package Collection_framework_with_SDET_Pavan;

import java.util.function.Function;

class Student {
	int count;
	String gender;
	String schoolname;

	public void studentData(String schoolname, String gender, int count) {
		this.count = count;
		this.gender = gender;
		this.schoolname = schoolname;
		
	}
	void schoolName(){
		System.out.println(this.schoolname);
	}
}

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st= new Student();
		st.studentData("Ranbow","Male", 40);
		st.studentData("Ranbow","Female", 20);
		st.studentData("Vidya mandir","Female", 400);
		st.studentData("Ranbow","Female", 900);

		Function<Student, String> fr= a->{
			if((a.count>20) && (a.gender=="Male")) 
			{
				 return a.schoolname;
			    
			};
			return null;
			
		};
			
st.schoolName();

		



	}

}
