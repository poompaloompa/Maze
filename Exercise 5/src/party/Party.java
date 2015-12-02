package party;

import javax.swing.*;
import java.awt.*;


public class Party {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String name = JOptionPane.showInputDialog(null, "What's your name>");
		String t = JOptionPane.showInputDialog(name + " Do you want to party?");
		
		if (t.equals("yes"))
		{JOptionPane.showMessageDialog(null, "Good!");}
		
		
		else if (t.equals("sure"))
		{JOptionPane.showMessageDialog(null, "Well then, lets party!");}
			
		else if (t.equals("yea"))
		{JOptionPane.showMessageDialog(null, "Sick.. I'm a fan of the party!");}
		
		else if (t.equals("no"))
		{JOptionPane.showMessageDialog(null, "THERE IS NO ESCAPE!");}
		
			PartyPane.JoeFrame();
			FileIO.Write(name);
			FileIO.Read();
			System.exit(0);
	}

}
