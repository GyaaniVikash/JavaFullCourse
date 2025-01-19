package LearnJava;

public class Sixth_loop_statement_Part2 {

	public static void main(String[] args) 
	{
		/* for Loop - initialization, condition & increment/decrement in single line
	    Syntax for(initialization, condition , increment/decrement)
	    {
	    statement
	    }
	    reduce no.of code line*/
		
		for(int i=1;i<=10;i++)   //to print 1..10
		{
			System.out.println(i);
		}
	    
		for(int j=10;j>=1;j--) //to print reverse from 10...1
		{
			System.out.println(j);
		}
	
		for (int k=2;k<=20;k+=2)  //to print even from 1..20
				{
			     System.out.println(k);
				}
		
		for(int a=1;a<=10;a++)
		{
			if(a%2==0)
			{
				System.out.println(a + " even");
			}
			else
			{
				System.out.println(a + " odd");
			}
		}
	
	  //Jumping Statement -- break & continue
		
		for(int x=1;x<=10;x++)
		{
			if(x==5)       //to print from 1...4
			{
				break;     //jump out of program if x=5
			}
				System.out.println(x);
		}
		
		//to print using continue
		for(int y=10;y<=20;y++)
		{
			if(y==15)       //to print from 11...20 except 15, print except 13,15,19 then use OR || if(i==13||i==15||i==19)
			{
				continue;     //jump out of program if x=5
			}
				System.out.println(y);
		}
	}

}
