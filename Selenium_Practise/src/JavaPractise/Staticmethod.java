package JavaPractise;

import JavaPractise.Query1.star;

//Static method can only access the static stuff
//Static method can also access the non static method with the help of object
public class Staticmethod {
	static int a;
	public static  int x;
	int b;
	

	void values(){
		a=10;
		b=20;
		
		System.out.println(a +b);
	}
class static2{
	void display(){
		System.out.println(b);
	}
}
public  static void  main(String[] args) {
	Query1 st=new Query1();
	star st1=st.new star();
	st1.values();
	System.out.println(a); //static values print
	System.out.println(st1.b);//non static value print 
}
}
