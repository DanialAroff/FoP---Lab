
package l8q6;

import java.util.Random;

public class Burger {
    
    private int sold;
    private int eachSold[];
    private int ID[];
    private int stalls[];
    
    public Burger(){
        Random rnd = new Random();
        sold = 0;
        eachSold = new int[5];
        stalls = new int[5];
        ID = new int[5]; 
        
        for(int x = 0; x < stalls.length; x++){
            ID[x] = rnd.nextInt(99999)+1;
        }
        
    }
    public Burger(int totalStalls){
        Random rnd = new Random();
        sold = 0;
        this.eachSold = new int[totalStalls];
        this.stalls = new int[totalStalls];
        this.ID = new int[totalStalls]; 
        
        for(int x = 0; x < stalls.length; x++){
            ID[x] = rnd.nextInt(99999)+1;
        }
        
    }
    
    public void burgerSold(int sold){
        this.sold = this.sold + sold;
    }
    public void soldInOneStall(int i,int sold){        
        this.eachSold[i] = this.eachSold[i] + sold;
    }
    public int getTotalSold(){
        return this.sold;
    }
    public int[] getTotalSoldEachStall(){
        return this.eachSold;
    }
    public int getTotalSoldEachStall(int i){
        return this.eachSold[i];
    }
    public int[] getID(){
        return this.ID;
    }
    public int getID(int i){
        return this.ID[i];
    }
    
}
