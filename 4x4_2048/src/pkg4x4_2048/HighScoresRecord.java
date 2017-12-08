
package pkg4x4_2048;

import java.util.Scanner;
import java.io.*;

public class HighScoresRecord {

    public static void main(String[] args) throws FileNotFoundException {
        
        try{
            
            Scanner in = new Scanner(System.in);           
            int TotalScore = 0;
            int confirm;
            //
            System.out.println("HIGH SCORES");
            
            
            Scanner sc = new Scanner(new File("High_Scores.txt"));
            LineNumberReader rd = new LineNumberReader(new FileReader("High_Scores.txt"));
            
            int size;
            String read = "";
            while((read = rd.readLine())!= null){
                
            }
            int line = rd.getLineNumber();
            size = rd.getLineNumber();
            //using BufferedReader
//            BufferedReader bf = new BufferedReader(new FileReader("High_Scores.txt"));
//            
//            System.out.println(bf.readLine());
//            System.out.println(bf.readLine());
            System.out.println("Number of lines is "+line);//ok
            System.out.println("Length of array "+size+"\n"); //ok
            int allScores[] = new int[size];
            String Scores[] = new String[size];
           
            for(int x = 0; x < Scores.length; x++){
                Scores[x] = sc.nextLine();
            }
            
            for(int i = 0; i < size; i++){
                System.out.println(Scores[i]);
            }
            for(int y = 0; y < Scores.length; y++){
                allScores[y] = Integer.parseInt(Scores[y]);
            }
            for(int pass = 1; pass < allScores.length; pass++){
                for(int i = 0; i < allScores.length - pass; i++){
                    if(allScores[i] < allScores[i+1]){
                        int hold = allScores[i];
                        allScores[i] = allScores[i+1];
                        allScores[i+1] = hold;
                    }
                }
            }
            for(int i = 0; i < allScores.length; i++){
                System.out.println(allScores[i]);
            }
            
            
            System.out.println("\nPress any +ve number to start");
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
            //wr.append('\n');
            wr.write(String.valueOf(TotalScore));
            wr.newLine();
            wr.close();
            
        }catch (IOException | NumberFormatException e){
            System.out.println("Stupid problem");
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
        
 
    }
    
}
