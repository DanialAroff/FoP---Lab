
package midsemesterrevision2;
   //author@Danial.A
import java.util.Scanner;


public class MidSemesterRevision2 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n;
        int min;
        int occur = 1;
        System.out.println("Enter Integer (-1 to quit) : ");
        min = n = in.nextInt();
        
        while(n != -1){
            n = in.readInt();
            
            if (n == -1){
                break;
            }
            else if(n > 9){
                
            }
            else if(n < min){
                min = n;
                occur = 1;
                System.out.print(n);                
            }
            else if(n == min){
                occur++;
                System.out.print(n);
            }
            else
                System.out.print(n);
        }
        
        System.out.println("\nThe minimum number is " + min);
        System.out.println("");
        System.out.println("The occurence count of " + min + " is " + occur);
    }
    
}
