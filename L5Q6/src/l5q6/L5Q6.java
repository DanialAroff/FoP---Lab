//Danial.A
package l5q6;

import java.util.Scanner;

public class L5Q6 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int row = in.nextInt();        
        System.out.println("The Pascal Triangle with " + row + " row(s)");
        System.out.println("");
        
        int pasc[][] = new int[row][row];
        int hold[] = new int[row];
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < row; j++){                
                if(j == 0){
                    pasc[i][j] = 1;
                    System.out.printf("%-5d",pasc[i][j]);
                }
                else if(j >= 1 && j < row-1 && j < i){
                    pasc[i][j] = hold[j]+hold[j-1];
                    System.out.printf("%-5d",pasc[i][j]);
                }
                else if(j == i){
                    pasc[i][j] = 1;
                    System.out.printf("%-5d",pasc[i][j]);
                }
                else{
                    int end = 0;
                    System.out.printf("%-5d",end);
                }    
            }
            System.out.println("");
            for(int x = 0; x < row; x++){
                hold[x] = pasc[i][x]; 
            }
        }
    }
    
}
