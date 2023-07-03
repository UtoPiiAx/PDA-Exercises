import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PythagorasTree {

	public static void drawTreeOfPythagoras(double size) {
		drawSquare(size);
		if (size > 3) {
			forward(size);
			turnLeft(30);
			drawTreeOfPythagoras(size * 0.5 * Math.sqrt(3));
			turnRight(90);
			forward(size * 0.5 * Math.sqrt(3));
			drawTreeOfPythagoras(size * 0.5);
			forward(-size * 0.5 * Math.sqrt(3));
			turnLeft(60);
			forward(-size);
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Tree of Pythagoras");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(true);
		frame.setLayout(new BorderLayout());
		JPanel canvas = new JPanel() {
			private static final long serialVersionUID = 1L;
			@Override
			protected void paintComponent(Graphics gr) {
				g = (Graphics2D) gr;
				g.setBackground(Color.WHITE);
				g.clearRect(0, 0, getWidth(), getHeight());
				g.setColor(Color.BLUE);
				x = this.getWidth() - 1 - INITIAL_SIZE * 3;
				y = this.getHeight() - 1 - INITIAL_SIZE;
				drawTreeOfPythagoras(INITIAL_SIZE);
			}
		};
		frame.add(canvas, BorderLayout.CENTER);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	private static final double INITIAL_SIZE = 100;
	private static double x = 0;
	private static double y = 0;
	private static double d = 270;
	private static Graphics2D g;

	private static void drawSquare(double size){
		for (int i = 0; i < 4; i++) {
			forward(size);
			turnRight(90);
		}
	}
	
	private static void forward(double size) {
		double newX = x + Math.cos(Math.toRadians(d)) * size;
		double newY = y + Math.sin(Math.toRadians(d)) * size;
		g.drawLine((int) Math.round(x), (int) Math.round(y), (int) Math.round(newX), (int) Math.round(newY));
		x = newX;
		y = newY;
	}
	
	private static void turnLeft(double degrees) {
		d -= degrees;
	}

	private static void turnRight(double degrees) {
		d += degrees;
	}
}
