
package howto;
//Danial.A

import java.util.Scanner;

public class HowTo {

    public static void main(String[] args) {
        
        //how to determine a prime number.
        Scanner in = new Scanner(System.in);
        
        int flag = 0;
        System.out.print("Number to check: ");
        int num = in.nextInt();
        System.out.println("");
        
        if(num == 1){ //number is not a prime number
            System.out.print(num + " is not a prime number.\n");
            System.exit(0);
        }       
            for(int i = 2; i < num; i++){     
                if(num%i == 0){  
                   flag = 1;
                   System.out.print(num + " is not a prime number.\n");
                   break;
                    
                }   
            }    
            if(flag == 0){
                System.out.println(num + " is a prime number.\n");
       }      
    }
}
