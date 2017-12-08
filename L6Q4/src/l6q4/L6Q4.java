
package l6q4;

public class L6Q4 {

    public static void main(String[] args) {
        
        System.out.println("GCD of (24, 8)");
        eucli(24, 8);
        System.out.println("\nGCD of (200, 625)");
        eucli(200, 625);       
    }
    public static void eucli(int a, int b){
        //a = b*c + d
        int num1 = a,num2 = b;
        int c = 0, d = 1;
        
        while(d != 0){
            //multiplier represent c 
            for(int multiplier = 1; multiplier != 0; multiplier++){
                //if b multiply c exceeds a, then decrement c and break the while loop.
                if(b*multiplier > a){
                    multiplier--;
                    c = multiplier;
                    break;
                }
                //if b times c less than a, no action is done and the loop is continued
                else if(b*multiplier < a){
                }
                //if b times c equal to a, then d = 0 and break the loop
                else if(b*multiplier == a)
                    c = multiplier;                    
            }
            d = a - (b*c);
            if(d != 0){     
                a = b;
                b = d;
            }
            else if(d == 0){
                break;
            }
        }
        // if d = 0, then b is the GCD(Greatest Common Divisor)
        System.out.println("\tGCD(" + num1 +", " + num2 + ") = " + b);
    }
// GCD formula    
//    while(b!=0){
//        int temp = b;
//        b = a%b;
//        a = temp;
//    }
}
