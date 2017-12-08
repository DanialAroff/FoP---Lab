
package Lab_3;

import java.util.Scanner;

public class L3Q3 {

    public static void main(String[] args) {
        
        Scanner value = new Scanner(System.in);
        
        float sales;
        float c; //declaration for the commission 
        
        System.out.print("The sales volume: ");
        sales = value.nextFloat();
        
        if (sales <= 100){
            c = 0.05f*sales;
            System.out.print("The commission is ");
            System.out.printf("%.2f\n",c);    
        }
        
        else if (sales <= 500){
            c = 0.075f*sales;
            System.out.print("The commission is ");
            System.out.printf("%.2f\n",c);
        }       
        
        else if (sales <= 1000){
            c = 0.1f*sales;
            System.out.print("The commission is ");
            System.out.printf("%.2f\n",c);
        }
        
        else{
            c = 0.125f*sales;
            System.out.print("The commission is ");
            System.out.printf("%.2f\n",c);
        }       
    }
    
}
