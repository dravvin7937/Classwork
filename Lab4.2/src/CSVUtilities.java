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
	
	public CSVUtilities(File csv)
	{
		this.csv = csv;
		
		try (BufferedReader br = Files.newBufferedReader(csv, StandardCharsets.US_ASCII))
		{
			String line = br.readLine();
		}
	}
	
	public List<String> getColumnHeaders()
	{
		//return first row
	}
	
	public List<String> getDataString(int column)
	{
		//get all data from a certain column
	}
	
	public List<Integer> getDataInt(int column)
	{
		//get all data as converted to an int
	}
	
	public List<Double> getDataDouble(int column)
	{
		//get all data as converted to a double	
	}
}
