package learnJava3;

public class String_Comparison {

	public static void main(String[] args) 
	{
		/*Difference between == and equals()\
		 == comapre the object
		 equals() - comapre the value of object
		 Difference between String s= "hello"
		 String s =new String("Hello") 
        */
		//case 1
		String s1="welcome";
		String s2="welcome";
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //returns true
		
		//case 2: new keyword create object
		String s3=new String("welcome");
		String s4=new String("welcome");
		System.out.println(s3==s4);  //return false(compare the object)
		System.out.println(s3.equals(s4));  //return true(compare the value of object)
		
		//case 3
		String s5="new";
		String s6=new String("new");System.out.println(s3==s4);  //return false(compare the object)
		System.out.println(s5==s6); //false
		System.out.println(s5.equals(s6)); //true,values are equal
		
		//case 4
		String s7="world";
		String s8=new String("world");System.out.println(s3==s4);  //return false(compare the object)
		String s9=s8;
		
		System.out.println(s7==s8); //false
		System.out.println(s7.equals(s8));
		
		System.out.println(s9==s8); //true,objects are same
		System.out.println(s9.equals(s8)); //true
		System.out.println(s9==s7);//false
		System.out.println(s7.equals(s9)); //true
	}

}
