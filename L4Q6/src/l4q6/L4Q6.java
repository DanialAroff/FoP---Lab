
package l4q6;

import java.util.Random;

public class L4Q6 {

    public static void main(String[] args) {
        
        Random rand = new Random();
        
        long rnum = rand.nextInt();
        int i = 0;
        
        if (rnum < 0){
            rnum = Math.abs(rnum);
        }//if the integer is negative, the command will convert it to positive
        
        System.out.println("Random integer is " + rnum);
        
        while (rnum > 0){
            rnum = rnum/10;            
            i++; 
        //counter increment to count the digits of the integer
        }
        
        System.out.println("");
        System.out.println("\tThe number of digits in the integer is " + i);
        
    }
    
}
