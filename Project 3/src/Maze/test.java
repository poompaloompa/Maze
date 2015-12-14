package Maze;
import java.awt.*;
import javax.swing.*;

/**
 * Creates a random maze, then solves it by finding a path from the
 * upper left corner to the lower right corner.  (After doing
 * one maze, it waits a while then starts over by creating a
 * new random maze.)
 */
public class test  //Runnable courtesy of https://docs.oracle.com/javase/tutorial/essential/concurrency/runthread.html
{
    
    // a main routine makes it possible to run this class as a program
    public static void main(String[] args) {
    	
        MazeFrame.frame();
        new MazeController();
    }
    

    

}