
package l8q7;

public class money {
    
    private double amount;
    private final double RM100 = 100.00;
    private final double RM50 = 50.00;
    private final double RM10 = 10.00;
    private final double RM5 = 5.00;
    private final double RM1 = 1.00;
    private final double fiftycent = 0.50;
    private final double twentycent = 0.20;
    private final double tencent = 0.10;
    private final double fivecent = 0.05;
            
    public money(double amount){
        this.amount = amount;
        
    }
    
    public void getNotes(){
        
        int notes = (int)amount;
        int rm100 = notes/100;
        notes = notes%100;
        int rm50 = notes/50;
        notes = notes%50;
        int rm10 = notes/10;
        notes = notes%10;
        int rm5 = notes/5;
        notes = notes%5;
        int rm1 = notes;
        
        System.out.printf("%d RM100 notes, %d RM50 notes, %d RM10 notes, %d RM5 notes and %d RM1 notes",rm100,rm50,rm10,rm5,rm1);
    }
    public void add(){
        
    }
}
