package LearnJava;

public class Fourth_OperatorsPart2 {

	public static void main(String[] args) 
	{
		//Type:4 increment and decrement operators ++ -- use to increase or decrease value by 1
		//case 1
		int a=10;
		System.out.println(a);
		a++; //increase value of a by 1, a+1
		System.out.println(a);
		
		//case 2 post++ increment
		int b=10;
		int add=b++;
		System.out.println(add);  //b=10
		System.out.println(b); //b=11
		
		//case 3 ++ pre increment
		int c=10;
		int addc=++c;
		System.out.println(addc);  //c=11
		System.out.println(c); //c=11
		
		//decrement operators
		
		//post decrement -- operators
		int j=100;
		int res=j--;
		System.out.println(res); //100
		System.out.println(j); //99
		
		//--pre-decrement operators
		int k=50;
		int resp=--k;
		System.out.println(resp); //49
		System.out.println(k);   //49

	}

}
