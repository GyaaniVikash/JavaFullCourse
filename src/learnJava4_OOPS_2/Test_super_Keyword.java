package learnJava4_OOPS_2;

 /*super keyword - reference variable that is used to refer to parent class when we’re working with objects
  * used to invoke the immediate parent class variable,method
  * 
  */
	
public class Test_super_Keyword {

	public static void main(String[] args) {
		Car ch=new Car();
		ch.displaytype();	//display type method with using super keyword
		ch.mileage();       //display mileage declared in parent class since super keyword is used in child class
	}

}
