package Collection_framework_with_SDET_Pavan;

import java.util.function.Consumer;

//Consumer and supplier
class consumer{
	  void testconsumer(String str){
		System.out.println("Welcome inn cosumer" + str);
	}
}
public class demo4 {
	public static void main(String[] agrs) {
		 consumer cr=new consumer();
		   cr.testconsumer("Sarthak");
		   Consumer<String> cn=e->System.out.println("welcome" +e);
		   cn.accept("String");
	}
  
}
