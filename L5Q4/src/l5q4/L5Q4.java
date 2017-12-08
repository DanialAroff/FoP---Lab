
package l5q4;

public class L5Q4 {

    public static void main(String[] args) {
        /*
        Rotate by +90:

        1.Transpose
        2.Reverse each row
        
        Rotate by -90:
        Method 1 :

        1.Transpose
        2.Reverse each column
        */
        
        int matrix[][] = {{1,5,7},{3,6,9},{5,3,8}};
        System.out.println("3 by 3 matrix");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("After rotates 90 degrees clockwise");
        
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++) {
                if(i == 0){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[matrix.length-1][j];
                    matrix[matrix.length-1][j] = temp;  
                    System.out.print(matrix[j][i] + " ");
                }
                else{
                    System.out.print(matrix[j][i] + " ");
                }
                
            }
                System.out.println("");           
        }       
    }
    
}
