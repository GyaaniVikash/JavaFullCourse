package learnJava4_OOPS;

public class Poly_Adder 
    {
	int a=10,b=20;
	
	void add()
	{
		System.out.println(a+b);
	}
	
	void add(int x,int y)  //same method with different param
	{
		System.out.println(x+y);
	}
	
	void add(int i,int j,int k)  //no. of param different
	{
		System.out.println(i+j+k);
	}
	
	void add(int d,float f)// data type of param. different
	{
		System.out.println(d+f);
	}
	
	void add(float f,int x) //order of param. different
	{
		System.out.println(f+x);
	}
}
