package day3;

public class Circle implements Shape {
	
	public double area(int radius)
	{
		return (3.14*radius*radius);
	}
	public double perimeter(int radius)
	{
		return (2*3.14*radius);
	}

}
