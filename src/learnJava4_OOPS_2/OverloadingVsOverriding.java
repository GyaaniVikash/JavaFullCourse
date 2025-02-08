package learnJava4_OOPS_2;

/*Method overriding
 * Possible only in multiple classes(Inheritance)
 * we should not change the signature of the method but body we should change
 * method names are same
 * belongs to inheritance
 * ___________________
 * Method overloading
 * possible in single & multiple classes(inheritance)
 * we should change the signature of the method
 * method names are same
 * belongs to polymorphism
 */

//method overloading with inheritance(overriding)

class one
{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
}

class two extends one
{
	void m1(int a)                 //overriding 
	{
		System.out.println(a*a);  //changing implementation not declaration
	}
	void m2(int a,int b)   //overloading -- declaration changes;m2 method overloaded into child class
	{
		System.out.println(a+b);
	}
}

public class OverloadingVsOverriding {

	public static void main(String[] args) {
		two obj=new two();
		obj.m1(20);
		obj.m2(30);
        obj.m2(12, 15);
	}

}
