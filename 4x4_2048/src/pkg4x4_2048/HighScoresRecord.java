
package pkg4x4_2048;

import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HighScoresRecord {

    public static void main(String[] args) throws FileNotFoundException {
        
        try{
            
            Scanner in = new Scanner(System.in);           
            int TotalScore = 0;
            int confirm;
            //
            System.out.println("HIGH SCORES");
            
            Scanner sc = new Scanner(new File("High_Scores.txt"));
            String scr = sc.nextLine();
            int allScores[] = new int[5];
            int c = 0;

            while(sc.hasNextInt()){
                allScores[c] = Integer.getInteger(sc.nextLine());
                c++;
                
            }
//            for(int pass = 1; pass < allScores.length; pass++){
//                for(int i = 0; i < allScores.length - pass; i++){
//                    if(allScores[i] < allScores[i+1]){
//                        int hold = allScores[i];
//                        allScores[i] = allScores[i+1];
//                        allScores[i+1] = hold;
//                    }
//                }
//            }
//            int rank = 1;
//            for(int x = 0; x < 5; x++){
//                System.out.println((rank)+". "+allScores[x]);
//                rank++;
//            }
            
            
            
            System.out.println("Press any +ve number to start");
            confirm = in.nextInt();
            System.out.println("");
            
            while(confirm >= 0){
                System.out.print("POWER   ");
                int pow = in.nextInt();
                if(pow >= 0){
                    TotalScore += pow;
                    confirm = pow;
                }
                else{
                    break;
                }
            }
            
           
            BufferedWriter wr = new BufferedWriter(new FileWriter("High_Scores.txt",true));
            wr.write(String.valueOf(TotalScore));
            wr.append('\n');
            wr.close();
            
        }catch (IOException e){
            //Logger.getLogger(HighScoresRecord.class.getName()).log(Level.SEVERE, null, ex);
        }catch (NumberFormatException e){
            
        }
    }
    
}
