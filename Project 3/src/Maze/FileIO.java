package Maze;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class FileIO {

		protected static void Write(String name) {
			
			try {
				FileWriter fw = new FileWriter("name.txt");
				PrintWriter pw = new PrintWriter(fw);
				
				pw.print(name);
				pw.close();
			}
			catch (IOException e) {
				System.out.println("Oh no, I goofed");
			}
			
		}//ends Write
		protected static void Read() {
			try {
				FileReader fr = new FileReader("party.txt");
				BufferedReader br = new BufferedReader(fr);
				
				String str;
					while ((str = br.readLine()) != null) {
						JOptionPane.showMessageDialog(null, str + " ..Sorry bud, The party is over.");
					}
				} catch(Exception e){};
		}//end read
	}

