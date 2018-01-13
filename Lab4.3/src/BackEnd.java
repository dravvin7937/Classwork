import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
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
		
	public static void writeCSV(List<Player> scores)
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
		
		for (int row = 1; row < scores.size(); row++)
		{
			sb.append(scores.get(row).name + "," + scores.get(row).score + "\n");
		}
		
		pw.write(sb.toString());
		pw.close();
	}	
	
    public static void addToFile(String file, String line)
    {
	    	try (FileWriter fw = new FileWriter(Paths.get(file).toString(), true);) 
			{
				for (String string : line.split(",")) 
				{
			 		fw.append(string);
			 		fw.append(',');
			 	}
			 	fw.append('\n');
			 	fw.flush();
			 	fw.close();
			} 
			catch (IOException e) 
			{
			 	e.printStackTrace();
			}
    }	
    
    static List<Player> readFromCSV(String file) 
	{ 
		List<Player> scores = new ArrayList<>(); 
		Path pathToFile = Paths.get(file);
		try (BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII)) 
		{
			String line = br.readLine();
			while (line != null)
			{
				String[] info = line.split(",");
				Player player = GameCode.createPlayer(info);
				scores.add(player);
				line = br.readLine();
			}
		} 
		catch (IOException ioe) 
		{
            ioe.printStackTrace();
        }
		return scores;
	}
    
    public static void selectionSort(List<Player> l)
	{
		for(int i = 1; i < l.size(); i++)
		{
			for(int j = i+1; j < l.size(); j++)
			{
				if(Integer.parseInt(l.get(i).score) < Integer.parseInt(l.get(j).score))
				{
					swap(l,i,j);
				}
			}
		}
	}
    public static void swap(List<Player> a, int i, int j)
	{
	    Player temp = a.get(i);
	    a.set(i,a.get(j));
	    a.set(j,temp);
	}
}
