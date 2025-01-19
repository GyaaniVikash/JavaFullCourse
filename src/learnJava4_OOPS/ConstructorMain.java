package learnJava4_OOPS;

//default constructor
public class ConstructorMain {

	int x,y;
	ConstructorMain()
	{
		x=100;
		y=200;
	}
	
	// parameterized constructor
	ConstructorMain(int a,int b)
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
	System.out.println(x+y);	
	}
	
	public static void main(String[] args) {
		ConstructorMain type1=new ConstructorMain(); //invoke default constructor
	    type1.sum();
	    
	    ConstructorMain type2=new ConstructorMain(15,25); //invoke parameterized constructor
	    type2.sum();
	}

}
