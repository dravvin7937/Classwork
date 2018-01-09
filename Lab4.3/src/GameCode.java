import java.util.Timer;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * FastClicker Game - 4.3 (easy)
 * Created by Dana Ravvin
 * Began 1/8/18
 */

//public class GameCode extends Application{
//
//	/*
//	 * create a button in the center of the screen
//	 * create a counter
//	 * check if the button is clicked
//	 * 	if it is clicked, add to the counter
//	 * 
//	 * create timer that goes up to 10 seconds and begins upon the first click
//	 * when timer ends record player's name and high score (number of clicks from the counter) and add to the csv
//	 * 
//	 * display score list
//	 */
//	int score = 0;
//	boolean game = true;
//	public static void main(String[] args) 
//	{
//		
//		
//		Application.launch(args);
//	}
//	
//	@Override
//	public void start(Stage stage)
//	{
//		//sets up the stage and button
//		stage.setTitle("FastClicker Game");
//		Button button = new Button();
//		button.setText("Click me as fast as you can");
//		
////		primaryStage.setScene(new Scene(root, 300, 250));
////		primaryStage.show();
//		
//		//creates the score increase for every click
//		button.setOnAction(new EventHandler() {
//		    @Override
//		    public void handle(ActionEvent actionEvent) {
//		        if (game == true)
//		        {
//		        		score++;
//		        }
//		    }
//		});
//		
//		Scene scene = new Scene(button, 200, 100);
//		stage.setScene(scene);
//        stage.show();
//	}
//	

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
    }
	
	//sets the scene
    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("FastClicker Game");

        Scene scene = new Scene(button, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
        
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
    }   
}


