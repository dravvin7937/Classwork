import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class GameCode extends Application{

	/*
	 * create a button in the center of the screen
	 * create a counter
	 * check if the button is clicked
	 * 	if it is clicked, add to the counter
	 * 
	 * create timer that goes up to 10 seconds and begins upon the first click
	 * when timer ends record player's name and high score (number of clicks from the counter) and add to the csv
	 * 
	 * display score list
	 */
	
	public static void main(String[] args) 
	{
		int score = 0;
		boolean game = true;
		
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage)
	{
		//sets up the stage and button
		stage.setTitle("FastClicker Game");
		Button button = new Button();
		button.setText("Click me as fast as you can");
		
//		primaryStage.setScene(new Scene(root, 300, 250));
//		primaryStage.show();
		
		//creates the score increase for every click
		button.setOnAction(new EventHandler() {
		    @Override
		    public void handle(ActionEvent actionEvent) {
		        if (game == true)
		        {
		        		score++;
		        }
		    }
		});
		
		Scene scene = new Scene(button, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
}
