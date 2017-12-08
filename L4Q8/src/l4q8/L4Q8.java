
package l4q8;

import java.util.Random;

public class L4Q8 {

    public static void main(String[] args) {
        
        Random rand = new Random();
        
        int n = rand.nextInt(101);
        int o = 0;
        
        System.out.println("n is " + n);
        System.out.println("");
        
        int  i = 1;
        
        while(i <= n){
            
            
            if(o == 2 || o == 3 || o == 5 || o == 7){
                System.out.println(o);
                i++;
            }
            else{
                if(o!=1 && o%2!=0 && o%3!=0 && o%5!=0 && o%7!=0){
                    System.out.println(o);
                    i++;
                }
                else;
            }                    
            
            o++;
        }              
        
    }
    
}
