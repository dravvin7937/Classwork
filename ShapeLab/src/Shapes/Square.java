package Shapes;

public class Square implements Shape{
	private double length;
	public Square(double length)
	{
		this.length = length;
	}
	public double perimeter()
	{
		return length*4;
	}
	public double area()
	{
		return length*length;
	}
}
