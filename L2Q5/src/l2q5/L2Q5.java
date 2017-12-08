
package l2q5;

import java.util.Random;

public class L2Q5 {

    public static void main(String[] args) {
        
       Random rand = new Random();
       
       int R1;
       int R2;
       int i;
       int sum = 0;
       
       R1 = R2 = rand.nextInt(10001);
       
       while (R1 > 0){
           
           i = R1%10;
           
           R1 = R1/10;
           
           sum = sum + i;
       }
       
       System.out.println("The number is " + R2);
       System.out.println("");
       System.out.println("\tSum of digits is " + sum);
        
        
    }
    
}
