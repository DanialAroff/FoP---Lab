
package l5q5;

import java.util.Random;
import java.util.Scanner;

public class L5Q5 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int arr[] = new int[20];
        int l_loops = 0;
        int b_loops = 0;
        
        System.out.println("A list of 20 random integer within 0 to 100");
        for(int c = 0; c < arr.length; c++){
            arr[c] = rand.nextInt(101);
            if(c < arr.length-1){
                System.out.print(arr[c] + ", ");                
            }
            else
                System.out.println(arr[c]);
        }
        System.out.println("");
        
        int n = arr.length;           
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] < arr[j]){    
                    int temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }
            }
            
        }    
        System.out.println("Array in descending order");
        for(int x = 0; x < arr.length; x++){
            if(x < n-1){
                System.out.print(arr[x]+", ");
            }
            else
                System.out.println(arr[x]);
        }
        
        System.out.println("");
        System.out.print("Enter a number to search: ");
        int search = in.nextInt();
        
        for(int s = 0; s < arr.length; s++){
            if(arr[s] == search){
                System.out.println(search + " found");
                l_loops++;
                break;
            }
            else{
                l_loops++;
            }
        }
        System.out.println("Linear Search - " + l_loops + " loop(s)");
        
        int low = 0;
        int high = arr.length-1;
        int middle;
        
        while(low <= high){
            middle = (low + high)/2;
            if(search == arr[middle]){
                System.out.println(search + " found");
                b_loops++;
                break;                
            }
            else if(search > arr[middle]){
                high = middle - 1;
                b_loops++;
            }
            else{
                low = middle + 1;
                b_loops++;
            }
        }
        System.out.println("Binary Search - " + b_loops + " loop(s)");
    }
    
}
