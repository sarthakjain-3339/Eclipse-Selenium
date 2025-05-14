package JavaPractise;
//Final: we can use final keyword with  class variable and method
//Interface is looks same as class it has some variable and method but method are abstrat only
//abtract methid is when we only only declare the method implemention we will done in subclass
//it is a part of multiple inheritance
 class A implements newone{
//	final int a;
	int a;
	String b;
	
//	void display(){
//		System.out.println("Inside the class a ");
//		
//	}
	public void display() {
		System.out.println("Inside the ineterface ");
//		x=80;// not accessable 
		System.out.println(x);
		System.out.println(y);
	}
	void setvalue() {  //abstract method
		a=20;
		b=("Sarthak");
		System.out.println(a);
		System.out.println(b);
		
	}
 }
 interface newone{
     int x=50;
	 int y=60;
	 void display();
	 
		
 }


public class Final_Interface {
public static void main(String []args) {
	A ref=new A();
	ref.display();
	System.out.println(ref.x);
	ref.setvalue();
	
//	newone ref=new newone; Not able to write like that
	 
	 
	 
	
	
}
}
