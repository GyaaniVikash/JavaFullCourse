package LearnJava;

public class ThirdClassDataTypes {

	public static void main(String[] args) 
	{
	//primitive data types- Numeric	
	   int a=100;
	   int b=200;
	   System.out.println("Sum of a and b:"+(a+b));
     
	   byte by=125;           //store from -128 to 127
	   System.out.println(by);
	   
	   short sh=3507;
	   System.out.println(sh);
	   
	   long l=123456789L;   //for long data type specify with L
	   System.out.println(l);
	   
	   //Decimal - float,Double 
	   float f=123.3456F; //specify with literals F
	   System.out.println(f);
	   
	   double dl=1234.34657788;
	   System.out.println(dl);
	   
	   
	//Non-numeric data type -- char, boolean 
	   char grad='B';  //always use single quote
	   System.out.println(grad);
	   //char ch='ABC'; //invalid
	   String s="ABC";
	   
	   boolean bl=false;
	   System.out.println(bl);
	   
	   // String tr=true; //not valid ,must be in double quote
	   String tr="true";
	   System.out.println(tr);
	   
	   
	   
	}

}
