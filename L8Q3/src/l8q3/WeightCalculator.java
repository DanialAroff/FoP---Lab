
package l8q3;

import java.util.Scanner;

public class WeightCalculator {
    
    private int age;
    private int height;
    private double weight;
    
    public WeightCalculator(){
        
    }
    
    public void setAge(Scanner in){
        age = in.nextInt();
    }
    public void setHeight(Scanner in){
        height = in.nextInt();
    }
    public double getRecommendedWeight(){
        weight = (height-100+age/10)*0.9;
        return weight;
    }
    public void display(){
        System.out.println("Age : " + age);
        System.out.println("Height : " + height + "cm");
        System.out.println("\nRecommended weight : " + weight + "kg");
    }
}
