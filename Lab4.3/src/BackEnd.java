import javafx.animation.AnimationTimer;

public class BackEnd {

	
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
				GameCode.status.setText("Game Over!");
			}
			
			GameCode.playerScore.setText("Score: " + Integer.toString(GameCode.score) + "       ");
		}
	};
	
}
