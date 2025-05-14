package JavaPractise;

abstract class A1{
	void A1() {
		System.out.println("Abstract class");
	}
	abstract void a2();
}
interface p1{
	public static void p1() {
		System.out.println("method m1");
		
	}
	void p2();
}
public class Interface_Abstract_class extends A1 implements p1{
	public void p2(){
		System.out.println("hi");
	}
	void a2() {
		System.out.println("Abstract class");
	}
	
	public static void main(String agrs[]) {
		Interface_Abstract_class rv=new Interface_Abstract_class();
		
		rv.A1();
		p1.p1();
		rv.p2();
		
	}
}
