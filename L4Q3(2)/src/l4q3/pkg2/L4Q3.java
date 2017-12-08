
package l4q3.pkg2;

import java.util.Scanner;

public class L4Q3 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int score = 0, min = 0, max = 0, sum = 0, sumS = 0, n = 0;
        float average, v;
                
        System.out.print("Enter a score [negative score to quit]: ");
        score = in.nextInt();
           if (score < 0)
               System.exit(0);
           else{
               min = max = score;
           }
        sum = sum + score; 
        sumS = sumS + (score*score);
        n++;
              
        while (score >= 0){
            System.out.print("Enter a score [negative score to quit]: ");
            score = in.nextInt();
            
            if (score < 0)
                continue;
            if (score < min)
                min = score;
            if (score > max)
                max = score;
            n++;
            sum = sum + score;
            sumS = sumS + (score*score);
        }
        
        average = sum/(float)n;
        
        v = (sumS - (sum*sum/(float)n))/((float)n-1);
        float sd = (float) Math.sqrt(v);
        
        System.out.println("");
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.print("Average Score: ");
        System.out.printf("%.2f\n", average);
        System.out.print("Standard Deviation: ");
        System.out.printf("%.2f\n",sd);
    }
    
}
