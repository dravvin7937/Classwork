import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javafx.animation.AnimationTimer;

public class BackEnd {
	
	//creates timer that goes up to 10 seconds (10000000000 nanosec = 10s)
	static AnimationTimer startTime = new AnimationTimer()
		{
			public void handle(long now)
			{
				if(now > GameCode.timer)
				{
					GameCode.timer = now + 10000000000L;
					GameCode.game = !GameCode.game;
				}
				if(!GameCode.game)
				{
					GameCode.button.setDisable(true);
				}
			}
		};
		
	public static void writeCSV()
	{
		PrintWriter pw = null;
		try
		{
			pw = new PrintWriter(new File("high_scores.csv"));
		}
		catch (FileNotFoundException e)
		{
			System.err.println(e);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("Name,Scores\n");
		
//			for (int col = 0; col < numColumns; col++)
//			{
//				if (CSVData.get(col).equals("\n"))
//					col++;
//				else
//					sb.append(CSVData.get(col));
//			}
		pw.write(sb.toString());
		pw.close();
	}		
}
