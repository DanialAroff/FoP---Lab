
package l8q2;

import java.util.Scanner;

public class L8Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankAccount bank = new BankAccount("Danial",980416,500.00);
        
        bank.deposit(1500.50);
        bank.withdraw(200.00);
        bank.getBalance();
        
    }
    
}
