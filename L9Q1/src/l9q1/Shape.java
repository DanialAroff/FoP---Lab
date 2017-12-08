
package l9q1;

import java.util.Scanner;

public class Shape {
    
    protected String name;
    protected double perimeter;
    protected double area;
    
    public void setPerimeter(Scanner in){
        this.perimeter = in.nextDouble();
    }
    public void setArea(Scanner in){
        this.area = in.nextDouble();
    }
    public double getPerimeter(){
        return perimeter;
    }
    public double getArea(){
        return area;
    }
    
    public void display(){
        System.out.println(this.name+"\n");
        System.out.printf("Perimeter : "+this.perimeter);
        System.out.printf("Perimeter : "+this.area);
    }
    

}
class Circle extends Shape{
    
    public void
}
