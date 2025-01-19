package learnJava4_OOPS;

public class Student_Main {

	public static void main(String[] args) 
	{
		Student st=new Student();
		st.id=455;
		st.name="Alpesh";
		st.section='A';
		st.printdata();
		
		Student st2=new Student();
		st2.id=401;
		st2.name="Rupesh";
		st2.section='C';
		st2.printdata();
		
		Student st3=new Student();
		st3.id=420;
		st3.name="Suresh";
		st3.section='B';
        st3.printdata();
	}

}
