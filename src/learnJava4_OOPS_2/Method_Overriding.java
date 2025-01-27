package learnJava4_OOPS_2;

/*Method_Overriding based on inheritance(Parent-child) 
 * new implementation will be executed,should not change definition
 * implementation can be changed but definition can't be changed while using from parent to class
 * overriding can be achieved if more than 2 classes or equal to 2 classes
 */
class bank
{
	double rate()
	{
		return 0;
	}
}

class ICICI extends bank
{
	double rate()
	{
		return 3.5;
	}
}

class SBI extends bank
{
	double rate()
	{
		return 4.5;
	}
}

public class Method_Overriding {

	public static void main(String[] args) {
		
        ICICI pvt=new ICICI();
        System.out.println("Rate of Interest in ICICI: "+pvt.rate());
		
        SBI psu=new SBI();
        System.out.println("Rate of Interest in SBI: "+psu.rate());
	}

}
