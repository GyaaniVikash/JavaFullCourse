package learnJava4_OOPS;

public class ThisKeyword {
	
	int x,y;    //x,y class variable or instance variable
	ThisKeyword(int a,int b) //a,b are local variables and access within method
	{
		x=a;
		y=b;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
		ThisKeyword var=new ThisKeyword(12,15);
		var.display();

		//Variables declared outside of class are called Global variable
	}

}
