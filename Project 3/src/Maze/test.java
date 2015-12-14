package Maze;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;

public class test  
{
    
    // a main routine makes it possible to run this class as a program
    public static void main(String[] args) {
    	String name;
    	JOptionPane.showMessageDialog(null, "Welcome!");
    	name = JOptionPane.showInputDialog("What is your name?");
    
    	String regex = "^[a-zA-Z]*$";//Regex pattern to make sure the string name only contains letters
        CharSequence inputStr = name;
        Pattern pattern = Pattern.compile(regex);//creates a pattern of the regex string
        Matcher matcher = pattern.matcher(inputStr);//matches regex pattern with the input string, name
        if(matcher.matches())
        {
            FileIO.Write(name);
        	MazeFrame.frame();//initializes mazeFrame
            new MazeController();//creates a new maze controller
        }
        else
        {
            JOptionPane.showMessageDialog(null, "That is not a name!");
        }
    }

    

}