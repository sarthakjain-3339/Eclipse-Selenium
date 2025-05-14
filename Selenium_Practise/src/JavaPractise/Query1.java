package JavaPractise;
// accoring to chatgpt we cannot run the java code without the main method 

public class Query1 {

	public class star{
		int a;
		int b;
		float c;

		void values(){
			a=10;
			b=20;
			c=90;
			System.out.println(a +b +c);
		}
		
	}
	public  static void  main(String[] args) {
	Query1 st=new Query1();
	star st1=st.new star();
	st1.values();
	}
}
