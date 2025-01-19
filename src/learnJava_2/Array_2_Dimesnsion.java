package learnJava_2;

public class Array_2_Dimesnsion {

	public static void main(String[] args) 
	{
		// 2-D or Multi dimension Array ,n-row,n-column
        //declaring array Approach -1 
		int a[][]=new int[5][5];   //5 rows,5 column
	    a[0][0]=1;
	    a[0][1]=2;
	    a[0][2]=3;
	    a[0][3]=4;
	    a[0][4]=5; //.....store value for row 1 & column 5
	    a[1][0]=1;
	    a[1][1]=4;
	    a[1][2]=9;
	    a[1][3]=16;
	    a[1][4]=25; //.....store value for row 1 & column 5   
	    a[2][0]=6;
	    a[2][1]=7;
	    a[2][2]=8;
	    a[2][3]=9;
	    a[2][4]=10;  //.....store value for row 3 & column 5
	    a[3][0]=36;
	    a[3][1]=49;
	    a[3][2]=64;
	    a[3][3]=81;
	    a[3][4]=100;  //.....store value for row 4 & column 5
	    a[4][0]=11;
	    a[4][1]=22;
	    a[4][2]=33;
	    a[4][3]=44;
	    a[4][4]=55;  //.....store value for row 5 & column 5
	    //for fixed type of rows & column
		
		//declare Array - Approach -2
		int b[][]= {{1,2},{3,4},{5,6}};
		//size of Array
		System.out.println("length of row "+a.length);
		System.out.println("length of column "+a[0].length);
		
		System.out.println("length of Row 2nd Array "+b.length);
		System.out.println("length of column 2nd Array "+b[0].length);
	   
		//Read value of Array
		System.out.println("value of 2nd row 1st column: "+b[2][1]);
	    
		//normal for loop to read multiple values
		for(int i=0;i<=2;i++)   //row 0,1,2
		{
			for(int j=0;j<=1;j++)  //column 0,1
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	     for(int r=0;r<=a.length-1;r++)
	     {
	    	 for(int c=0;c<=a[0].length-1;c++) 
	    	 	{
			      System.out.print(a[r][c]+"   ");
	    	 	}
		System.out.println();
	     }
	//enhanced loop
	     for(int arr[]:b)
	     {
	    	 for(int x:arr)
	    	 {
	    		 System.out.print(x+" ");
	    	 }
	         System.out.println();
	     }
	//object type of Array - to store hetrogeneous data
	     Object d[]= {12,10.6,'V',"Hello"};  //to get all different types in array,not used in programming
	
	}

}
