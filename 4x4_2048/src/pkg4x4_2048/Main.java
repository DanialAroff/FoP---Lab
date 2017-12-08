
package pkg4x4_2048;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        Random rdm = new Random();
        
        char Letters[] = {'A','B','C','D','E','F','G','H','I','J'};
        final int ROW = 4;
        final int COLUMN = 4;
        char puzzleBox[][] = new char[ROW][COLUMN];
        
        int first2letters = 2;
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
        System.out.println("");
        int proceed =1;
        while(proceed > 0){
            if(checkAvailableMoves(puzzleBox)){
                int oneTile = 1;
                for(int i = 0; i < ROW; i++){
                    for(int j = 0; j < COLUMN; j++){
                        if(!checkTilesIsLetter(puzzleBox[i][j])){
                            int put = rdm.nextInt(2);
                            if(put == 1 && oneTile != 0){
                                puzzleBox[i][j] = 'A';
                                System.out.print(puzzleBox[i][j]+" ");
                                oneTile--;
                            }
                            else{
                                puzzleBox[i][j] = '\u00B7';
                                System.out.print(puzzleBox[i][j]+" ");
                            }

                        }
                        else
                            System.out.print(puzzleBox[i][j]+" ");
                    }
                    System.out.println("");
                }    
                proceed++;
                System.out.println("");
            }    
            else{                
                System.out.println("GAME OVER");
                break;
            }
        }    

//        int rows = puzzleBox.length;
//        int columns = puzzleBox[0].length;
//        
//        System.out.println(rows);
//        System.out.println(columns);
    }
    
    public static boolean checkTilesIsLetter(char f){
        return Character.isLetter(f);
    }
    public static boolean checkAvailableMoves(char av[][]){
          int UP = 0;
          int DOWN = 0;
          int RIGHT = 0;
          int LEFT = 0;
        //UP
        for(int x = 1; x < av.length; x++){
            for(int y = 0; y < av[0].length; y++){
                if(av[x-1][y] == '\u00B7'){//av[x][y] == av[x-1][y] || 
                    UP += 1;
                }
            }
        }
        //DOWN
        for(int x = 0; x < av.length-1; x++){
            for(int y = 0; y < av[0].length; y++){
                if(av[x+1][y] == '\u00B7'){//av[x][y] == av[x+1][y] || 
                    DOWN += 1;
                }
            }
        }
        //LEFT
        for (char[] av1 : av) {
            for (int y = 1; y < av[0].length; y++) {
                if (av1[y-1] == '\u00B7') {
                    //av[x][y] == av[x][y-1] ||
                    LEFT += 1;
                }
            }
        }
        //RIGHT
        for (char[] av1 : av) {
            for (int y = 0; y < av[0].length-1; y++) {
                if (av1[y+1] == '\u00B7') {
                    //av[x][y] == av[x][y+1] ||
                    RIGHT += 1;
                }
            }
        }
        return UP!=0 || DOWN!=0 || RIGHT!=0 || LEFT!=0;
    }
    public static int sumArray(int[]arr){
        int sum = 0;
        for(int x = 0; x < arr.length; x++){
            sum = sum + arr[x];
        }
        return sum;
    }
//    for(int i = 0; i < ROW; i++){
//            for(int j = 0; j < COLUMN; j++){}
}
