package learnJava4_OOPS;

public class StaticKeyword {

	static int a=20; //static variable
	int b=30;	//non-static variable
		
		/* Static keywords can be applied for variables & methods
		 * static variables
		 * static method
		 * non-static variables
		 * non-static method
		 * when we create a static variable,that become common/shared variable between all objects.
		 * Advantage - 1.modification 2.reduce memory duplicates
		 * only used when value is common for all object
		 * static method can access static stuff(without creating object)
		 */
	static void m1() //static
	{
		System.out.println("this is static method");
	}
	
	void m2()
	{
		System.out.println("this is non-static method");
	}
	
	void m() //non-static method
	{
		System.out.println(a);  
		System.out.println(b);
		m1();
		m2();
	}
	public static void main(String[] args) {
		
		System.out.println(a);
		m1();    //can be accessed since a is static method
		
		//System.out.println(b);//b is non-static
		//m2();      //can be accessed since m2 is non-static method
		StaticKeyword sd=new StaticKeyword();
		System.out.println(sd.b);
		sd.m2();
		
		sd.m();   //calling non-staic method through object
	
		//non-staic method can access everything directly
	
	}

}
