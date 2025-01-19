package learnJava_2;

public class Array {

	public static void main(String[] args) 
	{
		//Single Array
		// Array is collection of elements or same data types(Homogeneous data)
		//we can store multiple values in single variable
        
		//declare Array  Approach-1
		int a[]=new int[5]; //declare array(used to store if no. of values are known,size is fixed 
		a[0]=100;           //assign array
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		//Declare Approach--2
		int b[]= {10,20,30,40,50,60,70,80};   //size is not fixed,used to store n value,dynamic in nature
		
		//find length of array
		System.out.println("Length of array: " +b.length);
		
		//for loop -- read data of array
		System.out.println("value of index 6: " +(b[5]));
	    
		//read all data from array
		for(int i=0;i<b.length;i++)   //
		{
			System.out.println(b[i]);
		}
		//Enhanced for loop -- read all data from array
	     for(int x:b)
	    		 {
	    	       System.out.print(x +" ");
	    		 }
	}

}
