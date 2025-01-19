package learnJava4_OOPS;

public class Greetings {

	//No parameter - no return values
	void m1()    //does not return any value so start with void
	{
		System.out.println("Hello");
	}
	
	//No parameter - return values
	String m2()    //return type String value so start with string
	{
		return("Hello...how are you"); 
	}
	
	//Takes parameter - no return values
	void m3(String name)    //return type String value so start with string
	{
		System.out.println("Hello "+name); 
	}
		
		//Takes parameter - return values
	String m4(String name)    //return type String value so start with string
	{
		return("Hello "+name); 
	}
	//user defined method
	
}
