
package l6q6;
//Danial.A
public class L6Q6 {

    public static void main(String[] args) {
        final int displayPerLine = 10;
        int n = 2, totalDisplay = 20;
        
        System.out.println("First 20 palindromic primes are\n");
        for(int i = 1; i <= totalDisplay; i++){
            if(palindromePrime(n)){
                if(i%displayPerLine == 0){
                    System.out.printf("%-4d \n",n);
                    n++;
                }
                else{
                   System.out.printf("%-4d ",n);
                   n++;
                }
            }
            else{
                //decrement if n is not a palindromic prime
                i--;
                n++;
            }            
        }
        
        System.out.println("");
        //n is set to 13 since emirp starts from 13
        n = 13;
        System.out.println("First 20 emirps are\n");
        for(int j = 1; j <= totalDisplay; j++){
            if(emirp(n)){
                if(j%displayPerLine == 0){
                    System.out.printf("%-4d \n",n);
                    n++;
                }
                else{
                   System.out.printf("%-4d ",n);
                   n++;
                }
            }
            else{
                //decrement if n is not a palindromic prime
                j--;
                n++;
            }            
        }
    }
    //method to determine a palindromic prime
    public static boolean palindromePrime(int p){        
        if(p == 2 || p == 3 || p == 5 || p == 7 || p == 11){
            return true;
        }    
        else{
            for(int i = 2; i < p; i++){
                if(p%i == 0)
                    return false;
            }
            //q is same as p but is used for calculations
            int q = p;
            //the reversed number
            int reversedNum = 0;                       
            while(q > 0){
                int modulo = q%10;
                q = q/10;
                reversedNum = reversedNum*10 + modulo;
            }
            return reversedNum == p;
        }        
    }
    
    //method to determine an emirp
    public static boolean emirp(int e){
        //if e is less than 13 means its not an emirp
        if(e < 13){
            return false;
        }
        else{
            //check if e is a prime number
            for(int a = 2; a < e; a++){
                if(e%a == 0)
                    return false;              
            }        
                    //reverse the number
                    int f = e;
                    int reversedNum = 0;
                    while(f > 0){
                        int modulo = f%10;
                         f = f/10;
                         reversedNum = reversedNum*10 + modulo;
                    }
                    if(reversedNum == e)
                        return false;
                    for(int g = 2; g < reversedNum; g++){
                        if(reversedNum%g == 0)
                            return false;
                    }     
                    return true;
        }     
    }
}
