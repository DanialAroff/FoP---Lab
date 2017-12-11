
package l8q5;

import java.util.Random;
import java.util.Scanner;

public class Game {
    
    private String name;
    
   
    public Game(String name){
        this.name = name;
    }
    
    public int roll(){
        Random rand = new Random();
        int result = rand.nextInt(6)+1;
        
        return result;
    }
    public String getName(){
        return name;
    }
}
