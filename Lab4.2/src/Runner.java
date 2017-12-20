import java.util.ArrayList;
import java.util.List;

//file is called babies.csv

public class Runner {

	public static void main(String[] args)
	{
		List<Score> scores = CSVUtilities.readFromCSV("scores.csv");
		for (Score s : scores)
		{
			System.out.println(s);
		}
//		CSVUtilities CSVData = new CSVUtilities(fileName);
//		CSVUtilities.getColumnHeaders();
	}
	
}
