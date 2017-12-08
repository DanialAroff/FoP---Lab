
package howto;
//Danial.A

public class RotateMatrix {

    public static void main(String[] args) {
        
        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        
        //ROTATE MATRIX +90 DEGREES
        //Transpose matrix     
        System.out.println("Transpose matrix");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                if((j+1)%matrix.length == 0){
                    System.out.println(matrix[j][i]+" ");
                }
                else
                    System.out.print(matrix[j][i]+" ");               
            }
        }        System.out.println("");
        //Swap 1st column with 3rd column
        System.out.println("Rotate matrix +90 degrees");
        for(int i = 0; i < matrix.length; i++){           
            for(int j = 0; j < matrix.length; j++){  
                if(j == 0){
                    int temp = matrix[j+2][i];      //================================================
                    matrix[j+2][i] = matrix[j][i];  //Transposing and swapping 1st column & 3rd column
                    matrix[j][i] = temp;            //================================================
                }    
                if((j+1)%matrix.length == 0)
                    System.out.println(matrix[j][i]+" ");
                else
                    System.out.print(matrix[j][i]+" ");
            }
        }
        System.out.println("");
//        for(int i = 0; i < matrix.length; i++){           
//            for(int j = 0; j < matrix.length; j++){  
//                if(j == 0){
//                    int temp = matrix[j+2][i];      //================================================
//                    matrix[j+2][i] = matrix[j][i];  //Transposing and swapping 1st column & 3rd columndd
//                    matrix[j][i] = temp;            //================================================
//                }    
//                if((j+1)%matrix.length == 0)
//                    System.out.println(matrix[j][i]+" ");
//                else
//                    System.out.print(matrix[j][i]+" ");
//            }
//        }
        
// Rotate by +90:
//
// Transpose
// Reverse each row

// Rotate by -90:
// Method 1 :
//
// Transpose
// Reverse each column
//
// Method 2 :
//
// Reverse each row
// Transpose

// Rotate by +180:
//
// Method 1: Rotate by +90 twice
// Method 2: Reverse each row and then reverse each column (Transpose)

// Rotate by -180:
//
// Method 1: Rotate by -90 twice
// Method 2: Reverse each column and then reverse each row
// Method 3: Rotate by +180 as they are same
        

    }
    
}
