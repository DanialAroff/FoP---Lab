
package test2048;

import java.util.*;
//import java.io.*;

public class Test2048 {

    public static void main(String[] args) {
        
        Random rdm = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of ROW    : ");
        int ROW = in.nextInt();
        System.out.print("Enter number of COLUMN : ");
        int COLUMN = in.nextInt();
        
        char Letters[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
                          'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        char puzzleBox[][] = new char[ROW][COLUMN]; //puzzleBox[4][2]
        char prevPuzzleBox[][] = new char[ROW][COLUMN]; 
        
        int first2letters = 2; //how much letter has been placed
        for(int i = 0; i < ROW; i++){
            for(int j = 0; j < COLUMN; j++){
                if(i == (ROW-1) && j == COLUMN-1 && first2letters!=0){
                    puzzleBox[i][j] = Letters[0];
                    System.out.print(puzzleBox[i][j]+" ");
                    first2letters--;
                }
                else if(first2letters > 0){
                    int putLetter;            //to determine whether a letter is to be placed or not
                    putLetter = rdm.nextInt();
                    if(putLetter%3 == 0){
                        puzzleBox[i][j] = Letters[0];
                        System.out.print(puzzleBox[i][j]+" ");
                        first2letters--;
                    }
                    else{
                        puzzleBox[i][j] = '\u00B7';
                        System.out.print(puzzleBox[i][j]+" ");
                    }
                }    
                
                else{
                    puzzleBox[i][j] = '\u00B7';
                    System.out.print(puzzleBox[i][j]+" ");
                }                    
            }
            System.out.println("");
        }
        
        addTiles(puzzleBox, ROW, COLUMN);
        addTiles(puzzleBox, ROW, COLUMN);
        //addTiles(puzzleBox, ROW, COLUMN);
        
    }
    
    public static void addTiles(char addTile[][],int ROW, int COLUMN){
        System.out.println("");
        Random rand = new Random();
        int added = 0;
        for(int i = 0; i < ROW; i++){
            for(int j = 0; j < COLUMN; j++){
                int addOrNot = rand.nextInt();
                if(added < 1){
                    if(checkLetters(addTile,i,j)){                        
                        System.out.print(addTile[i][j]+" ");
                    }
                    else{
                        if(addOrNot%3==0){
                            addTile[i][j] = 'A';
                            System.out.print(addTile[i][j]+" ");
                            added++;
                        }
                        else
                            System.out.print('\u00B7'+" ");
                    }   
                }
                else if(added>=1){
                    if(checkLetters(addTile,i,j)){
                        System.out.print(addTile[i][j]+" ");
                    }
                    else{
                        System.out.print('\u00B7'+" ");
                    }   
                }
            }
            System.out.println("");
        }    
    }
    public static boolean checkLetters(char checkTiles[][], int x, int y){
        switch (checkTiles[x][y]) {
            case 'A':
                return true;
            case 'B':
                return true;
            case 'C':
                return true;
            case 'D':
                return true;
            case 'E':
                return true;
            case 'F':
                return true;
            case 'G':
                return true;
            case 'H':
                return true;
            case 'I':
                return true;
            case 'J':
                return true;
            case 'K':
                return true;
            case 'L':
                return true;
            case 'M':
                return true;
            case 'N':
                return true;
            case 'O':
                return true;
            case 'P':
                return true;
            case 'Q':
                return true;
            case 'R':
                return true;
            case 'S':
                return true;
            case 'T':
                return true;
            case 'U':
                return true;
            case 'V':
                return true;
            case 'W':
                return true;
            case 'X':
                return true;
            case 'Y':
                return true;
            case 'Z':
                return true;
            default:    
                break;
        }
        return false;
    }
}
