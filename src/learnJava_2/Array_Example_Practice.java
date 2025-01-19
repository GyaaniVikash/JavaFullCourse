package learnJava_2;

import java.util.Arrays;

public class Array_Example_Practice {

	public static void main(String[] args) {
		// to find Sum of array a[1,2,3,4,5,6]
		//to find no. of even and odd from given array
		
		//EX:1-to search element from an Array - linear search)
		
		int a[]= {12,28,24,17,26};
		int search=27;             //declare to search the number from Array
		boolean status=false;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==search)
			{
				System.out.println("Expected no. found");
			    status=true;
				break;
			}
		}
		
		if(status==false)
		{
		System.out.println("Not found");
		}
		
       //EX:2- To find number of repititions
	   //EX 3:sorting an from an Array - 100,45,17,98,310,322,70
		int x[]= {100,45,17,98,310,322,70};
		
		System.out.println("Before sorting "+Arrays.toString(x));   //to print all array value
	    
		Arrays.sort(x);    //to sort arrays value ,to sort String
		System.out.println("After sorting: "+Arrays.toString(x));
	
		//EX 4:To sort string
		String s[]= {"Vikash","Engineer","Married","Parent"};
        System.out.println("Before sorting "+Arrays.toString(s));   //to print all array value
	    
		Arrays.sort(s);    //to sort arrays value ,to sort String
		System.out.println("After sorting: "+Arrays.toString(s));
	
	   //EX 5: To rverse an Array using sort
	
	
	
	}

}
