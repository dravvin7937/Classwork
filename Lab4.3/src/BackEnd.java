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
}
