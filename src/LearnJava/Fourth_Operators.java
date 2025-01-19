package LearnJava;

public class Fourth_Operators {

	public static void main(String[] args) 
	{
		//Type:1 Arithmetic operators + - * / %
		
		int a=20,b=10;
		
		System.out.println("Sum of a and b:"+(a+b));
		System.out.println("difference of a and b:"+(a-b));
		System.out.println("Multiplication of a and b:"+(a*b));
		System.out.println("Division of a and b:"+(a/b));     //return quotient as output
		System.out.println("Modulo division of a and b:"+(a%b)); //return remainder as output
		
		//Type:2 Relational or comparison < > >= <= != == -- always return boolean value
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		b=30;
		System.out.println(a<=b);
		System.out.println(a>=b);
		a=30;
		System.out.println(a!=b);
		
		//Type:3 logical operators && || ! -- returns boolean value (true/false)
        //works between 2 boolean values
		boolean x=true;
		boolean y=false;
		System.out.println(x && y);//false
		System.out.println(x || y);
		
		boolean b1=10>20;
		boolean b2=10<20;
		System.out.println(b1 && b2);//false
		System.out.println(b1 || b2);//true
		
		
	}

}
