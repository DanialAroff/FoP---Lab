
package l4q5;

import java.util.Random;
import java.util.Scanner;

public class L4Q5 {

    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        
        int p1 = 0, p2 = 0;
        int sum1 = 0, sum2 = 0;
        
        while (sum1 <= 100 || sum2 <= 100){        
            
               System.out.print("Player 1 roll a dice...");
               p1 = 1 + rand.nextInt(6);
               System.out.println(p1);
               sum1 = sum1 + p1;
               
               while (p1 ==6 && sum1 <= 100){
                   System.out.print("Player 1 roll a dice...");
                   p1 = 1 + rand.nextInt(6);
                   System.out.println(p1);
                   sum1 = sum1 + p1;
               }
                                      
               System.out.print("Player 2 roll a dice...");
               p2 = 1 + rand.nextInt(6);
               System.out.println(p2);
               sum2 = sum2 + p2;
               
               while (p2 == 6 && sum2 <=100){
                   System.out.print("Player 2 roll a dice...");
                   p2 = 1 + rand.nextInt(6);
                   System.out.println(p2);
                   sum2 = sum2 + p2;
                   
               }
               
               if (sum1 > 100 || sum2 > 100)
                   break;
                           
        }  
        
        System.out.println("");
        
        if(sum1 > sum2){
            System.out.println("Player 1 wins with score of " + sum1);
        }
        if(sum2 > sum1){
            System.out.println("Player 2 wins with score of " + sum2);
        }    
    }
}
