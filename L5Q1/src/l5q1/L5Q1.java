//Danial.A
package l5q1;

import java.util.Random;
import java.util.Scanner;

public class L5Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Number of students: ");
        int N = in.nextInt();
        System.out.println("");
        
        int score[] = new int[N];
        int min = 101;
        int max = -1;
        int sum = 0;
        
        for(int i = 0; i < N; i++){
            score[i] = rand.nextInt(101);
            if(score[i]<min){
                min = score[i];
            }
            if(score[i]>max){
                max = score[i];
            }
            sum = sum + score[i];
                System.out.println(score[i]);
        }
        
        float ave = (float)sum/N;
        System.out.println();
        System.out.println("Highest score: " + max);
        System.out.println("Lowest score: " + min);
        System.out.print("Average score: ");
        System.out.printf("%.2f\n",ave);
    }
    
}
