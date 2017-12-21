
public class Score {

	private String name;
	private int numTakers;
	private int reading;
	private int math; 
	private int writing;
	
	public Score(String name, int numTakers, int reading, int math, int writing)
	{
		this.name = name;
		this.numTakers = numTakers;
		this.reading = reading;
		this.math = math;
		this.writing = writing;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getNumTakers() 
	{
		return numTakers;
	}
	public void setNumTakers(int numTakers)
	{
		this.numTakers = numTakers;
	}
	public int getReading() 
	{
		return reading;
	}
	public void setReading(int reading)
	{
		this.reading = reading;
	}
	public int getMath() 
	{
		return math;
	}
	public void setMath(int math)
	{
		this.math = math;
	}
	public int getWriting() 
	{
		return writing;
	}
	public void setWriting(int writing)
	{
		this.writing = writing;
	}
	@Override
	public String toString()
	{
		return "[School: " + name + ", number of takers: " + numTakers + "]";
	}
}
