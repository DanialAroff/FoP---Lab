
package l4q7;

import java.util.Scanner;

public class L4Q7 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int P;    //principal amount
        float i;  //interest rate
        float ii; // i/12*100
        int N;    //number of months
        float M1; 
        float M;  //monthly payment
        int m = 1;
        float C; //Principal portion due
        int n = 1; //month under consideration
        float L; //interest due
        float R; //principal due/unpaid balance
        float total_i = 0; //total interest
        
        System.out.print("Enter principal amount: ");
        P = in.nextInt();
        
        System.out.print("Enter interest in %: ");
        i = in.nextInt();
        
        System.out.print("Enter number of month(s): ");
        N = in.nextInt();
        
        M1 = (float)P*(i/(float)(12*100));        
        ii = (float)i/(float)(12*100);        
        M = (float) (M1/(1-Math.pow(1+ii, -N)));
      
        System.out.println();
                
        System.out.println("Month       "+"Monthly Payment       " + "Principal       " + "Interest       " + "Unpaid Balance       " + "Total Interest");
        
        while(m <= N){            
            int Nn  = -(1+N-n);           
            C = M*((float)Math.pow(1+ii, Nn));
            L = M - C;
            R = L/ii-C;
            total_i = total_i + L;
            
            System.out.printf("%5d %21.2f %15.2f %14.2f %20.2f %20.2f\n",m,M,C,L,R,total_i);
        m++;
        n++;
        }
    }
    
}
