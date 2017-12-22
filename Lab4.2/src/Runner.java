import java.io.File;
import java.util.List;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.stage.Stage;

public class Runner {

	public static void main(String[] args)
	{
		File myCSV = new File("scores.csv");
		
		CSVUtilities mine = new CSVUtilities(myCSV);
		
//		for (String s : mine.getColumnHeaders())
//		{
//			System.out.println(s);
//		}
		
		// tests the printing of school names 
//		for (String s : mine.getDataString(1))
//		{
//			System.out.println(s.toUpperCase());
//		}
		
		//test printing of number of students who took the test
		for (int s : mine.getDataInt(2))
		{
			System.out.println(s);
		}
			
	}
	
	public void start(Stage stage)
	{
		
		
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
