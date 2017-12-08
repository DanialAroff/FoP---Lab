
package l8q1;

import java.util.Random;

public class Number {
    private int randomArray[] = null;
    private int size;
    Random rand = new Random();
    
    public Number(){
        int arr[] = new int[10];
        randomArray = arr;
        this.size = 10;
        for(int x = 0; x < arr.length; x++){
            arr[x] = rand.nextInt(101);
        }
    }
    public Number(int numberOfRandom){
        int arr[] = new int[numberOfRandom];
        randomArray = arr;
        size = numberOfRandom;
        for(int x = 0; x < arr.length; x++){
            arr[x] = rand.nextInt(101);
        }
    }
    public Number(int numberOfRandom, int range){
        int arr[] = new int[numberOfRandom];
        randomArray = arr;
        size = numberOfRandom;
        for(int x = 0; x < arr.length; x++){
            arr[x] = rand.nextInt(range+1);                      
        }
    }
    
    //to display all elements in randomArray
    public int[] getArrayOfItem(){                    
            int item[] = randomArray;
            return item;
    }
    //display even numbers in randomArray
    public boolean getEven(int check){
        return check%2 == 0;
    }
    //check if a number is prime or not
    public boolean getPrime(int i){
        for(int r = 2; r < i; r++){
            if(i%r == 0)
               return false;
        }
        return true;
    }
    //find max
    public int getMax(){
        int max = -1;
        for(int x = 0; x < randomArray.length; x++){
            if(randomArray[x]>max){
                max = randomArray[x];
            }
        }
        return max;
    }
    //find minimum
    public int getMin(){
        int min = randomArray[0];
        for(int x = 1; x < randomArray.length; x++){
            if(randomArray[x]<min){
                min = randomArray[x];
            }
        }
        return min;
    }
    //find average
    public float getAverage(){
        float sum = 0;
        for(int s = 0; s < randomArray.length; s++){
            sum = sum + randomArray[s];
        }
        float average = (float)sum/(float)size;
        return average;
    } 
    //find square numbers
    public boolean getSquare(int checkSquare){
        int sqrt;
        sqrt = (int) Math.sqrt(checkSquare);
        return sqrt*sqrt == checkSquare;
    }
}
