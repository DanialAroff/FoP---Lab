//Danial.A
package l2q3;

import java.util.Random;


public class L2Q3 {

    public static void main(String[] args) {
        
        Random rand = new Random();
        
        int num1;
        int num2;
        int num3;
        int sum;
        float average;
        
        num1 = rand.nextInt(41) + 10;
        num2 = rand.nextInt(41) + 10;
        num3 = rand.nextInt(50) + 10;
        
        sum = num1 + num2 + num3;
        
        average = (sum)/3;
        
        System.out.println("The numbers are " + num1 + ", " + num2 + " and " + num3);
        System.out.println("");
        System.out.println("The sum of numbers is " + sum);
        System.out.println("");
        System.out.printf("The average is " + "%.2f",average);
        System.out.println("");
        
        
    }
    
}
