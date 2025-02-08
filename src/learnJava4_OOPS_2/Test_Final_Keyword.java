package learnJava4_OOPS_2;

//final keyword for variables 
	class Test1
	{
		int x=100;
		final int y=500;
	}
public class Test_Final_Keyword {

	public static void main(String[] args) {
		
		Test1 t=new Test1();
		t.x=200;  //we can change the value of variable
	//	t.y=600; //incorrect because y is final variable and we cannot change value
		System.out.println(t.x);
		System.out.println(t.y);

	}

}
