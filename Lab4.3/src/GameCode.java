import java.util.Timer;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * FastClicker Game - 4.3 (easy)
 * Created by Dana Ravvin
 * Began 1/8/18
 */

public class GameCode extends Application  {
	
	//created fields so i can use them in backend 
	
	static int score = 0;
	//game started
	static boolean game = true;
	
    static Button button = new Button("Click me!");
    
    static long timer = System.nanoTime() + 10000000000L;
    
    //launch the button
	public static void main(String[] args) 
	{
        Application.launch(args);
        
        //BackEnd.writeCSV();
    }
	
	//sets the scene
    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("FastClicker Game");

        VBox vbox = new VBox(button);
        
        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        vbox.setAlignment(Pos.CENTER);
        button.setMinSize(175, 100);
        
      //creates the score increase for every click
		button.setOnAction(new EventHandler<ActionEvent>() 
		{
		    @Override
		    public void handle(ActionEvent actionEvent) {
		        if (game == true)
		        {
		        		score++;
		        }
		    }
		}
		);
        
		BackEnd.startTime.start();

	    Text scores = new Text(10,50,Integer.toString(score));
	    
		
    }   
}

/*
 * timer works - button greys out after 10 seconds. text with score not yet implemented 
