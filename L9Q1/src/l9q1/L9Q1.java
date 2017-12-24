
package l9q1;

import java.util.Scanner;

public class L9Q1 {

    public static void main(String[] args) {
        
        Rectangle rec = new Rectangle();
        Scanner in = new Scanner(System.in);        
        
        rec.setLength(in);
        rec.setWidth(in);
        rec.getPerimeter();
        rec.getArea();
        rec.display();
        System.out.println("");
        //System.out.println("Area of rectangle is "+rec.getArea()+"cm");
        
    }
    
}
