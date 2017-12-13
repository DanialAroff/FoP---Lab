
package test20;

import java.util.Random;
import java.util.Scanner;

public class Test20 {

 
    public static void main(String[] args) {
        Testing t = new Testing();
       
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
//        System.out.println("First");
//        g.display(gameBoard);
        
        while(g.checkAvailableMoves(gameBoard)){
//            System.out.println("Second");
//            g.display(gameBoard);
            System.out.println("");
            System.out.println("UP : 1   RIGHT : 2   DOWN : 3   LEFT : 4");
            System.out.print("Direction ");
            int direction = game.nextInt();
            
            switch(direction){
                case 1 : {
                    g.moveUP(g.gameBoard());
                    break;
                }
                case 2 : {
                    g.moveRIGHT(g.gameBoard());
                    break;
                }
                case 3 : {
                    g.moveDOWN(g.gameBoard());
                    break;
                }
                case 4 : {
                    g.moveLEFT(g.gameBoard());
                    break;
                }
                default : {
                    
                }
            }
            
        }
        
    }    
}
