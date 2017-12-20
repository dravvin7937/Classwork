
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
	@Override
	public String toString()
	{
		return "[School: " + name + ", number of takers: " + numTakers + "]";
	}
}
