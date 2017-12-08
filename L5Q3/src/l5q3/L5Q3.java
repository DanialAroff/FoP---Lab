
package l5q3;

import java.util.Random;
import java.util.Scanner;

public class L5Q3 {

    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        
        System.out.print("Number of employees: ");
        int N = in.nextInt();
        System.out.println("");
        
        int W[][]=new int[N][7];
        int sum[] = new int[N];
        String day[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        for(int c = 0; c < N; c++){
            System.out.println("Employee " + (c+1) + " work hours: ");
            for(int o = 0; o < 7; o++){
                W[c][o] = rand.nextInt(8) + 1;
                sum[c] = sum[c] + W[c][o];
                System.out.printf("%-9s : ",day[o]);
                System.out.println(W[c][o] + " hours");   
            }            
            System.out.println("");
            System.out.print("Total work hour for employee ");
            System.out.print((c+1) + " is " + sum[c]);
            System.out.println("\n");
        }
    }
    
}
