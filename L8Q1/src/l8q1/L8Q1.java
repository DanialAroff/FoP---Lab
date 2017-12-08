
package l8q1;

public class L8Q1 {

    public static void main(String[] args) {
        
        Number n = new Number();
        
        System.out.println("Array of random integers");
        int[] item = n.getArrayOfItem();
        for(int i = 0; i<item.length;i++){
            System.out.printf("%4d ", item[i]);
        }
        System.out.println("");
        System.out.println("EVEN NUMBERS");
        for(int i = 0;i<item.length; i++){
            if(n.getEven(item[i])){
                System.out.printf("%4d ", item[i]);
            }
        }
        System.out.println("");
        System.out.println("PRIME NUMBERS");
        for(int i = 0;i<item.length; i++){
            if(n.getPrime(item[i])){
                System.out.printf("%4d ", item[i]);
            }
        }    
        System.out.println("");
        System.out.println("MAXIMUM NUMBERS");
        System.out.printf("%4d\n",n.getMax());
        System.out.println("MINIMUM NUMBERS");
        System.out.printf("%4d\n",n.getMin());
        System.out.println("AVERAGE");
        System.out.printf("%4.2f\n",n.getAverage());
        System.out.println("SQUARE NUMBERS");
        for(int i = 0;i<item.length; i++){
            if(n.getSquare(item[i])){
                System.out.printf("%4d ", item[i]);
            }
        }
        System.out.println("");
    }
    
}
