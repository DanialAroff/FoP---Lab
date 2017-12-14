
package test20;

import java.util.Arrays;
import java.util.Random;

public class NewGame {
    
    private int numOfLetters;    
    private char[][] gameBoard;  //
    //private char[][] gameBoardX; //hold previous tiles position. used for UNDO
    private int undo;
    private int score;
    private int prevScore;
    private int totalScore;
    
    public NewGame(){
        totalScore = 0;
    }
    
    public void newGame(int row, int column){
        Random rnd = new Random();
        numOfLetters = (row * column) / 8;
        int randomTiles[] = new int[numOfLetters];
        gameBoard = new char[row][column];
        
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
        //gameBoardX = this.gameBoard;
    }
    public char[][] gameBoard(){
        return gameBoard;
    }
    public void addTiles(char g[][]){    
        
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
          
          char temp;
        //UP
        for(int x = 1; x < av.length; x++){
            for(int y = 0; y < av[0].length; y++){
                if(av[x-1][y] == '-'){
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
                if(av[x+1][y] == '-'){
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
                if(av[x][y-1] == '-'){
                    LEFT += 1;
                }
                else if(av[x][y-1] == av[x][y] && Character.isLetter(av[x][y])){
                    UP += 1;
                }
            }
        }
        //RIGHT
        for(int x = 0; x < av.length; x++){
            for(int y = av[0].length - 2; y >=0; y--){
                if(av[x][y+1] == '-'){
                    RIGHT += 1;
                }
                else if(av[x][y+1] == av[x][y] && Character.isLetter(av[x][y])){
                    RIGHT += 1;
                }
            }
        }
        return UP!=0 || DOWN!=0 || RIGHT!=0 || LEFT!=0;
    }
    public void moveUP(){
//        char[][]hold = gameBoardX;
        char temp;
        int length = gameBoard.length;
        for(int i = 1; i < gameBoard.length; i++){
            for(int j = 0; j < gameBoard[0].length; j++){
                if(gameBoard[i][j] == '-'){
                    //continue;
                }
                else if(gameBoard[i][j] == gameBoard[i-1][j]&&Character.isUpperCase(gameBoard[i][j])){
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
        for(int i = 0; i < gameBoard.length; i++){
            for(int j = 0; j < gameBoard[0].length; j++){
                System.out.print(gameBoard[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    //RIGHT NOT YET COMPLETED
    public void moveDOWN(){
        
        //char[][]hold = gameBoardX;
        char temp;
        int length = gameBoard.length;
        for(int i = length-2; i >=0; i--){
            for(int j = 0; j < gameBoard[0].length; j++){
                if(gameBoard[i][j] == '-'){
                    //
                }
                else if(gameBoard[i][j] == gameBoard[i+1][j]&&Character.isUpperCase(gameBoard[i][j])){
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
                        else if(gameBoard[check+1][j]== gameBoard[check][j]){
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
        for(int i = 0; i < gameBoard.length; i++){
            for(int j = 0; j < gameBoard[0].length; j++){
                System.out.print(gameBoard[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public void moveLEFT(){
        //char[][]hold =gameBoardX;
        char temp;
        int length = gameBoard.length;
        for(int i = 0; i < length; i++){
            for(int j = 1; j < gameBoard[0].length; j++){
                if(gameBoard[i][j] == '-'){
                    //continue;
                }
                else if(gameBoard[i][j] == gameBoard[i][j-1]&&Character.isUpperCase(gameBoard[i][j])){
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
        for(int i = 0; i < gameBoard.length; i++){
            for(int j = 0; j < gameBoard[0].length; j++){
                System.out.print(gameBoard[i][j]+" ");
            }
            System.out.println("");
        }
        //gameBoardX = gameBoard;
    }
    public void moveRIGHT(){
        //char[][]hold = gameBoardX;
        char temp;
        int length = gameBoard.length;
        for(int i = 0; i < length; i++){
            for(int j = gameBoard[0].length-2; j >=0; j--){
                 if(gameBoard[i][j] == '-'){
                    //continue;
                }
                else if(gameBoard[i][j] == gameBoard[i][j+1]&&Character.isUpperCase(gameBoard[i][j])){
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
        for(int i = 0; i < gameBoard.length; i++){
            for(int j = 0; j < gameBoard[0].length; j++){
                System.out.print(gameBoard[i][j]+" ");
            }
            System.out.println("");
        }
        //gameBoardX = gameBoard;
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
    
    public void display(char [][]d){
       // d = gameBoard;
        for(int i = 0; i < d.length; i++){
            for(int j = 0; j < d[0].length; j++){
                System.out.print(d[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}

