
package l6q3;
//Danial.A
import java.util.Random;
import java.util.Scanner;

public class L6Q3 {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Random rand = new Random();
        int rev[] = new int[10];
        System.out.println("10 integers to be reversed");
         for(int i = 0; i < 10; i++){
            rev[i] = rand.nextInt(1001);
            if((i+1)%5==0){
                System.out.printf("%-6d\n",rev[i]);
            }
            else{
                System.out.printf("%-6d",rev[i]);
            }
        }    
        System.out.println("\nReversed integers");
        for(int i = 0; i < rev.length; i++){
            if((i+1)%5==0){
                System.out.printf("%-6d\n",revArr(rev[i]));
            }
            else{
                System.out.printf("%-6d",revArr(rev[i]));
            }
        }        
    }
    public static int revArr(int x){     
            int revNum = 0;
            while(x != 0){
                revNum = revNum*10 + (x%10);
                x = x/10;
            }
        return revNum; //return reversed number
    }
}
