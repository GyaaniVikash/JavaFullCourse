package LearnJava;

public class Fifth_Conditional_Part1 {

	public static void main(String[] args) 
	{
	/*conditional statement - 4 types
		if
		if else
		nested if else
		switch case*/	
		
		//if statement
		int age=21;
		if(age>=18)
		{
			System.out.println("Eligible for Vote");
		}
		
		//if else
		int male_age=25;
		if(male_age>=21)
		{
			System.out.println("Eligible for Marriage");
		}
		else
		{
			System.out.println("Not Eligible for Marriage");
		}
         //for single statement curly {} braces are optional
	     
	//if else ladder
		
		int num=30;
		if (num>0)
		{
			System.out.println("positive");
		}
		else if (num<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}
	
	//nested if -- one if condition have another if condition
		if(true)
		{
			if(true)
			{
				System.out.println("abc");
			}
			else
			{
				System.out.println("xyz");
			}	
		}
		else
		{
			System.out.println("123");
		}
		
		//switch case 
		
		
	}

}
