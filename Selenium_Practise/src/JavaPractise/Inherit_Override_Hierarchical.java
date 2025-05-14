package JavaPractise;
//Hierarchical Inheritance we can achieve with the help of override 
class vichle{
	public int wheelcount;
	public String name;
	public int price;
	void car() {
		wheelcount=10;
		name="Maruti";
		price=2000;
		System.out.println(wheelcount);
		System.out.println(name);
		System.out.println(price);
	}
}
class skoda extends vichle{
	
	void car() {    //this is overriding when we use the same method name and same parameter
		super.car();  //note super class is used here to call the parent class method
		wheelcount=20;
		name="skoda";
		price=5000;
		System.out.println(wheelcount);
		System.out.println(name);
		System.out.println(price);
	}
}


public class Inherit_Override_Hierarchical {
	public static void main(String [] args) {
		skoda sk= new skoda();
		
		sk.car(); // We cannot access the parent lass method with subclass object
		vichle vc= new vichle();
		vc.car();
		
		
		
	}

}
