
package l7q4;

import java.io.*;
import java.util.Scanner;

public class L7Q4 {

    public static void main(String[] args) {
        int characterCount = 0;
        int linesCount = 0;
        int words = 0;
        try{                        
            try(BufferedReader buff = new BufferedReader(new FileReader("Supercomputer.txt"))){
                int character;
                while((character = buff.read())> 0){        
                    //System.out.println(character);
                    characterCount++;
                } 
            buff.close();
            }    
            try(Scanner sc = new Scanner(new FileInputStream("Supercomputer.txt"))){
                while(sc.hasNext()){
                    //System.out.println(sc.next());
                    sc.next();
                    words++;
                }  
                
            sc.close();
            }
            try (BufferedReader buff = new BufferedReader(new FileReader("Supercomputer.txt"))) {
                String line;
                while((line = buff.readLine())!= null){
                    //System.out.println(line);
                    linesCount++;
                }
            buff.close();
            }
            
        }catch(IOException e){
            System.out.println("Problem with output");
        }    
        System.out.println("Number of characters : "+characterCount);
        System.out.println("Number of words : "+words);
        System.out.println("Number of lines : "+linesCount);
    }
    
}
