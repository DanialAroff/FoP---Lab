
package l3q6.pkg2;

import java.util.Scanner;

public class L3Q62 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                       
        System.out.print("Enter the radius: ");
        int radius = input.nextInt();
        
        System.out.print("Point x: ");
        int x = input.nextInt();
        
        System.out.print("Point y: ");
        int y = input.nextInt();
        
        float length = (float)Math.sqrt((x*x)+(y*y));
        
        if (length > radius){
            System.out.println("\nThe point is outside of the circle");
        }
        if (length < radius){
            System.out.println("\nThe point is inside of the circle");
        }
    }
    
}
