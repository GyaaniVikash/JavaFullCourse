package learnJava3;

public class StringMethod {

	public static void main(String[] args) {
		
		//length of string
		String s="welcome";
		System.out.println(s.length());//returns length of string
		String s1="World";
		int i=s1.length();
		System.out.println(i);//length of string using data type
		
		//to join 2 string
		System.out.println(s+s1); //using + 
		System.out.println(s.concat(s1)); //join using concat
		String s2="  Technical Guru ";
		String s3="Youtube Channel";
		
		System.out.println(s1.concat(s2).concat(s3));//join string more than 2 string
	    
		//remove spaces
		System.out.println(s2.trim());   //remove space left and right of string
		System.out.println("Before using trim,string length:"+s2.length());//after using trim,length = 
		System.out.println("After using trim,string length:"+s2.trim().length());//after using trim,length = 
	    
		//charAt - returns a character from a string,index start from 0
		String s4="famous";
		System.out.println(s4.charAt(4));  //return particular character 5th-index
		
		//contains() to check if string is part of main string,always returns boolean value
		System.out.println(s4.contains("Fam"));  //returns false since F is upper case
		System.out.println(s4.contains("fam"));  //returns true since f is lower case
		System.out.println(s.contains("come"));  //returns true and sequence should match exactly
		
		//equals,equalsIgnoreCase() - compare String
		System.out.println("Comparison");
		String s5="compare";
		String s6="compare";
		String s7="COMPARE";
		System.out.println(s5.equals(s6));//true
		System.out.println(s4.equals(s5)); //false
		System.out.println(s5.equalsIgnoreCase(s7)); //ignore upper case
		
		//to replace single/multiple character
		String s8="Welcome Automation classes";  //Welxome Automation xlasses
		System.out.println(s8.replace('c','x')); //replace c with x
		System.out.println(s8.replace("Automation","Java"));  //replace single string or multiple string
	    
		//substring - extract substring from main string
		String s9="Aeroplane"; //Ape,lane,ear - count index 0,1...8
	    System.out.println(s9.substring(5, 9)); //to print lane,start index -5 end index+1
	    System.out.println(s9.substring(0, 4));
	    
	    //convert tolowercase touppercase
	    System.out.println(s9.toUpperCase()); //to uppercase
	    System.out.println(s7.toLowerCase());
	    
	    //split() -to split the string into multiple parts based on delimeter 
	    String s10="vikash.eie.aec@gmail.com";  //@ is delimeter or space
	    String a[]=s10.split("@");   //split into 2 string ,returns Array
	    System.out.println("Usernname:"+a[0]);  //print 1st array element,0th index
	    System.out.println("Host ID:"+a[1]);    //print 1st array element,1st index
	    
	    //Ex1: replace
	    String s11="$451,000";
	    System.out.println("Amount: "+s11.replace("$",""));
	    
	}

}
