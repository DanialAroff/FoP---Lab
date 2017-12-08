//Danial.A
package l2q2;

import java.util.Scanner;

public class L2Q2 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        double P;
        double D;
        float R;
        int Y;
        double M;
        
        System.out.print("Price of car: RM");
        P = input.nextDouble();
        System.out.println("");
        System.out.print("Down payment: RM");
        D = input.nextDouble();
        System.out.println("");
        System.out.print("Interest rate in %: ");
        R = input.nextFloat();
        System.out.println("");
        System.out.print("Loan duration in year: ");
        Y = input.nextInt();
        System.out.println("");
        
        M = (P-D)*(1 + R*Y/100)/(Y*12);
        
        System.out.printf("\tYour monthly loan is RM" + "%.2f", M);
        System.out.println("");
    }
    
}
