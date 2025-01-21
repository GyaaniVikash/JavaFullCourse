package learnJava4_OOPS;

public class ThisKeyword {
	
	int x,y;    //x,y class variable or instance variable and can be accessed anywhere in 
	
	/*ThisKeyword(int a,int b) //a,b are local variables and access within method
	{
		x=a;    
		y=b;
	}
	*/
	
	ThisKeyword(int x,int y) //x,y are local variables and access within method
	{
		//x=x;   return output 0,if value is not specified
		//y=y;   not able to understand which is class variable or local variable
		this.x=x;  //
		this.y=y;  
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
		ThisKeyword var=new ThisKeyword(12,15);
		var.display();

		/* Types of variables - local or class/instance
		* Variables declared outside of class are called Global variable
	    * not used in JAVA
	    * this keyword always represent class/object
	    * this keyword - to differentiate local variables and instance variables
	    * this keyword used with constructor and Method also
	    */
	}

}
