//Danial.A
package l6q5;

import java.util.Random;
import java.util.Scanner;

public class L6Q5 {

    public static void main(String[] args) {
        //unknown if the method fulfills the question requirement
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        int k = 0, score = 0;
        
        while(k >= 0){
            int i = rand.nextInt(13);
            int j = rand.nextInt(13);
            System.out.print("Enter negative number to quit.   ");
            k = in.nextInt();
            if(k<0){
                break;
            }
            if(k == i*j){
                score++;
            }
            lab6Q5(i,j,k);
        }
        System.out.println("Your Score is " + score);
    }
    //not confirmed
    public static void lab6Q5(int a, int b, int c){
        
        System.out.println(a+" x "+b+" = "+c);       
    }
}
