
package l4q4;

import java.util.Scanner;

public class L4Q4 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int year, y, day, tdays;
        
        System.out.print("Enter year: ");
        year = y = in.nextInt();       
         /*
        LEAP YEAR
        -If the year is evenly divisible by 4 but not 100. year%4==0 && year%100!=0
        -If the year is evenly divisible by 4, 100 & 400.
        NOT A LEAP YEAR
        -If the year is not evenly divisible by 4.
        -If the year is evenly divisible by 4 & 100 but not 400.
        */         
        year = year%4;
         
        if(year == 0){
            year = year%100;
            if(year == 0){
                year = year%400;
                if(year == 0){
                    tdays = 366;
                }
                else
                    tdays = 365;
            }
            else
               tdays = 366;
        }            
        else
            tdays = 365;
            
        System.out.print("First day of the year: ");
        day = in.nextInt();
        
        int may = 5, aug = 8;
        
        for(int i = 1; i <= aug; i++){
            if(i == may){
                System.out.println("May " + y);
                System.out.println("Sun Mon Tue Wed Thu Fri Sat ");
                for(int d = 0; d<day; d++){
                    System.out.print("    ");
                }
                for(int n = 1; n<=31; n++){
                    System.out.printf("%-4d", n);
                    day++;
                    day = day%7;
                    if(day == 0)
                        System.out.println("");
                        
                }
                System.out.println("\n");
              
            }
            else if(i == aug){
                System.out.println("August " + y);
                System.out.println("Sun Mon Tue Wed Thu Fri Sat ");
                for(int d = 0; d<day; d++){
                    System.out.print("    ");
                }
                for(int n = 1; n<=31; n++){
                    System.out.printf("%-4d", n);
                    day++;
                    day = day%7;
                    if(day == 0){
                        System.out.println("");
                    }
                    
                }    
                System.out.println("");
            }    
            else if(i == 2){
                if(tdays == 365){
                    day = (day+28)%7;
                }
                else
                    day = (day+29)%7;
            }
            else if(i == 4 || i == 6){
                day = (day+30)%7;
            }
            else
                day = (day+31)%7;
            
        }
        
    }
    
}
