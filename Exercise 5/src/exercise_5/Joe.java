package exercise_5;

import javax.swing.*;
import java.awt.*;

public class Joe {
	protected static void joeframe(){

	JFrame joe = new JFrame("Booty");
	
	JLabel title = new JLabel("Enter here: ");
	JTextField belly = new JTextField();
	title.setLabelFor(belly);
	
	title.setFont(new Font("Serif", Font.PLAIN, 18));
	belly.setFont(new Font("Serif", Font.PLAIN, 18));
	joe.setLayout(new BorderLayout());
	joe.getContentPane().add(title, BorderLayout.NORTH);
	joe.getContentPane().add(belly, BorderLayout.CENTER);
	joe.setVisible(true);
	joe.setSize(500, 75);
	
	System.out.println(belly.getText());
	
	joe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
