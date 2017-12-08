
package l4q2;

import java.util.Scanner;

public class L4Q2 {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        int sum = 0;
        
        System.out.print("Enter an integer: ");
        int n = in.nextInt();
        
        for (int x = 1; x <= n; x++){
                int y = 0; //value of y reset to 0 after a loop is complete
                while (y < x){
                    y = y + 1;
                    sum = sum + y;
                }
                
        }   
        
        System.out.println("The sum is: " + sum);
    }
    
}
