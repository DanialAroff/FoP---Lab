
package l6q1;
//Danial.A
public class L6Q1 {

    public static void main(String[] args) {
        
        System.out.println("The first 20 triangular numbers are\n");
        for(int x = 1; x <= 20; x++){
            if(x%10 == 0){
                System.out.printf("%-4d\n",getTriangular(x)); 
            }
            else
                System.out.printf("%-4d",getTriangular(x));
        }
    }
    //method to return a triangular number
    public static int getTriangular(int tri){  
        int sum = 0;
        for(int i = 1; i <= tri; i++){
            sum += i;
        }
        //System.out.println(sum);
        return sum;
    }
}
