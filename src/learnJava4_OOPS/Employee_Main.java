package learnJava4_OOPS;

public class Employee_Main {

	public static void main(String[] args) {
		
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
	    
	   /* Student st3=new Student(); 
		st3.id=420;
		st3.name="Suresh";
		st3.section='B';
        st3.printdata();
	    */
		//Separate Main method in another class;this should control all different class
	   //if class are in different package then we need to import class and run from class containing Main method 
	    
	}

}
