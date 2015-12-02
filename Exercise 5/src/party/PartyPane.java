package party;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
public class PartyPane {
	
	
protected static double JoeFrame(){
	double x = 0;
	double y = 1.25;
	double z = 0;
	JFrame party = new JFrame();
	//party.setLayout(new BorderLayout());
	party.setExtendedState(JFrame.MAXIMIZED_BOTH);
	String oh = new String("party");
	String yea = "";
	for(int i = 0; i < oh.length(); i++)
	{
		
		if (i % 2 == 0) {
			yea = yea + (oh.substring(i, i + 1)).toUpperCase();
		}
		else {
			yea = yea + (oh.substring(i, i + 1)).toLowerCase();
		}
	}
	
	JLabel title = new JLabel(yea);
	title.setFont(new Font("Calbri", Font.BOLD, 300));
	//party.add(title, BorderLayout.CENTER);
	party.add(title);
	title.setHorizontalAlignment(title.CENTER);
	party.pack();
	party.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

	while(z < 100){
	party.getContentPane().setBackground(Color.RED);
    party.setVisible(true);
    try {Thread.sleep(10);}
    catch (InterruptedException e)
    {e.printStackTrace();}
    party.getContentPane().setBackground(Color.orange);
    party.setVisible(true);
    try {Thread.sleep(10);}
    catch (InterruptedException e)
    {e.printStackTrace();}
    party.getContentPane().setBackground(Color.yellow);
    party.setVisible(true);
    try {Thread.sleep(10);}
    catch (InterruptedException e)
    {e.printStackTrace();}
    party.getContentPane().setBackground(Color.green);
    party.setVisible(true);
    try {Thread.sleep(10);}
    catch (InterruptedException e)
    {e.printStackTrace();}
    party.getContentPane().setBackground(Color.blue);
    party.setVisible(true);
    try {Thread.sleep(10);}
    catch (InterruptedException e)
    {e.printStackTrace();}
    party.getContentPane().setBackground(Color.pink);
    party.setVisible(true);
    try {Thread.sleep(10);}
    catch (InterruptedException e)
    {e.printStackTrace();}
    party.getContentPane().setBackground(Color.CYAN);
    party.setVisible(true);
    try {Thread.sleep(10);}
    catch (InterruptedException e)
    {e.printStackTrace();}
    party.getContentPane().setBackground(Color.MAGENTA);
    party.setVisible(true);
    try {Thread.sleep(10);}
    catch (InterruptedException e)
    {e.printStackTrace();}
    z = z+10;
    
	}
	return z;
}

}
