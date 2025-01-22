package learnJava3;

public class String_StringBuffer_StringBuilder {

	public static void main(String[] args) {
		//difference between string/string builder/string buffer
		
		String s="welcome";
		/*StringBuffer a=new StringBuffer("welcome");
		StringBuilder a=new StringBuilder("welcome");
		*/
		
		//Approach 1:Reverse using stringBuffer class
		StringBuffer a=new StringBuffer("welcome");
		System.out.println(a);
		System.out.println("Reverse:"+a.reverse());
	    
		StringBuilder b=new StringBuilder("technical");
	    System.out.println("Reverse using method:"+b.reverse());
	    
	    /*Mutable - we can change (stringBuilder & stringBuffer) append method
	    Any method/operation is changing the original operation and store same value
	    
	    Immutable - we can't change - String,no append(concat method)
	    Any method/operation is not changing the original operation and get same value
	    */
	    
	    String s1="Immutable";
	    s1.concat("no change in original");
	    System.out.println(s1);  //cannot change ,o/p - welcome
	
	    //StringBuffer ,StringBuilder - only difference in memory
	    StringBuffer s2=new StringBuffer("Mutable");
	    s2.append(" can be changed");  //append method to concat 2 string value
	    System.out.println(s2);
	
	}

}
