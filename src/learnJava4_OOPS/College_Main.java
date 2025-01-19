package learnJava4_OOPS;

public class College_Main {

	public static void main(String[] args) {
		
		//1st Approach- using object reference variables
		/*College data=new College();
		data.cgid=202;
		data.colname="Delhi Uniersity";
		data.colfee=50000;
		*/
		
		//2nd Approach- using Method
		/*College data=new College();
		data.collegeData(101, "JNU", 45000); //to store data
		data.collegeinfo();  //to print data
		*/
		
		//3rd Approach - using constructor
		//how to call constructor -it will automatically invoke  no need to create object
		College col=new College(301,"Tyson",30000);
		col.collegeinfo();
		
		/*Difference between method and constructor
		 * Method name can be anything,const. name same to class name
		 * Method may or may not return any value,const. never returns any value
		 * method can be any thing,cons. only for assigning the data
		 * Cons. is preferred to assign data into variables,method can be used to operation
		 * Method = assignment+ operation
		 * Default Const. 
		 * Parameterized const. 
		 */
	}

}
