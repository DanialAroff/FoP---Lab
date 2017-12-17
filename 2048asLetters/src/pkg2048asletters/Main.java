
package pkg2048asletters;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Game2048 g = new Game2048();
        Scanner game = new Scanner(System.in);
        
        g.createFile();
        g.displayHighScore();
        
        System.out.print("\nPlayer name : ");
        String name = game.nextLine();
        g.setName(name);
        System.out.print("\nEnter the number of rows : ");
        while (!game.hasNextInt()){
            System.out.println("Number, please!");
            game.nextLine();
        }
        int row = game.nextInt();
        System.out.print("\nEnter the number of columns : ");
        while (!game.hasNextInt()){
            System.out.println("Number, please!");
            game.nextLine();
        }
        int column = game.nextInt();
        System.out.println("");
        
        g.newGame(row, column);
        char [][]gameBoard = g.gameBoard();   
        
        while(g.checkAvailableMoves(gameBoard)){
            if(g.win()){
                System.out.println("\nYou've won!!");
                System.out.println("Final Score : " + g.getTotalScore());
                g.writeScore();
                break;
            }
            else{
                System.out.println("");
                System.out.println("UP(1)   RIGHT(2)   DOWN(3)   LEFT (4)   UNDO (5)");
                System.out.print("----> ");
                while (!game.hasNextInt()){
                    System.out.println("Bad input! Numbers only");
                    game.nextLine();
                }
                int direction = game.nextInt();
                System.out.println("");
                switch(direction){
                    case 1 : {
                        if(g.ifUP(gameBoard)>0){
                            g.record(gameBoard);
                            g.moveUP();
                            System.out.println("\nSCORES : "+g.getTotalScore());                    
                        }
                        else{
                            g.display(gameBoard);
                            System.out.println("\nSCORES : "+g.getTotalScore());
                        }
                        break;
                    }
                    case 2 : {
                        if(g.ifRIGHT(gameBoard)>0){
                            g.record(gameBoard);
                            g.moveRIGHT();
                            System.out.println("\nSCORES : "+g.getTotalScore());
                        }
                        else{
                            g.display(gameBoard);
                            System.out.println("\nSCORES : "+g.getTotalScore());
                        }                    
                        break;
                    }
                    case 3 : {
                        if(g.ifDOWN(gameBoard)>0){
                            g.record(gameBoard);
                            g.moveDOWN();
                            System.out.println("\nSCORES : "+g.getTotalScore());
                        }    
                        else{
                            g.display(gameBoard);
                            System.out.println("\nSCORES : "+g.getTotalScore());
                        }
                        break;
                    }
                    case 4 : {
                        if(g.ifLEFT(gameBoard)>0){     
                            g.record(gameBoard);
                            g.moveLEFT();      
                            System.out.println("\nSCORES : "+g.getTotalScore());
                        }    
                        else{
                            g.display(gameBoard);
                            System.out.println("\nSCORES : "+g.getTotalScore());
                        }
                        break;
                    }
                    case 5 : {
                       g.undo();
                       System.out.println("\nSCORES : "+g.getTotalScore());
                    }
                    default : {
                        g.display(gameBoard);
                    }
                }
            }
        }
        if(!g.win()){
            g.lose();
        }
        
    }    
    
}
