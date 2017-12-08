
package testdh;

import java.util.Scanner;
import java.io.*;
import sun.audio.*;

public class TestDH {

    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        try{
                PrintWriter tulis = new PrintWriter("D:\\Aroff\\DH.txt");
                
                char one = '\u2460';
                
                System.out.println("Press " + one + " to play music");
                System.out.print("\n\n\t");
                int initiate = in.nextInt();
                
                
                BufferedReader ok = new BufferedReader(new FileReader("D:\\Aroff\\Test.txt"));
                String V = ok.readLine();
                
                tulis.println(initiate);
                
                if(initiate==1){
                    FileInputStream tuturu = new FileInputStream("D:\\Aroff\\Programming\\Sounds\\Tuturu.wav");
                    AudioStream audioStream = new AudioStream(tuturu);
                    AudioPlayer.player.start(audioStream);
                    System.out.println("\nTUTURU!");
                    tulis.println("   Number" +initiate+" was entered.");
                    tulis.println("Action: ");
                    tulis.print("    Play music");
                    //audioStream.close();
                }
                else{
                    tulis.println("   Number" +initiate+" was entered.");
                    tulis.println("Action: ");
                    tulis.print("    End");
                }
                tulis.close();
                
            
        }catch (IOException e){
            System.out.print("");
        }
        
    }
}
