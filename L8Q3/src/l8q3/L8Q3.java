
package l8q3;

import java.util.Scanner;

public class L8Q3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WeightCalculator w = new WeightCalculator();
        
        System.out.print("Age? ");
        w.setAge(in);
        System.out.print("Height? ");
        w.setHeight(in);
        System.out.println("");
        w.getRecommendedWeight();
        w.display();
    }
    
}
