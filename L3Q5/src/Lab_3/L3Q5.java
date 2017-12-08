
package Lab_3;

import java.util.Scanner;

public class L3Q5 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int x;
        int y;
        int z;
        
        System.out.print("Value of a: ");
        a = input.nextInt();
        System.out.print("Value of b: ");
        b = input.nextInt();
        System.out.print("Value of c: ");
        c = input.nextInt();
        System.out.print("Value of d: ");
        d = input.nextInt();
        System.out.print("Value of e: ");
        e = input.nextInt();
        System.out.print("Value of f: ");
        f = input.nextInt();
        
        System.out.println("");
        
        z = a*b-c*d;
        
        if (z == 0)
            System.out.println("\tThe equation has no solution");       
        else{      
            x = (e*d-b*f)/(z);
            y = (a*f-e*c)/(z);         
            
            System.out.println("x is " + x + " and y is " + y);
        }            
    }
    
}
