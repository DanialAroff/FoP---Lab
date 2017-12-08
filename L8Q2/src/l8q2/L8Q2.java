
package l8q2;

import java.util.Scanner;

public class L8Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankAccount bank = new BankAccount();
        int makeAcc;
        int go = 1;
        
        System.out.println("Opening a bank account\n");
        
        System.out.print("Enter your name : ");
        String name = in.nextLine();
        bank.setName(name);
        System.out.print("Enter your IC number : ");
        long no = in.nextLong();
        bank.setIC(no);
        System.out.print("Enter passport number : ");
        int pass = in.nextInt();
        bank.setPassport(pass);
        
        System.out.println("\n  Amount of deposit");
        System.out.print("RM ");
        double deposit = in.nextDouble();
        System.out.println("");
        bank.deposit(deposit);
        
        System.out.println("Continue? (press 1 to continue)");
        go = in.nextInt();
        System.out.println("");
        while(go == 1){            
            int choice;
            System.out.println("-----------------");
            System.out.println("DEPOSIT       (1)\n");            
            System.out.println("WITHDRAW      (2)\n");
            System.out.println("CHECK BALANCE (3)\n");
            System.out.println("EXIT          (0)");
            System.out.println("-----------------\n");
            choice = in.nextInt();
            System.out.println("");
            
            switch(choice){
                case 1:{
                    System.out.println("Amount of deposit");
                    System.out.print("RM ");
                    double amount = in.nextDouble();
                    System.out.println("");
                    bank.deposit(amount);
                    break;
                }
                case 2:{
                    System.out.println("Amount of withdrawal");
                    System.out.print("RM ");
                    double amount = in.nextDouble();
                    System.out.println("");
                    bank.withdraw(amount);
                    break;
                }
                case 3:{
                    System.out.println("Your balance");
                    System.out.printf("RM%.2f\n\n",bank.getBalance());
                    break;
                }
                case 0:{
                    break;
                }
                default:{
                    break;
                }
                       
            }
            System.out.println("Continue? (Press 1 to continue)");
            go = in.nextInt();
        }    
        
    }
    
}
