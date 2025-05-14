package ramdon_Querys;

public class ConstructorMthOverg {
	int x=0;
	static int y=20;
	int z=0;

	 ConstructorMthOverg(){
		 this("fj");
		 int d=50;
		
		System.out.println(x+y+z);
		int x=20;
		//System.out.println(x);
	}
	 
	 
	 ConstructorMthOverg(String val){

//			
		}
	 
	 
	 static void display() {
		 ConstructorMthOverg r1= new ConstructorMthOverg();
		 System.out.println(r1.x);
		 y=10;
	 }
	public  void test() {
		
	}
	public static void main(String[] args) {
		ConstructorMthOverg ovr=new  ConstructorMthOverg();
	}


}
