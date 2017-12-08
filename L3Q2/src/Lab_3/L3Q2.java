
package Lab_3;

import java.util.Random;

public class L3Q2 {

    public static void main(String[] args) {
        
        Random rand = new Random();
        
        int rnum;
        
        rnum = rand.nextInt(11)+20;
        
        switch (rnum){
            case 20:
                System.out.println("20 is twenty.");
                break;
            case 21:
                System.out.println("21 is twenty one.");
                break;
            case 22:
                System.out.println("22 is twenty two.");
                break;
            case 23:
                System.out.println("23 is twenty three.");
                break;
            case 24:
                System.out.println("24 is twenty four.");
                break;
            case 25:
                System.out.println("25 is twenty five.");
                break;
            case 26:
                System.out.println("26 is twenty six.");
                break;
            case 27:
                System.out.println("27 is twenty seven.");
                break;
            case 28:
                System.out.println("28 is twenty eight.");
                break;
            case 29:
                System.out.println("29 is twenty nine.");
                break;
            case 30:
                System.out.println("30 is thirty.");
                break;    
        }
    }
    
}
