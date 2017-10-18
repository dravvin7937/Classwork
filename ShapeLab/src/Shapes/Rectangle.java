package Shapes;

public class Rectangle implements Shape{
	private double length;
	private double width;
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	public double perimeter()
	{
		return (length*2+width*2);
	}
	public double area()
	{
		return (length*width);
	}
	@Override
    public String toString()
    {
        System.out.println("Length: " + length + "\t Width: " + width + "\t Perimeter: " + this.perimeter() + "\t Area: " + this.area());
    }
}
