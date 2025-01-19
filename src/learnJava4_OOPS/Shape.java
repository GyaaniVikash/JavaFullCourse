package learnJava4_OOPS;

public class Shape {
	
	//constructor Overloading(same constructor name with different forms)
	double width,length,height;
	
	Shape()        //const. 1
	{
		width=3.5;
		length=4.5;
		height=5;
	}
	
	Shape(double w,double l,double h)  //const. 2
	{
		width=w;
		length=l;
		height=h;
	}
	
	Shape(double len)   //const. 3
	{
		width=length=height=len;
	}
	
	double volume()
	{
		return(width*length*height);
	}
}
