package LearnJava;

public class second {

	public static void main(String[] args) 
	{
		int a;   //declaration
		a=100;  //Assignment
		
		//Approach 1 for declaring variables of different types
		int b;
		int c;
		int d;
		b=50; 
		c=60;
		d=70; 
       System.out.println(b);
       System.out.println("value of variable c:"+c);
       System.out.println(b+" "+c+" "+d); //using concatenation
       
		//Approach 2 -- if all variables belong to same data type
		int f,g,h;
		f=10;g=20;h=30;
		System.out.print("Sum of 3 no.:");
		System.out.println(f+g+h);
		
		//Approach 3 -- if all variables belong to same data type
		int i=10,j=20,k=30;
		System.out.print(i+ " ");
		System.out.print(j+ " ");
		System.out.print(k); //use approach 2 if want to print all value using single print line
		
	}

}
