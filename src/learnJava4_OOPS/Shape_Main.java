package learnJava4_OOPS;

public class Shape_Main {

	public static void main(String[] args) {
		
		//constructor Overloading from shape class
		
		Shape vol1=new Shape(); //calling const. 1
		Shape vol2=new Shape(2.5,3.5,4.0); //calling const. 2
		Shape vol3=new Shape(5.0);
		
		System.out.println("Volume of shape= "+vol1.volume());
		System.out.println("Volume of shape= "+vol2.volume());
		System.out.println("Volume of shape= "+vol3.volume());
	}

}
