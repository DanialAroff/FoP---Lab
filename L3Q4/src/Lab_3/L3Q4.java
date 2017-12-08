
package Lab_3;

import java.util.Random;

public class L3Q4 {

    public static void main(String[] args) {
        
        Random rand = new Random();
        
        int P1, P2;
        int d1P1; //first dice for player1 
        int d2P1; //second dice for player1
        int d1P2; //first dice for player2
        int d2P2; //second dice for player2
        
        d1P1 = rand.nextInt(6)+1;
        d2P1 = rand.nextInt(6)+1;
        
        d1P2 = rand.nextInt(6)+1;
        d2P2 = rand.nextInt(6)+1;
                
        System.out.println("Player 1 roll the dice twice....and got " + d1P1 + " and " + d2P1);        
        System.out.println("Player 2 roll the dice twice....and got " + d1P2 + " and " + d2P2);    
        System.out.println("");
        
        P1 = d1P1 + d2P1;
        P2 = d1P2 + d2P2;
        
        if (P1 > P2){
            System.out.println("\tPlayer 1 wins!!");
        }
        else
            System.out.println("\tPlayer 2 wins!!");
        
    }
    
}
