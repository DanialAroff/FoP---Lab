
package l7q3;
import java.io.*;

public class L7Q3 {

    public static void main(String[] args) {
        
        try{
            BufferedReader buff = new BufferedReader(new FileReader("AncientGreymon.txt"));
            BufferedWriter reverse = new BufferedWriter(new FileWriter("reverse.txt"));
            String line;
            while((line = buff.readLine()) != null){
                StringBuilder line1 = new StringBuilder();
                line1.append(line);
                line1 = line1.reverse();
                System.out.println(line1);
                //toString()is needed when writing a StringBuilder into a text file
                reverse.write(line1.toString());
                
            }
            reverse.close();
            buff.close();
        }catch (IOException e){
            System.out.println("Problem");
        }    
        
    }
    
}
