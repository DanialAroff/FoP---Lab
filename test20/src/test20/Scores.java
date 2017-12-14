
package test20;

import java.io.*;
import java.util.Scanner;

public class Scores {
    
    protected int score;
    protected int totalScore;
    protected int[] cScores;    //array of scores in integer
    protected String[] Scores;  //array of scores in String
    
    public Scores(){
        totalScore = 0;       
    }
    
    public void createFile(){
        try{
            File f = new File("High_Scores.txt");
            if(f.isFile()){}
            else{
                f.createNewFile();
            }
        }catch(IOException e){
            System.out.println("Problem with output");
        }
    }
    
    public void displayHighScore() throws FileNotFoundException, IOException{
        Scanner in = new Scanner(System.in);           

        System.out.println("HIGH SCORES");            

        Scanner sc = new Scanner(new File("High_Scores.txt"));
        LineNumberReader rd = new LineNumberReader(new FileReader("High_Scores.txt")); //untuk read brp banyak line yg ada dlm txt file

        int length;
        String read = "";
        while((read = rd.readLine())!= null){                
        }

        int line = rd.getLineNumber();
        length = rd.getLineNumber();
        cScores = new int[length];   
        Scores  = new String[length];

        for(int x = 0; x < Scores.length; x++){
            Scores[x] = sc.nextLine();
        }
        for(int y = 0; y < length; y++){
            String value = Scores[y].replaceAll("[^0-9]", ""); //untuk buang semua character lain yg bukan integer dlm String tu
            cScores[y] = Integer.parseInt(value);              //convert String into integer
        }
        //sort scores in ascending orders
        for(int pass = 1; pass < cScores.length; pass++){
            for(int i = 0; i < cScores.length - pass; i++){
                if(cScores[i] < cScores[i+1]){
                    int hold = cScores[i];
                    cScores[i] = cScores[i+1];
                    cScores[i+1] = hold;
                }
            }
        }
        int rank = 1; 
        if(cScores.length<10){            
            for(int i = 0; i < cScores.length; i++){
                System.out.println(rank+". " +cScores[i]);
                rank++;
            }
        }    
        else
            for(int i = 0; i < 10; i++){
                System.out.println(rank+". " +cScores[i]);
                rank++;
            }

    }
    //add score in totalScore
    public void addScore(int score){
        totalScore = totalScore + score;
    }
    public int combinedScore(char merged){
        int mark = 0;
        int s[] = {2,3,4,5,6,7,8,9,10,11};
        char letters[] = {'B','C','D','E','F','G','H','I','J','K'};
        for(int x = 0; x < letters.length; x++){
            if(merged == letters[x]){
                mark = x;
                break;
            }
        }
        return s[mark];
    }
    //displaying score
    public void displayTotalScore(){
        System.out.println("Scores : "+totalScore);
    }
    // to print score
    public void writeScore() throws IOException{
        try (BufferedWriter wr = new BufferedWriter(new FileWriter("High_Scores.txt",true))) {
                wr.write(String.valueOf(totalScore));
                wr.newLine();
            }
    }
    
}
