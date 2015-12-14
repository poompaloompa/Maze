package Maze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class FileIO {

		protected static void Write(String name) {
			
			try {
				FileWriter fw = new FileWriter("name.txt");
				BufferedWriter bw = new BufferedWriter(fw);
			
				
				bw.write("The last person to watch this maze was:");
				bw.newLine();
				bw.write(name);
				bw.close();
			}
			catch (IOException e) {
				System.out.println("Oh no, I goofed");
			}
			
		}//ends Write
	}

