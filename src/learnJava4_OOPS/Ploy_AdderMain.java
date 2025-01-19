package learnJava4_OOPS;

public class Ploy_AdderMain {

	public static void main(String[] args) {
		
		//Polymorphism(method overloading)
		
		Poly_Adder sumobj=new Poly_Adder();
		sumobj.add();  //1
		
		sumobj.add(40, 50); //2
		
		sumobj.add(10, 20, 30);  //3
		
		sumobj.add(30, 19);
		
		sumobj.add(19, 30);
		
		

	}

}
