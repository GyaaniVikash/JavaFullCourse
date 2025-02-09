package learnJava4_OOPS_2;

//final keyword for variables 
	class Test1
	{
		int x=100;
		final int y=500;
	}
// to use 'final' keyword in Method	
	class Test2
	{
		final void view()
		{
			System.out.println("view method without final keyword");
		}
		
	}
	
	class Test3 extends Test2
	{
	//	void view() //we cannot use view method since final Keyword is added before view method in Test2 class
		{
			System.out.println("this is samethod from class name as Test2");
		}
	}
	
//final keyword in class
	
	final class Test4
	{
		void displey()
		{
			System.out.println("using class with final keyword");
		}
	//class Test5 extends Test4  //child class cannot extends Test4 since final keyword is used
	{
		/*void displey()
		{
			System.out.println("child class cannot extends Test4 since final keyword is used");
		}*/
	}
	
	
	}
	
	
public class Test_Final_Keyword {

	public static void main(String[] args) {
		
		Test1 t=new Test1();
		t.x=200;  //we can change the value of variable
	//	t.y=600; //incorrect because y is final variable and we cannot change value
		System.out.println(t.x);
		System.out.println(t.y);  //value of y unchanged

/*variables - we cannot change the value of variables(constant)
 * methods	- we cannot overrides those methods in child classes	
 * class- we cannot extends that class into child class
 */
		
		
	}

}
