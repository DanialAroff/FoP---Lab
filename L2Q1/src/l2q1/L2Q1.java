/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2q1;

/**
 *
 * @author course009
 */
public class L2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float fahrenheit = 200;
        float celcius;
        
        celcius = ((fahrenheit - 32)/1.8f);
        
        System.out.printf("%.2f", celcius);
    }
    
}
