package learnJava4_OOPS;

public class Method {

	public static void main(String[] args) {
		
		/* Method - group of statement which will perform certain task 
		 * we have to call method through object  
		 * Built-in method
		 * user defined method
		 * No parameters - no return value
		 * No parameters - returns value
		 * Takes parameters - no return value
		 * Takes parameters - returns value
		 * Example in Greetings CLASS(method)
		 */
           
		Greetings method=new Greetings();
		method.m1();
		
		String s=method.m2();
		System.out.println(s);
		
		method.m3("Smith");
		
		String s1=method.m4("Johnny");
		System.out.println(s1);
	}

}
