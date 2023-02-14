import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyDrawing extends JPanel {
	private Cat cat;
	private Sus sus;
	public MyDrawing() 
	{
		// Add critters to the drawing
		cat = new Cat();
		sus = new Sus();
;	}
	// paintComponent is called automatically when the frame needs
	// to display (e.g., when the program starts)
	public void paintComponent(Graphics g) {
		cat.draw(g, 175, 175);
		sus.draw(g, 300, 50);
		sus.draw(g, 300, 300);
		sus.draw(g, 50, 50);
		sus.draw(g, 50, 300);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		// Create a JPanel (MyDrawing), we'll draw on this
		frame.setContentPane(new MyDrawing());
		// Program will end when the window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the size (otherwise only title bar displays)
		frame.setSize(800, 800);
		
		// Frame will not display until you set visible true
		frame.setVisible(true);
	}

}
