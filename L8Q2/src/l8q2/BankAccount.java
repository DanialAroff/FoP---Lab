
package l8q2;

public class BankAccount {
    
    private String name;
    private double balance;
    private double deposit;
    private int passportNo;
    
//    public BankAccount(){
//        this.balance = 0;
//        this.name = " ";
//    }
    public BankAccount(String name, int passportNo, double deposit){
        this.name = name;
        this.passportNo = passportNo;
        this.deposit = deposit;
    }
    
    public void deposit(double amount){
        balance =  balance + amount;
    }
    public void withdraw(double amount){
        balance = balance - amount;
    }
    public void getBalance(){
        System.out.println("Your balance is "+balance);
    }
}
