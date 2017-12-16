
package pkg4x4_2048;

import java.util.Scanner;
import java.io.*;

public class HighScoresRecord {

    public static void main(String[] args) throws FileNotFoundException {
        try{
            File f = new File("High_Scores.txt");
            if(f.isFile()){}
            else{
                f.createNewFile();
            }
        }catch(IOException e){
            System.out.println("Problem with output");
        }
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
            int allScores[] = new int[size];    //
            String Scores[] = new String[size]; //
            String Names[] = new String[size];
            String allNames[] = new String[size];
           
            for(int x = 0; x < Scores.length; x++){
                Names[x] = sc.next();
                Scores[x] = sc.next();
            }
            for(int z = 0; z < size; z++){
                String value = Names[z].replaceAll("[^0-9A-Za-z]", "");
                allNames[z] = value;
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
                        
                        String temp = allNames[i];
                        allNames[i] = allNames[i+1];
                        allNames[i+1] = temp;
                    }
                }
            }
            int rank = 1; 
            if(allScores.length<10){            
                for(int i = 0; i < allScores.length; i++){
                    System.out.printf("%d. %-10s%d\n",rank,allNames[i],allScores[i]);
                    rank++;
                }
            }    
            else
                for(int i = 0; i < 10; i++){
                    System.out.printf("%d. %-10s%d\n",rank,allNames[i],allScores[i]);
                    rank++;
                }
            
            //for test only. Takde kena mengena dgn actual task
            System.out.print("Enter name : ");
            String name = in.nextLine();
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
            try ( //to print score
                    BufferedWriter wr = new BufferedWriter(new FileWriter("High_Scores.txt",true))) {
                
                wr.write(name);
                wr.write(" ");
                wr.write(String.valueOf(TotalScore));
                wr.newLine();
            }
            
        }catch (IOException e){
            System.out.println("\nNumberFormatException");
        }catch (NullPointerException e){
            System.out.println("\nNo names");
        }
    }
    
}
