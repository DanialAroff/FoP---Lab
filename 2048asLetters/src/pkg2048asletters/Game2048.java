
package pkg2048asletters;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Game2048 {
    private int numOfLetters;    
    private char[][] gameBoard;  //
    private char[][] gameBoardX; //hold previous tiles position. used for UNDO
    private int undo; 
    private int score;
    private int prevScore;
    private int totalScore;
    private int[] cScores;    //array of scores in integer
    private String[] Scores;  //array of scores in String
    private String[]Names;
    private String[] cNames;  //array of names
    private String playerName;
    
    public void newGame(int row, int column){
        Random rnd = new Random();
        numOfLetters = (row * column) / 8;
        int randomTiles[] = new int[numOfLetters];
        gameBoard = new char[row][column];
        gameBoardX = new char[row][column];
        
        for (int p = 0; p < numOfLetters; p++) {
            randomTiles[p] = rnd.nextInt(row * column);
        }
        
        for (int pass = 1; pass < randomTiles.length; pass++) {
            for (int j = 0; j < (randomTiles.length - pass); j++) {
                if (randomTiles[j] > randomTiles[j+1]) {
                    //swap elements  
                    int temp = randomTiles[j];
                    randomTiles[j] = randomTiles[j+1];
                    randomTiles[j+1] = temp;
                }
            }
        }
        int fill = 0;
        int count = 0;
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(count == randomTiles[fill]){
                    
                    System.out.print('A'+" ");
                    gameBoard[i][j] = 'A';
                    if(fill < randomTiles.length - 1){
                        fill++;
                    }
                }
                else{              
                    System.out.print('-'+" ");
                    gameBoard[i][j] = '-';
                }
                count++;
            }
            System.out.println("");
        }
    }
    public char[][]gameBoard(){
        return gameBoard;
    }
    public void record(char X[][]){
        for(int x = 0; x < X.length; x++){
            for(int y = 0; y < X[0].length; y++){
                gameBoardX[x][y] = X[x][y];
            }
        }
    }
    public void undo(){
        if(undo == 1){
            display(gameBoardX);
            undo = 0;
            for(int x = 0; x < gameBoardX.length; x++){
                for(int y = 0; y < gameBoardX[0].length; y++){
                    gameBoard[x][y] = gameBoardX[x][y];
                }
            }
            totalScore = totalScore - prevScore;
        }
        else{
            display(gameBoard);
            System.out.println("Can't undo two times in a row");
        }
    }
    public void addTiles(){        
        Random rand = new Random();
        int added = 0;
        for(int i = 0; i < gameBoard.length; i++){
            for(int j = 0; j < gameBoard[0].length; j++){
                int addOrNot = rand.nextInt();
                if(added < 1){
                    if(Character.isLetter(gameBoard[i][j])){                        
                    }
                    else{
                        if(addOrNot%3==0){
                            gameBoard[i][j] = 'A';
                            added++;
                        }
                        else{
                            gameBoard[i][j] = '-';
                        }
                    }   
                }
                else if(added>=1){
                    if(Character.isLetter(gameBoard[i][j])){
                    }
                    else{
                        gameBoard[i][j] = '-';
                    }   
                }
            }
        }    
    }
    public boolean checkAvailableMoves(char av[][]){
        int UP = 0;
        int DOWN = 0;
        int RIGHT = 0;
        int LEFT = 0;
        //UP
        for(int x = 1; x < av.length; x++){
            for(int y = 0; y < av[0].length; y++){
                if(av[x-1][y] == '-'&&Character.isUpperCase(av[x][y])){
                    UP += 1;
                }
                else if(av[x-1][y] == av[x][y] && Character.isLetter(av[x][y])){
                    UP += 1;
                }
            }
        }
        //DOWN
        for(int x = av.length-2; x >= 0; x--){
            for(int y = 0; y < av[0].length; y++){
                if(av[x+1][y] == '-'&&Character.isUpperCase(av[x][y])){
                    DOWN += 1;
                }
                else if(av[x+1][y] == av[x][y] && Character.isLetter(av[x][y])){
                    DOWN += 1;
                }
            }
        }
        //LEFT
        for(int x = 0; x < av.length; x++){
            for(int y = 1 ; y < av[0].length; y++){
                if(av[x][y-1] == '-'&&Character.isUpperCase(av[x][y])){
                    LEFT += 1;
                }
                else if(av[x][y-1] == av[x][y] && Character.isLetter(av[x][y])){
                    LEFT += 1;
                }
            }
        }
        //RIGHT
        for(int x = 0; x < av.length; x++){
            for(int y = av[0].length - 2; y >=0; y--){
                if(av[x][y+1] == '-'&&Character.isUpperCase(av[x][y])){
                    RIGHT += 1;
                }
                else if(av[x][y+1] == av[x][y] && Character.isLetter(av[x][y])){
                    RIGHT += 1;
                }
            }
        }
        return UP!=0 || DOWN!=0 || RIGHT!=0 || LEFT!=0;
    }
    public int ifUP(char av[][]){
        int UP = 0;
         for(int x = 1; x < av.length; x++){
            for(int y = 0; y < av[0].length; y++){
                if(av[x-1][y] == '-'&&Character.isUpperCase(av[x][y])){
                    UP += 1;
                }
                else if(av[x-1][y] == av[x][y] && Character.isLetter(av[x][y])){
                    UP += 1;
                }
            }
        }
        return UP;
    }
    public int ifDOWN(char av[][]){
        int DOWN = 0;
        for(int x = av.length-2; x >= 0; x--){
            for(int y = 0; y < av[0].length; y++){
                if(av[x+1][y] == '-'&&Character.isUpperCase(av[x][y])){
                    DOWN += 1;
                }
                else if(av[x+1][y] == av[x][y] && Character.isLetter(av[x][y])){
                    DOWN += 1;
                }
            }
        }
        return DOWN;
    }
    public int ifLEFT(char av[][]){
        int LEFT = 0;
        for(int x = 0; x < av.length; x++){
            for(int y = 1 ; y < av[0].length; y++){
                if(av[x][y-1] == '-'&&Character.isUpperCase(av[x][y])){
                    LEFT += 1;
                }
                else if(av[x][y-1] == av[x][y] && Character.isLetter(av[x][y])){
                    LEFT += 1;
                }
            }
        }
        return LEFT;
    }
    public int ifRIGHT(char av[][]){
        int RIGHT = 0;
        for(int x = 0; x < av.length; x++){
            for(int y = av[0].length - 2; y >=0; y--){
                if(av[x][y+1] == '-'&&Character.isUpperCase(av[x][y])){
                    RIGHT += 1;
                }
                else if(av[x][y+1] == av[x][y] && Character.isLetter(av[x][y])){
                    RIGHT += 1;
                }
            }
        }
        return RIGHT;
    }
    public void moveUP(){
        char temp;
        int length = gameBoard.length;
        for(int i = 1; i < gameBoard.length; i++){
            for(int j = 0; j < gameBoard[0].length; j++){
                if(gameBoard[i][j] == '-'){
                    //continue;
                }
                else if(gameBoard[i][j] == gameBoard[i-1][j]&&Character.isUpperCase(gameBoard[i][j])){
                    addScore(combinedScore(nextLetter(gameBoard[i][j])));
                    prevScore = combinedScore(nextLetter(gameBoard[i][j]));
                    gameBoard[i][j] = nextLetter(gameBoard[i][j]);
                    temp = gameBoard[i][j];
                    gameBoard[i][j] = '-';
                    gameBoard[i-1][j] = temp;
                }             
                else if(gameBoard[i-1][j] == '-' && Character.isUpperCase(gameBoard[i][j])){             
                    int check;
                    for(check = i; check>0; check--){
                        if(gameBoard[check-1][j]=='-'){
                            gameBoard[check-1][j] = gameBoard[check][j];
                            gameBoard[check][j]= '-';
                        }
                        else if(gameBoard[check-1][j]== gameBoard[check][j]){
                            addScore(combinedScore(nextLetter(gameBoard[i][j])));
                            prevScore = combinedScore(nextLetter(gameBoard[i][j]));
                            gameBoard[check-1][j] = nextLetter(gameBoard[check][j]);
                            gameBoard[check][j] = '-';
                            break;
                        }    
                        else if(gameBoard[check-1][j]!=gameBoard[check][j]&&Character.isUpperCase(gameBoard[check-1][j])){
                            break;
                        }
                    }      
                }
            }
        }
        addTiles();
        display(gameBoard);
        undo = 1;
    }
    public void moveDOWN(){
        char temp;
        int length = gameBoard.length;
        for(int i = length-2; i >=0; i--){
            for(int j = 0; j < gameBoard[0].length; j++){
                if(gameBoard[i][j] == '-'){
                    //
                }
                else if(gameBoard[i][j] == gameBoard[i+1][j]&&Character.isUpperCase(gameBoard[i][j])){
                    addScore(combinedScore(nextLetter(gameBoard[i][j])));
                    prevScore = combinedScore(nextLetter(gameBoard[i][j]));
                    gameBoard[i][j] = nextLetter(gameBoard[i][j]);
                    temp = gameBoard[i][j];
                    gameBoard[i][j] = '-';
                    gameBoard[i+1][j] = temp;
                }             
                else if(gameBoard[i+1][j] == '-'&&Character.isUpperCase(gameBoard[i][j])){             
                    int check;
                    for(check = i; check < length-1; check++){
                    if(gameBoard[check+1][j]=='-'){
                            gameBoard[check+1][j] = gameBoard[check][j];
                            gameBoard[check][j]= '-';
                        }
                        else if(gameBoard[check+1][j] == gameBoard[check][j]){
                            addScore(combinedScore(nextLetter(gameBoard[i][j])));
                            prevScore = combinedScore(nextLetter(gameBoard[i][j]));
                            gameBoard[check+1][j] = nextLetter(gameBoard[check][j]);
                            gameBoard[check][j] = '-';
                            break;
                        }    
                        else if(gameBoard[check+1][j]!=gameBoard[check][j]&&Character.isUpperCase(gameBoard[check+1][j])){
                            break;
                        }
                    }
                }
            }
        }
        addTiles();
        display(gameBoard);
        undo = 1;
    }
    public void moveLEFT(){
        char temp;
        int length = gameBoard.length;
        for(int i = 0; i < length; i++){
            for(int j = 1; j < gameBoard[0].length; j++){
                if(gameBoard[i][j] == '-'){
                    //continue;
                }
                else if(gameBoard[i][j] == gameBoard[i][j-1]&&Character.isUpperCase(gameBoard[i][j])){
                    addScore(combinedScore(nextLetter(gameBoard[i][j])));
                    prevScore = combinedScore(nextLetter(gameBoard[i][j]));
                    gameBoard[i][j] = nextLetter(gameBoard[i][j]);
                    temp = gameBoard[i][j];
                    gameBoard[i][j] = '-';
                    gameBoard[i][j-1] = temp;
                }             
                else if(gameBoard[i][j-1] == '-'&&Character.isUpperCase(gameBoard[i][j])){             
                    int check;
                    for(check = j; check>0; check--){
                        if(gameBoard[i][check-1]=='-'){
                            gameBoard[i][check-1] = gameBoard[i][check];
                            gameBoard[i][check]= '-';
                        }
                        else if(gameBoard[i][check-1]== gameBoard[i][check]){
                            addScore(combinedScore(nextLetter(gameBoard[i][j])));
                            prevScore = combinedScore(nextLetter(gameBoard[i][j]));
                            gameBoard[i][check-1] = nextLetter(gameBoard[i][check]);
                            gameBoard[i][check] = '-';
                            break;
                        }    
                        else if(gameBoard[i][check-1]!=gameBoard[i][check]&&Character.isUpperCase(gameBoard[i][check-1])){
                            break;
                        }
                    }      
                }
            }
        }
        addTiles();
        display(gameBoard);
        undo = 1;
    }
    public void moveRIGHT(){
        char temp;
        int length = gameBoard.length;
        for(int i = 0; i < length; i++){
            for(int j = gameBoard[0].length-2; j >=0; j--){
                 if(gameBoard[i][j] == '-'){
                    //continue;
                }
                else if(gameBoard[i][j] == gameBoard[i][j+1]&&Character.isUpperCase(gameBoard[i][j])){
                    addScore(combinedScore(nextLetter(gameBoard[i][j])));
                    prevScore = combinedScore(nextLetter(gameBoard[i][j]));
                    gameBoard[i][j] = nextLetter(gameBoard[i][j]);
                    temp = gameBoard[i][j];
                    gameBoard[i][j] = '-';
                    gameBoard[i][j+1] = temp;
                }             
                else if(gameBoard[i][j+1] == '-'&&Character.isUpperCase(gameBoard[i][j])){             
                    int check;
                    for(check = j; check < length-1; check++){
                        if(gameBoard[i][check+1]=='-'){
                            gameBoard[i][check+1] = gameBoard[i][check];
                            gameBoard[i][check]= '-';
                        }
                        else if(gameBoard[i][check+1]== gameBoard[i][check]){
                            addScore(combinedScore(nextLetter(gameBoard[i][j])));
                            prevScore = combinedScore(nextLetter(gameBoard[i][j]));
                            gameBoard[i][check+1] = nextLetter(gameBoard[i][check]);
                            gameBoard[i][check] = '-';
                            
                            break;
                        }    
                        else if(gameBoard[i][check+1]!=gameBoard[i][check]&&Character.isUpperCase(gameBoard[i][check+1])){
                            break;
                        }
                    }    
                }
            }
        }
        addTiles();
        display(gameBoard);
        undo = 1;
    }
    public char nextLetter(char p){
        char letters[] = {'A','B','C','D','E','F','G','H','I','J','K'};
        char next = 0;
        for(int  i = 0; i < letters.length; i++){
            if(p == letters[i]){
                next = letters[i+1];
                break;                
            }
        }
        return next;
    }
    //determine if the player has meet the winning condition
    public boolean win(){
        for(int x = 0; x < gameBoard.length; x++){
            for(int y = 0; y < gameBoard[0].length; y++){
                if(gameBoard[x][y] == 'D'){
                    return true;
                }
            }
        }
        return false;
    }
    public void lose(){
        System.out.println("\nYou've lost.....");
        System.out.println("Final Score : " + getTotalScore());
        try {
            writeScore();
        } catch (IOException ex) {
            Logger.getLogger(Game2048.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void display(char [][]d){
        for(int i = 0; i < d.length; i++){
            for(int j = 0; j < d[0].length; j++){
                System.out.print(d[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public void setName(String name){
        playerName = name;
    }
    //public void 
    //check if "High_Scores.txt" exist or not and if not new file will be created
    public void createFile(){
        try{
            File f = new File("High_Scores.txt");
            BufferedWriter buff = new BufferedWriter(new FileWriter("High_Scores.txt",true));            
            if(f.isFile()){
                f.createNewFile();
                for(int rank = 1; rank <= 10; rank++){       
                    buff.write("Player");
                    buff.write(" ");
                    buff.write(String.valueOf(0));                
                    buff.newLine();
                }
            }
            else;
            buff.close();
        }catch(IOException e){
            System.out.println("Problem with output");
        }
    }
    //display high scores
    public void displayHighScore() throws FileNotFoundException, IOException{
        Scanner in = new Scanner(System.in);           

        System.out.println("*******HIGH SCORES*******");            

        Scanner sc = new Scanner(new File("High_Scores.txt"));
        LineNumberReader rd = new LineNumberReader(new FileReader("High_Scores.txt")); //untuk read brp banyak line yg ada dlm txt file

        String read = "";
        while((read = rd.readLine())!= null){}

        int line = rd.getLineNumber();
        int length = rd.getLineNumber();
        cScores = new int[length];   
        Scores  = new String[length];
        cNames = new String[length];  //collection of names
        Names = new String[length];

        for(int x = 0; x < Scores.length; x++){
            Names[x] = sc.next();
            Scores[x] = sc.next();
        }
        for(int y = 0; y < length; y++){
            String value = Scores[y].replaceAll("[^0-9]", ""); //untuk buang semua character lain yg bukan integer dlm String tu
            cScores[y] = Integer.parseInt(value);              //convert String into integer
        }
        for(int z = 0; z < length; z++){
            String value = Names[z].replaceAll("[^0-9A-Za-z]", "");
            cNames[z] = value;
            }
        //sort scores in ascending orders
        for(int pass = 1; pass < cScores.length; pass++){
            for(int i = 0; i < cScores.length - pass; i++){
                if(cScores[i] < cScores[i+1]){
                    int hold = cScores[i];
                    cScores[i] = cScores[i+1];
                    cScores[i+1] = hold;
                    
                    String temp = cNames[i];
                    cNames[i] = cNames[i+1];
                    cNames[i+1] = temp;
                }
            }
        }
        int rank = 1; 
        if(cScores.length<10){            
            for(int i = 0; i < cScores.length; i++){
                System.out.printf("%-3d %-10s%d\n",rank,cNames[i],cScores[i]);
                rank++;
            }
        }    
        else
            for(int i = 0; i < 10; i++){
                System.out.printf("%-3d %-10s%d\n",rank,cNames[i],cScores[i]);
                rank++;
            }
        System.out.println("*************************");
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
    //get total score
    public int getTotalScore(){
        return totalScore;
    }
    // to print score
    public void writeScore() throws IOException{
        try (BufferedWriter wr = new BufferedWriter(new FileWriter("High_Scores.txt",true))) {
            wr.write(playerName);
            wr.write(" ");
            wr.write(String.valueOf(totalScore));                
            wr.newLine();
        }
    }
}
