
package l6q2;
//author---Danial.A
public class L6Q2 {

    public static void main(String[] args) {        
        //spacing
        int space = 10;
        
        for(int x = 1; x <=8; x++){
            for(int y = 1; y <= space; y++){
                System.out.print(" ");                
            }
            multiPrint(x, '\u29EB');
            System.out.println("");
            //decrease the spacing
            space--;
        }
        //increase spacing again to print the bottom part of the diamond
        space+=2;
        
        for(int m = 7; m >= 1; m--){
            for(int n = 1; n <= space; n++){
                System.out.print(" ");
            }
            multiPrint(m, '\u29EB');
            System.out.println("");
            space++;
        }    
        System.out.println("");
        
        //print triangle
        space  = 10;
        for(int x = 1; x <=11; x++){
            for(int y = 1; y <= space; y++){
                System.out.print(" ");                
            }
            multiPrint(x, '\u29EB');
            System.out.println("");
            //decrease the spacing
            space--;
        } 
    }
    
    //method to print characters
    public static void multiPrint(int n, char c){
        for(int i = 1; i <= n; i++){
            System.out.print(c+ " ");
        }
    }
    
}
