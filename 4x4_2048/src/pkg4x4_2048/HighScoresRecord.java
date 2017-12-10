
package pkg4x4_2048;

import java.util.Scanner;
import java.io.*;

public class HighScoresRecord {

    public static void main(String[] args) throws FileNotFoundException {
        
        try{
            
            Scanner in = new Scanner(System.in);           
            int TotalScore = 0;
            int confirm;
   
            System.out.println("HIGH SCORES");            
            
            Scanner sc = new Scanner(new File("High_Scores.txt"));
            LineNumberReader rd = new LineNumberReader(new FileReader("High_Scores.txt"));
            
            int size;
            String read = "";
            while((read = rd.readLine())!= null){                
            }
            
            int line = rd.getLineNumber();
            size = rd.getLineNumber();
            int allScores[] = new int[size];
            String Scores[] = new String[size];
           
            for(int x = 0; x < Scores.length; x++){
                Scores[x] = sc.nextLine();
            }
            for(int y = 0; y < size; y++){
                String value = Scores[y].replaceAll("[^0-9]", "");
                allScores[y] = Integer.parseInt(value);
            }
            //sort scores in ascending orders
            for(int pass = 1; pass < allScores.length; pass++){
                for(int i = 0; i < allScores.length - pass; i++){
                    if(allScores[i] < allScores[i+1]){
                        int hold = allScores[i];
                        allScores[i] = allScores[i+1];
                        allScores[i+1] = hold;
                    }
                }
            }
            int rank = 1; 
            if(allScores.length<10){            
                for(int i = 0; i < allScores.length; i++){
                    System.out.println(rank+". " +allScores[i]);
                    rank++;
                }
            }    
            else
                for(int i = 0; i < 10; i++){
                    System.out.println(rank+". " +allScores[i]);
                    rank++;
                }
            
            //for test only. Takde kena mengena dgn actual task
            System.out.println("\nPress any positive number to start");
            confirm = in.nextInt();
            System.out.println("");
            
            while(confirm >= 0){
                System.out.print("SCORE   ");
                int pow = in.nextInt();
                if(pow >= 0){
                    TotalScore += pow;
                    confirm = pow;
                }
                else{
                    break;
                }
            }
            //
           
            //to print score
            BufferedWriter wr = new BufferedWriter(new FileWriter("High_Scores.txt",true));
            wr.write(String.valueOf(TotalScore));
            wr.newLine();
            wr.close();
            
        }catch (IOException | NumberFormatException e){
            System.out.println("\nNumberFormatException");
        }
    }
    
}
