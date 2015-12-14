package Maze;
import javax.swing.JFrame;

public class MazeFrame {

	public static void frame() {//creates the JFrame board that the Maze Controller uses
		JFrame window = new JFrame("Maze Solver");
        window.setContentPane(new MazeController());
        window.pack();
        window.setLocation(120, 80);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
	}
}
