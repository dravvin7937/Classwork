import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class CSVUtilities {
	
	private ArrayList<String> CSVData;
	private File csv;
	private int numColumns;
	
	public CSVUtilities(File csv)
	{
		this.csv = csv;
		
		List<Score> scores = new ArrayList<>();
		
//		try (BufferedReader br = Files.newBufferedReader(csv, StandardCharsets.US_ASCII))
//		{
//			String line = br.readLine();
//		}
	}
	
	public static List<Score> readFromCSV(String fileName)
	{
		List<Score> scores = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		
		try (BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII))
		{
			String line = br.readLine();
			while (line != null)
			{
				String[] attributes = line.split(",");
				
				Score score = createScoreList(attributes);
				scores.add(score);
				
				line = br.readLine();
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		return scores;
	}
	
	private static Score createScoreList(String[] metadata)
	{
		String name = metadata[0];
		int numTakers = Integer.parseInt(metadata[1]);
		int reading = Integer.parseInt(metadata[2]);
		int math = Integer.parseInt(metadata[3]);
		int writing = Integer.parseInt(metadata[4]);
		return new Score(name, numTakers, reading, math, writing);
	}
	
//	public List<String> getColumnHeaders()
//	{
//		//return first row
//	}
//	
//	public List<String> getDataString(int column)
//	{
//		//get all data from a csertain column
//	}
//	
//	public List<Integer> getDataInt(int column)
//	{
//		//get all data as converted to an int
//	}
//	
//	public List<Double> getDataDouble(int column)
//	{
//		//get all data as converted to a double	
//	}
}
