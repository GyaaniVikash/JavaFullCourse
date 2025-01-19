package LearnJava;

public class Practise_Examples {

	public static void main(String[] args) {
		// TO reverse a number (string) input 1234 then output 4321
		//to find number is palindrome 121,1331
		//count number of digits in number : 433215 output:6
		//count number of even odd digits in number: 6554821 output: 4-even,3-odd
		//to count sum of number 6945 : 24
		
		//Example 1:
		int num=5641,rev=0;;  
		while(num!=0)
		{
			int rem=num%10;
			rev =rev*10+rem;
			num=num/10;
		}
			System.out.println("Reverse= " +rev);
		
		//palindrome
		int r,sum=0,temp;
		int n=121;       //number variable
		temp=n;
		while(n>0) 
		{
			r=n%10; //getting remainder
			sum=(sum*10)+r;
			n=n/10;
		}
			if(temp==sum)
			{
				System.out.println("palindrome");
			}
			else 
			{
				System.out.println("not palindrome");
			}
	}

}
