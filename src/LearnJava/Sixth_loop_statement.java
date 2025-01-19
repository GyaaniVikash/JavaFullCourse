package LearnJava;

public class Sixth_loop_statement {

	public static void main(String[] args) 
	{
		
	/*loop statement - for multiple conditional statement ,purpose to reduce code
		while loop-- decides how many times we need to repeat the loop
		do-while loop
		for loop
		enhanced for loop*/
		
		//while print 1...10
		int i=1;   //initialization
		
		while(i<=10) //condition
		{
			System.out.println(i);
			i++;     //increment
		}
        //to print HELLO 5 times
        int j=1;   //initialization
		
		while(j<6) //condition
		{
			System.out.println("HELLO");
			j++;
		}
		//to print even number 1....20
		int k=2;
		while(k<=20)
		{
			System.out.println(k);
			k+=2;
		}
		
		/*to print 1..10 and mention as Even/odd 
		1 odd
		2 even
		3 odd
		..10 even*/
		//to print 10 to 1 descending order
		
		//do while loop - semi colon with while(condition),statement will execute then verify the condition
		//print 1..10 using do-while
		int m=1;
		do
		{
			System.out.println(m);
			m++;
		}while(m<=10);
		
		//to print 9...1 using do-wjile
		int n=10;
		do
		{
			System.out.println(n);
			n--;
		}while(n>=1);
		
		//while loop without condition, no. of iteration not known
		
		int p=1;
		while(true)      //no condition
		{
			System.out.println("Hello");
			p++;
			if(p==10)       //condition
			{
				break;
			}
		}
		
	}

}
