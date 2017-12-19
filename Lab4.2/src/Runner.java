import java.util.ArrayList;

//file is called babies.csv

public class Runner {

	public static void main(String[] args)
	{
		String fileName = "names.csv";
		
		CSVUtilities CSVData = new CSVUtilities(fileName);
		CSVUtilities.getColumnHeaders();
	}
	
}
