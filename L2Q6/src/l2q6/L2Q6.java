//Danial.A
package l2q6;

import java.util.Scanner;


public class L2Q6 {

   
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        double M;
        double Q;
        int g;
        double Ftemp1;
        double Ftemp2;
        double temp1;
        double temp2;
        
        System.out.print("Enter the amount of water in gram: ");
        g = input.nextInt();
       
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        Ftemp1 = input.nextDouble();
        
        System.out.print("Enter the final temperature in Fahrenheit: ");
        Ftemp2 = input.nextDouble();
        
        M = g/1000;
        
        temp1 = (Ftemp1-32)/1.8;
        temp2 = (Ftemp2-32)/1.8;
        
        Q = M*(temp2-temp1)*4184;
               
        System.out.print("The energy needed is ");
        System.out.printf("%.6e\n", Q);
        
        
        
    }
    
}
