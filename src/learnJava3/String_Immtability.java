package learnJava3;

public class String_Immtability {

	public static void main(String[] args) {
		
	//VIMP. Ex1: to reverse a string,no method to revrse a string,only Logic 	
		//Approach 1
		String s="WORLD"; //output DLROW
        String rev="";
     
         for(int i=s.length()-1;i>=0;i--)
         {
        	rev=rev+s.charAt(i); 
         }
         System.out.println("Reverse of string:"+rev);
	
	   //Approach 2 --without using string method
         String s1="welcome";
         String rev1="";
         
         char a[]=s1.toCharArray();
         
         for(int j=a.length-1;j>=0;j--)
         {
        	 rev1=rev1+a[j];
         }
         System.out.println("Reversal of String: "+rev1);
	}

}
