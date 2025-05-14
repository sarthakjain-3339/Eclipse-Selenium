package AccessModifier;

 /*class Example1 {
	/*int a ;
	int b;
	void display() {
		System.out.println("Inside the default method ");
	}
	int a ;
	int b;
	void display() {
		System.out.println("Inside the default method ");
	}
	public static void main(String []agrs) {
		Example1 exm= new Example1();
		exm.a=40;
//		System.out.println(exm.a);//default access modifier
//		exm.display();//default access modifier


	}


}
*/
//
//public class Example1 {
//    private class PrivateInnerClass {
//        public void display(String name) {
//            System.out.println("Inside PrivateInnerClass");
//        }
//    }
//
//    public static void main(String[] args) {
//        // Attempting to create an object of the private inner class
//        // This will result in a compilation error
//         PrivateInnerClass innerObj = new PrivateInnerClass(Sarthak);
//    }
//}
public class Example1 {
    // Some fields and methods of the outer class

    private class PrivateInnerClass {
        private int innerField;

        public PrivateInnerClass(int innerField) {
            this.innerField = innerField;
        }

        public void display() {
            System.out.println("InnerField value: " + innerField);
        }
    }

    public void usePrivateInnerClass() {
        // The outer class can create and use instances of the private inner class
        PrivateInnerClass innerObj = new PrivateInnerClass(56);
        innerObj.display();
    }
    public static void main(String []args) {
    	
    	Example1 ex=new Example1();
    	ex.usePrivateInnerClass();
    }

    // More methods and members of the outer class
}