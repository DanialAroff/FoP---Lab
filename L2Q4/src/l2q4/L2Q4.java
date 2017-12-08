
package l2q4;

import java.util.Scanner;

public class L2Q4 {

    
    public static void main(String[] args) {    
        
        int s;
        
        Scanner time = new Scanner(System.in);
        
        System.out.print("Enter the number of seconds: ");
        s = time.nextInt();
        
        System.out.println(s +" seconds is " + s/3600 + " hours, " + ((s/60)%60) + " minutes and " + s%60 + " seconds");
    }
    
}
