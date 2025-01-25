package learnJava4_OOPS_2;

	class first      //public access modifier can be used single time with main class 
	{
		int a=120;
		void display()
		{
			System.out.println(a);
		}
	}
	
	class second extends first   //class B acquired Class A
	{
		int b=150;
		void show()
		{
			System.out.println(b);
		}
	}	
	class third extends second
	{
		int c=180;
		void compare()
		{
		System.out.println(c);  //there are 3 variables in class third,grand child of class first
		}
	}
	
public class Inheritance_2_MultiLevel {
	public static void main(String[] args) {
		
		third obj=new third();
		System.out.println("Output of inherited class 1st 2nd 3rd");
		obj.compare();
		obj.show();
		obj.display();
	}
}	
