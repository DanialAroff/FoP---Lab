
package l5q2;

import java.util.Random;

public class L5Q2 {

    public static void main(String[] args) {
        Random rand = new Random();        
        int number[] = new int[10];
        
        number[0] = rand.nextInt(21);
        System.out.println(number[0]);
        
        for(int i = 1; i<10; i++){
            number[i] = rand.nextInt(21);
            for(int c = 1; c<=i; c++){
                if(number[i] == number[i-c]){
                    i--;
                    break;
                }                        
                else if (number[i] != number[i-c] && c == i)
                    System.out.println(number[i]);                                        
            }             
        }
    }
    
}
