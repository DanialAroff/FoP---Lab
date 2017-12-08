
package midsemesterrevision;

import java.util.Scanner;

public class MidSemesterRevision {

    public static void main(String[] args) {
        
        Scanner in =  new Scanner(System.in);
        int d[] = new int[10], n, sum = 0, d_n;
        System.out.print("Enter nine digit integer: ");
        n = in.nextInt();
    
        for(int c = 8; c >= 0; c--){            
            d[c] = n%10; 
            n = n/10;
            d_n = d[c]*(c+1);
            sum = sum + d_n;
        }
        
        int sumcheck = sum%11;
        
        System.out.print("10-digit ISBN: ");
        if(sumcheck < 10){
            System.out.println(d[0]+"-"+d[1]+d[2]+d[3]+"-"+d[4]+d[5]+d[6]+d[7]+d[8]+"-"+sumcheck);
        }
        else{
            System.out.println(d[0]+"-"+d[1]+d[2]+d[3]+"-"+d[4]+d[5]+d[6]+d[7]+d[8]+"-X");
        }
                
         
    }
    
}
