package Shapes;

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
	public static Shape getRandomShape
	{
		
	}
}
