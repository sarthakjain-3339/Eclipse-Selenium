package ramdon_Querys;

class a {
	int a;
	int b;

	void sum() {
		System.out.println(a*b);
	}
	void display(){
		System.out.println("Inside the display method.");
	}

}

class b extends a{
	 int x;
	int y;
	void divide() {
		System.out.println("x%y");
	}
	void display(){
		System.out.println("Inside the class b and executingthe Class b");
	}
}
 class c extends b{
	 static int e=50;
	int z;
	void sum() {
		System.out.println(e+z);
	}
	void display() {
		System.out.println("Inside the class c and executing the display method");
	}
}
 public class Inheritance{
	static int e;
	public static void main (String [] args) {
		c ref=new c();
		ref.a=10;
		ref.b=20;
		ref.x=30;
		ref.y=40;
//		e=50;
		ref.z=60;
		
				
		
		ref.sum();
		ref.display();
		System.out.println(e);

	}
}
