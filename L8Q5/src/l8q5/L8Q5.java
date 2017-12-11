
package l8q5;

import java.util.Scanner;

public class L8Q5 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Game player1 = new Game("A");
        Game player2 = new Game("B");
        
        System.out.println("");
        int score1 = 0;
        int score2 = 0;
        
        while(score1 < 100 && score2 < 100){
            int s1 = player1.roll();
            System.out.println(player1.getName() + " score is " + s1);
            score1 = score1 + s1;
            
            int s2 = player2.roll();
            System.out.println(player2.getName()+ " score is " + s2);
            score2 =  score2 + s2;
            
            System.out.println("");
            System.out.println("TOTAL SCORE");
            System.out.printf("%-5s%s\n",player1.getName(),player2.getName());
            System.out.printf("%-5d%d",score1,score2);
            System.out.println("\n");
        }
        if(score1 >= 100){
            System.out.println(player1.getName()+ " is the winner with a score of " + score1);
        }
        else if(score2 >= 100){
            System.out.println(player2.getName()+ " is the winner with a score of " + score2);
        }
    }
    
}
