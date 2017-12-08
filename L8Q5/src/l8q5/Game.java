
package l8q5;

import java.util.Random;
import java.util.Scanner;

public class Game {
    
    private String name1;
    private String name2;
    
    public Game(String player1, String player2){
        this.name1 = player1;
        this.name2 = player2;
    }
    public Game(Scanner player1, Scanner player2){
        System.out.print("Player 1 name : ");
        this.name1 = player1.nextLine();
        System.out.print("Player 2 name : ");
        this.name2 = player2.nextLine();
    }
    
    public int roll(){
        Random rand = new Random();
        int result = rand.nextInt(6)+1;
        
        return result;
    }
    public String player1(){
        return name1;
    }
    public String player2(){
        return name2;
    }
}
