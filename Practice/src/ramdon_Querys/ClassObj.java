package ramdon_Querys;



public class ClassObj {

	int a ;
	int b;
	double c;
	void sum(int a, int b, double c) {
		this.a=40;
		this.b=80;
		 this.c=90;
		 System.out.println(a+b+c);
	}
	int sum(int a, double c,int b) {
		this.a=20;
		this.b=90;
		this.c=20.60;
		return (int) Math.round((a*b)*c);
	}
	public static void main(String[] agrs) {
		ClassObj cl=new ClassObj();
		cl.sum(10,20,30.8);	
		int c1=cl.sum(10, 20.0, 8);
		
	System.out.println(c1);
		
	}
}
