package learnJava4_OOPS;

public class Employee {
	
	//variables
	int empid;
	String empname;
	String job;
	int salary;
	
	//Methods
	void display()  //void is return type
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(job);
		System.out.println(salary);
	}

	/*variables and methods are declared outside of main method
	objects are created always inside Main method
	public static void main(String[] args) 
	{
		Employee emp1=new Employee(); //object-
		emp1.empid=49818;
		emp1.empname="Mike";
		emp1.salary=50000;
		emp1.job="Engineer";
	    emp1.display(); //display()-->user defined method access across all objects
	    
		Employee emp2=new Employee(); 
		emp2.empid=412413;
		emp2.empname="JOHN";
		emp2.salary=45000;
		emp2.job="Manager";
	    emp2.display();
	    
	    //on real time project -- one class should contain Main method and we can create n no. of classes using same Main method
	}
	*/

}
