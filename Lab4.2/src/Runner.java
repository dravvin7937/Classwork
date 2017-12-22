import java.io.File;
import java.util.List;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.stage.Stage;

//file is called babies.csv

public class Runner {

	public static void main(String[] args)
	{
//		List<Score> scores = CSVUtilities.readFromCSV("scores.csv");
//		for (Score s : scores)
//		{
//			System.out.println(s);
//		}
//		CSVUtilities CSVData = new CSVUtilities(fileName);
//		CSVUtilities.getColumnHeaders();
	}
	
	public void start(Stage stage)
	{
		File myCSV = new File("scores.csv");
		
		CSVUtilities mine = new CSVUtilities(myCSV);
		
		//setting it up
		stage.setTitle("Hello");
		final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Number of Test Takers");
        yAxis.setLabel("Average Score");
        
        //creating
        final LineChart<Number,Number> lineChart = new LineChart<Number,Number>(xAxis,yAxis);
        lineChart.setTitle("Number of test takers vs avg scores");
	}
}
