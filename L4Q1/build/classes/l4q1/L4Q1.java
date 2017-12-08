//Danial.A
package l4q1;

import java.util.Scanner;

public class L4Q1 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int userInput;
        int f;
        
        System.out.print("Enter an Integer: ");
        userInput = in.nextInt();
        
        f = userInput/userInput;  //f is the factor, we start from number 1 as all integers has 1 as its factor
        
        System.out.print("The factors are: ");
        
        while (f < userInput){
            if (userInput%f == 0){  //if userInput%f is equal to 0 than f is a factor of the integer
                System.out.print(f + ", ");
            
            }
            f++;
        }
        System.out.println(userInput); 
        /*
        The last f is the integer itself but we don't want the "," 
        so we put it outside of the loop. 
        */
    }
    
}
