package Shapes;

public class Square extends Rectangle {
	
    double side;

    public Square(double side)
    {
        super(side,side);
        this.side = side;
    }

    @Override
    public String toString()
    {
        return "Side length: " + side + "\t Perimeter: " + this.perimeter() + "\t Area: " + this.area();
    }

}
