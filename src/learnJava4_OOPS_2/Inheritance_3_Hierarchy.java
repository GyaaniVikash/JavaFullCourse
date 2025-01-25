package learnJava4_OOPS_2;

//one parent multiple child class

class parent
{
	void displays(int a)
	{
	System.out.println(a);
	}
}

class child1 extends parent
{
	void show(int b)
	{
		System.out.println(b);
	}
}

class child2 extends parent
{
	void print(int c)
	{
		System.out.println(c);
	}
}

public class Inheritance_3_Hierarchy {

	public static void main(String[] args) {
		child1 c1=new child1();
		c1.displays(100);
		c1.show(200);           //child 1 -- inherit from parent class
		
		child2 c2=new child2();
		c2.displays(1500);      //child 2 -- inherit from parent class
		c2.print(2000);

	}

}
