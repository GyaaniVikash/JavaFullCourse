package learnJava4_OOPS;

public class College {
	
	int cgid;
	String colname;
	int colfee;

	void collegeinfo()
	{
		System.out.println(cgid+" "+colname+"  "+colfee);
	}
	
	//store data into variables using method
	void collegeData(int id,String name,int fee)  //local variables to store data and reassign to main variables
	{
		cgid=id;
		colname=name;
		colfee=fee;
	}
	
	College(int id,String name,int fee)
		{
		cgid=id;
		colname=name;
		colfee=fee;
		}
}
