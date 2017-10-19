package Shapes;

public class Parallelogram implements Shape{
	private double base;
	private double height;
	private double diagonalSide;
	
	public Parallelogram(double base, double height, double diagonalSide)
	{
		this.base = base;
		this.height = height;
		this.diagonalSide = diagonalSide;
	}
	public double perimeter()
	{
		return base*2+diagonalSide*2;
	}
	public double area()
	{
		return base*height;
	}
	@Override
	public String toString()
	{
		return "Base: " + base + "\t Height: " + height + "\t Diagonal Side: "+ diagonalSide + "\t Perimeter: " + this.perimeter() + "\t Area: " + this.area();
	}
}
