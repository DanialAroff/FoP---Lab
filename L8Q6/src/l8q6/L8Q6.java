//unfinished
//corrections need to be done
package l8q6;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class L8Q6 {

    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat("00000");
        Scanner in = new Scanner(System.in);
        Burger B = new Burger();
        
        try{            
            System.out.println("Burger Stalls : \n");
            int i = 0;
            while(i>=0){
                if((B.getID(i))>=0 && (B.getID(i))<100000){
                    System.out.println("Stall "+(i+1)+" ID : "+dF.format(B.getID(i)));
                    i++;
                }
                else
                    break;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("");
        }
        int cont = 1;
        while(cont != 0){
            try{
                System.out.println("");
                System.out.println("ADD [1]   DISPLAY BURGERS SOLD [2]   EXIT [0]");   
                int choice = in.nextInt();
                System.out.println("");
                switch(choice){
                    case 0:{
                        break;
                    }
                    case 1:{
                        System.out.print("Stall :  ");
                        int no = in.nextInt();
                        System.out.println();
                
                        System.out.println("Stall "+no+"("+dF.format(B.getID(no-1))+")");
                        System.out.println("-----------------------------------");
                        System.out.print("Number of burgers sold : ");
                        int sell = in.nextInt();

                        B.soldInOneStall(no-1, sell);
                        B.burgerSold(sell);

                        System.out.println("Total burgers sold at stall "+no+" : "+B.getTotalSoldEachStall(no-1));
                        System.out.println("-----------------------------------");
                        break;
                    }
                    case 2:{
                        int[] eachsell = B.getTotalSoldEachStall();
                        String ID = "ID";
                        String sold = "Burger Sold";
                        System.out.printf("%5s%19s\n",ID,sold);
                        for(int x = 0; x < eachsell.length; x++){
                            System.out.printf("%s%11d burgers\n",dF.format(B.getID(x)),eachsell[x]);
                        }
                        System.out.println("\nTotal burgers sold : "+B.getTotalSold()+"\n");
                    }
                    default:
                        break;
                }
                                
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.print("ID not found");
            }catch (InputMismatchException e){
                System.out.println("Input does not match\n");    
                break;
            }
            try{
                System.out.print("[Enter 0 to quit] ");
                cont = in.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Input does not match\n");                
            }
            
        }    
    }
    
}
