import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;


//comment made by Braden

public class Sus {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 100;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/5*4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/2;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 40;
	private static final int EYE_WIDTH = 10;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 20;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/2;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/5;
	private static final int MOUTH_Y = HEAD_DIMENSION/5;
	
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int susX, int susY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=susX;
		int y=susY;
		// Draw the head
		g2.setColor(Color.red);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		// Draw the eyes
		g2.setColor(Color.red);
		x = susX + EYE_X; 
		y = susY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.blue);
		x = susX + MOUTH_X;
		y = susY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		g2.setColor(Color.black);
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("sus!", susX, susY+HEAD_DIMENSION+30);	
	}
}
