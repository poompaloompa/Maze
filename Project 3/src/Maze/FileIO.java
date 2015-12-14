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
				FileWriter fw = new FileWriter("name.txt");//grabs the file name.txt
				BufferedWriter bw = new BufferedWriter(fw);//buffered writer so java can write to the file
			
				
				bw.write("The last person to watch this maze was:");//standard message in the file
				bw.newLine();//drops down a line
				bw.write(name);//writes the string variable "name"
				bw.close();//closes the buffered writer
			}
			catch (IOException e) {
				System.out.println("Oh no, I goofed");//message that prints if there is an error
			}
			
		}//ends Write
	}

