
package test20;

import java.util.Random;
import java.util.Scanner;

public class Test20 {

 
    public static void main(String[] args) {
       
        NewGame g = new NewGame();
        moveUpdated move = new moveUpdated();
        Scanner game = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int row = game.nextInt();
        System.out.print("Enter the number of columns : ");
        int column = game.nextInt();
        
        System.out.println("");
        g.newGame(row, column);
        char [][]gameBoard = g.gameBoard();

        while(g.checkAvailableMoves(gameBoard)){
            System.out.println("");
            System.out.println("UP : 1   RIGHT : 2   DOWN : 3   LEFT : 4   UNDO : 5");
            System.out.print("Direction ");
            int direction = game.nextInt();
            
            switch(direction){
                case 1 : {
                    if(g.ifUP(gameBoard)>0){
                        g.recordPrevious(gameBoard);
                        g.moveUP();
                    }
                    else{
                        g.display(gameBoard);
                    }
                    break;
                }
                case 2 : {
                    if(g.ifRIGHT(gameBoard)>0){
                        g.recordPrevious(gameBoard);
                        g.moveRIGHT();
                    }
                    else{
                        g.display(gameBoard);           
                    }                    
                    break;
                }
                case 3 : {
                    if(g.ifDOWN(gameBoard)>0){
                        g.recordPrevious(gameBoard);
                        g.moveDOWN();
                    }    
                    else{
                        g.display(gameBoard);
                    }
                    break;
                }
                case 4 : {
                    if(g.ifLEFT(gameBoard)>0){
                        g.recordPrevious(gameBoard);
                        g.moveLEFT();               
                    }    
                    else{
                        g.display(gameBoard);
                    }
                    break;
                }
                case 5 : {
                    g.undoBoard();
                }
                default : {
                    
                }
            }
            
        }
        
    }    
}
