
package l8q4;

import java.util.Scanner;

public class L8Q4 {

    public static void main(String[] args) {
        
        Scanner in =  new Scanner(System.in);
        Fraction frac = new Fraction();
        
        System.out.print("Numerator = ");
        frac.setNumerator(in);
        System.out.print("Denominator = ");
        frac.setDenominator(in);
        System.out.println("");
        System.out.println(frac.getNumerator()+"/"+frac.getDenominator()+"\n");
        System.out.print("Reduced fraction = ");
        frac.simplest();
    }
    
}
