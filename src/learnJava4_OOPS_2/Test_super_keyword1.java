package learnJava4_OOPS_2;

public class Test_super_keyword1 {

		String fuel="CNG";
		
	void mileage()
	{
		System.out.println("Depends on fuel");
	}
}

class Car extends Test_super_keyword1
	{
		String fuel= "Petrol";
		
		void displaytype()
		{
			System.out.println(super.fuel);  //fuel = petrol but it invokes immediate parent class variable
		}
		
		void mileage()
		{
			System.out.println("CNG has more mileage than Petrol");
		    super.mileage();  //calling method from immediate parent classs
		}
	}