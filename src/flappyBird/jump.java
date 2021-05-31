package src.flappyBird;
import java.awt.*;
import java.util.*;

public class jump extends FlappyBird {
	
	public jump() {

		if (gameOver) {

			bird = new Rectangle(WIDTH/2 - 10, HEIGHT/2 - 10, 20, 20);
			columns.clear();
			yMotion = 0;
			score = 0;

			columns = new ArrayList<Rectangle>();
			
			addColumn(true);
			addColumn(true);
			addColumn(true);
			addColumn(true);

			gameOver = false;

		} 

		if (!started) {

			started = true;
		} 
		else if (!gameOver) {
			if (yMotion > 0)
				yMotion = 0;
			else 
				yMotion -= 10;
		}
	}
}
