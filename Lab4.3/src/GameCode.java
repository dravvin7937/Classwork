
import java.util.List;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * FastClicker Game - 4.3 (easy) COMPLETE
 * Created by Dana Ravvin
 * Began 1/8/18
 */

public class GameCode extends Application  {
	
	//created fields so i can use them in backend 	
	static int score = 0;
    static Text sc = new Text("Score: 0");
    
	//game started
	static boolean game = true;
    static Button button = new Button("Click me!");
    static long timer = System.nanoTime() + 10000000000L;
    
    //launch the button
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Your name?");
		String name = in.next();
		
        Application.launch(args);
        
        BackEnd.addToFile("high_scores.csv", name + "," + score);
        List<Player> scores = BackEnd.readFromCSV("high_scores.csv");
        BackEnd.selectionSort(scores);
        BackEnd.writeCSV(scores);
        System.out.println("score added");
    }
	
	//sets the scene
    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("FastClicker Game");

        button.setMinSize(175, 100);
        
      //creates the score increase for every click
		button.setOnAction(new EventHandler<ActionEvent>() 
		{
		    @Override
		    public void handle(ActionEvent actionEvent) {
		        if (game == true)
		        {
		        		score++;
		        		sc.setText("Score: " + score);
		        }
		    }
		}
		);

		BackEnd.startTime.start();
        VBox vbox = new VBox(sc,button);
        
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        vbox.setAlignment(Pos.CENTER);
    }   
    
	static Player createPlayer(String[] metadata) 
	{ 
		String name = metadata[0]; 
		String score = metadata[1]; 
		return new Player(name, score);
	}
}