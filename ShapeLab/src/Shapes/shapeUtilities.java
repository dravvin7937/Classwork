package Shapes;

import java.util.Random;

public class shapeUtilities {
	public static double sumPerimeter(Shape[] shapeArray)
	{
		double sum = 0;
		int count = 0;
		while(count<shapeArray.length)
		{
			sum+= shapeArray[count].perimeter();
			count++;
		}
		return sum;
	}
	public static double sumArea(Shape[] shapeArray)
	{
		double sum = 0;
		int count = 0;
		while(count<shapeArray.length)
		{
			sum+= shapeArray[count].area();
			count++;
		}
		return sum;
	}
	/**
     * Creates a random shape from the choices.
     * @return Shape
     * Student Work: Update with your own shape.
     */
	public static Shape getRandomShape()
	{
		Random r = new Random();
		int x = r.nextInt(5);
		
		switch(x)
		{
		case 0: 
			return new Circle(r.nextInt(100)+1);
		case 1: 
			return new Rectangle(r.nextInt(100)+1, r.nextInt(100)+1);
		case 2: 
			return new Square(r.nextInt(100)+1);
		case 3:
			return new Triangle(r.nextInt(100)+1, r.nextInt(100)+1, r.nextInt(100)+1, r.nextInt(100)+1);
		case 4: 
			return new Parallelogram(r.nextInt(100)+1, r.nextInt(100)+1, r.nextInt(100)+1);
		default:
			return new Circle(r.nextInt(100)+1);
		}
	}
}
