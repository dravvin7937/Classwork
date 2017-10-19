package Shapes;

public class Triangle implements Shape{
	private double base;
	private double height;
	private double side1;
	private double side2;
	
	public Triangle(double base, double height, double side1, double side2)
	{
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
	}
	public double perimeter()
	{
		return base+side1+side2;
	}
	public double area()
	{
		return base*height/2;
	}
	@Override
    public String toString()
    {
        return "Base: " + base + "\t Height: " + height + "\t Side1: " + side1 + "\t Side2: " + side2 + "\t Perimeter: " + this.perimeter() + "\t Area: " + this.area();
    }
}
