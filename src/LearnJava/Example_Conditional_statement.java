package LearnJava;

public class Example_Conditional_statement {

	public static void main(String[] args) 
	{
		//Example 1:to find Even or Odd
		int num=17;
		if (num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		
		//Example 2:to find largest of 3 no.
		int a=10,b=20,c=30;
		
		
		//if else without condition,only boolean
		if(true)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		//to find leap year
		int year =1995;
		if (year%4==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("Not leap year");
		}
		
        // with multiple if else condition inside if 
	    //to print week names as per week number
	
		int weekno=6;
		if (weekno==1)
		{
			System.out.println("sunday");
		}
		else if(weekno==2)
		{
			System.out.println("Monday");
		}
		else if(weekno==3)
		{
			System.out.println("Tuesday");
		}
		else if(weekno==4)
		{
			System.out.println("wednesday");
		}
		else if(weekno==5)
		{
			System.out.println("thursday");
		}
		else if(weekno==6)
		{
			System.out.println("friday");
		}
		else if(weekno==7)
		{
			System.out.println("saturday");
		}
		else
		{
			System.out.println("Invalid week no");
		}
		
		//switch case
		int weeknum=8;
		switch (weeknum)
		{
		case 1: System.out.println("Sunday");break;
		case 2: System.out.println("Monday");break;
		case 3: System.out.println("Tuesday");break;
		case 4: System.out.println("Wednesday");break;
		case 5: System.out.println("Thursday");break;
		case 6: System.out.println("Friday");break;
		case 7: System.out.println("Saturday");break;
		default : System.out.println("Invalid weeknum");
		}
	}

}
