package learnJava4_OOPS_2;

//Type 1 -- Single Heritance

	class A      //public access modifier can be used single time with main class 
	{
		int a=120;
		void display()
		{
			System.out.println(a);
		}
	}
	
	class B extends A   //class B acquired Class A
	{
		int b=150;
		void show()
		{
			System.out.println(b);
		}
	}
public class Inheritance_1_SingleType {
	public static void main(String[] args) {
		B firstobj=new B();
		System.out.println(firstobj.a);
		System.out.println(firstobj.b);
		//firstobj.display();
		//firstobj.show();
	}

}
