package LearnJava;

public class Fourth_OperatorsPart3 {

	public static void main(String[] args) 
	{
		
		//Type:5 Assignment operator- to increase or decrease value by more than 1
		//Assignment =+=   -=   *=   /=  %=
        int a=50;
        a+=5;     //a=a+5
        System.out.println(a);
        
        int b=75;
        b-=5;     //b=b-5
        System.out.println(b);
        
        int c=20;
        c*=3;     //c=c*3
        System.out.println(c);
        
        int d=36;
        d/=4;     //d=d/4
        System.out.println(d);
        
        /*difference between == and = ?
        == relational operator to compare values between 2 variables
        = Assignment operator ,assign values to variables*/
        
        //Type:6 conditional/ternary operator ?:
        
        /*int u=200,v=100;
        int x= (u>v)? u:v;
        System.out.println(x);*/ //Print x=200
        
        int u=200,v=100;
        int x= (u<v)? u:v;       //verify if u<v,if false then v
        System.out.println(x);  //print output as 100
        
        
        
        
	}
     
}
