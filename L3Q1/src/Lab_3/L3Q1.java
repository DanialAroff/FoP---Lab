
package Lab_3;

import java.util.Scanner;

public class L3Q1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        String operand;
        
        System.out.print("Enter two integer number: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        System.out.print("Enter the operand: ");
        operand  = input.next();
        
        char op = operand.charAt(0);
        
        if (op == '+'){
            System.out.print(num1);
            System.out.print(" "+operand.charAt(0));
            System.out.print(" "+num2);
            System.out.println(" = " + (num1+num2));
        }
        
        if (op == '-'){
            System.out.print(num1);
            System.out.print(" "+operand.charAt(0));
            System.out.print(" "+num2);
            System.out.println(" = " + (num1-num2));    
        }        
        
        if (op == '/'){
            System.out.print(num1);
            System.out.print(" "+operand.charAt(0));
            System.out.print(" "+num2);
            System.out.println(" = " + (num1/num2));
        }    
        
        if (op == '*'){
            System.out.print(num1);
            System.out.print(" "+operand.charAt(0));
            System.out.print(" "+num2);
            System.out.println(" = " + (num1*num2));
        }    
        
        if (op == '%'){
            System.out.print(num1);
            System.out.print(" "+operand.charAt(0));
            System.out.print(" "+num2);
            System.out.println(" = " + (num1%num2));
        }    
        
                
            
    }
    
}
