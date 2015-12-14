package party;

import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;

public class Sound extends JFrame {
public Sound() {
	
	 try {
         // Open an audio input stream.
         File file = new File("/Users/peterhansen/Documents/git/Exercise 5/club_01.wav");
         AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);
         // Get a sound clip resource.
         Clip clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
      } catch (UnsupportedAudioFileException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (LineUnavailableException e) {
         e.printStackTrace();
      }
   }

}
