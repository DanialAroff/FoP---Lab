//for coding testing 
package testdh2;
//Danial.A
import java.io.*;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.TargetDataLine;

public class TestDH2 {

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        try (AudioInputStream ss = new AudioInputStream((TargetDataLine) new FileInputStream("D:\\Aroff\\Programming\\Sounds\\Tuturu.wav"))) {
            System.out.println("Enter number 1 : ");
            int i = sc.nextInt();
            if (i == 0){
                ss.read();
            }
        }
    }
    //32658241+DanialAroff@users.noreply.github.com
}
