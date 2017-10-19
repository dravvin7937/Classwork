package Shapes;

public class Circle implements Shape{
	private double radius;
	private static double pi = 3.14;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public double perimeter()
	{
		return 2*radius*pi;
	}
	public double area()
	{
		return radius*radius*pi;
	}
	@Override
    public String toString()
    {
        return "Radius length: " + radius + "\t Perimeter: " + this.perimeter() + "\t Area: " + this.area();
    }
}
